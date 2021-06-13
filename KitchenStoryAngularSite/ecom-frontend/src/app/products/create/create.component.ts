import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators, FormControl } from '@angular/forms';
import { ApiService } from 'src/app/api.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  public productForm :FormGroup;
  public submitted: boolean = false;
  
  constructor(private formBuilder:FormBuilder, private apiService :ApiService,
    private router:Router) { 
    // initiate a form
    this.productForm = this.formBuilder.group({
      name : ['',[Validators.required, Validators.minLength(2), Validators.maxLength(16)]],
      description :['',[Validators.required, Validators.minLength(2), Validators.maxLength(16)]],
      price :['',Validators.required]
    });

  }

  public hasError(field:any){
    return (this.productForm.get(field)?.invalid && this.productForm.get(field)?.touched 
    && this.productForm?.get(field)?.errors);
  }

  ngOnInit(): void {

  }

  public submitForm(form:any){
    if(form.valid){
      this.submitted = true;
      // console.log(this.productForm.value);
      // create prouct
      this.apiService.addProduct(this.productForm.value).subscribe(res=>{
        console.log("Product is created sucessfully !");
        this.router.navigateByUrl("/products");    
      })
      
    } else {
      this.validateForm(form);
    }
  }

  private validateForm(form:any) {
    Object.keys(form.controls).forEach(field=>{
     const control =  form.get(field);
     if(control instanceof FormControl){
      control.markAsTouched({ onlySelf : true});
     } else{
      this.validateForm(control);
     }     
    });
  }

  // get methods
  get f(){ return this.productForm.controls;}


}
