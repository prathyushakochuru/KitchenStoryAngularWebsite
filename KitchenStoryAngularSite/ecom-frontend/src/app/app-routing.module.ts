import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AdminComponent } from './admin/admin.component';
import { CartComponent } from './cart/cart.component';
import { MenuComponent } from './menu/menu.component';
import { OrderComponent } from './order/order.component';
import { PaymentComponent } from './payment/payment.component';
import { CreateComponent } from './products/create/create.component';
import { ProductsComponent } from './products/products.component';
import { UserproductsComponent } from './userproducts/userproducts.component';

const routes: Routes = [
  {path:'aboutus' , component: AboutusComponent},
  {path:'admin' , component: AdminComponent},
  {path:'menu', component:MenuComponent},
  {path:'cart', component:CartComponent},
  {path:'payment', component:PaymentComponent},
  {path:'order', component:OrderComponent},
  {path:'userprods', component:UserproductsComponent},
  {path:'products', children:[
  { path:'', component:ProductsComponent },
  { path:'create', component:CreateComponent }]}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
