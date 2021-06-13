import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../api.service';
import { Product } from '../products.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-userproducts',
  templateUrl: './userproducts.component.html',
  styleUrls: ['./userproducts.component.css']
})
export class UserproductsComponent implements OnInit {
  public products:any
  strsearch!: string;
  private stringsearch: any;
  private search: string = '';

  constructor(private activatedRoute: ActivatedRoute,private apiService:ApiService, private router:Router) { }

  ngOnInit(): void {
    this.stringsearch = this.activatedRoute.params.subscribe(params=> {
      this.strsearch = params['strsearch'];
      this.search= this.strsearch;
      this.getByName(this.search);
    })
    
  }
  getByName(search: string)
  {
    this.apiService.getProductsByName(search).subscribe(res=>{
      this.products = res;
    });
  }
  addtoCart(products:Product)
  
  {

    this.router.navigate(['/cart',{name: products.productname, desc: products.description, price: products.price}]);

  }

}
