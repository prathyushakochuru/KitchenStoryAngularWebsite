import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ApiService } from '../api.service';
import { Product } from '../products.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  public products:any;
  private food:any;
  public name:string='';
  public desc: string='';
  public price: string='';

  constructor(private activatedRoute: ActivatedRoute,private apiService:ApiService, private router:Router) { }

  ngOnInit(): void {
    this.food = this.activatedRoute.params.subscribe(params=> {
      this.name= params['name'];
      this.desc= params['desc'];
      this.price=params['price'];
    })
  }

  gotoPayment()
  {
    this.router.navigate(['/payment',{price: this.price, name: this.name, desc:this.desc}]);
  }

}
