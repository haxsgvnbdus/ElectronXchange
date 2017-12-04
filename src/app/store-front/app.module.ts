import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { MaterialModule } from './material.module';
import { routing } from './app.routing';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { DataTableModule } from 'angular2-datatable';
import { DataFilterPipe } from './components/product-list/data-filter.pipe';


import 'hammerjs';

import { LoginService } from './services/login.service';
import { UserService } from './services/user.service';
import { ProductService } from './services/product.service';
import { PaymentService } from './services/payment.service';
import { ShippingService } from './services/shipping.service';
import { CartService } from './services/cart.service';
import { OrderService } from './services/order.service';
import { CheckoutService } from './services/checkout.service';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { MyAccountComponent } from './components/my-account/my-account.component';
import { MyProfileComponent } from './components/my-profile/my-profile.component';
import { ProductListComponent } from './components/product-list/product-list.component';
import { ProductDetailComponent } from './components/product-detail/product-detail.component';
import { ShoppingCartComponent } from './components/shopping-cart/shopping-cart.component';
 

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavBarComponent,
    MyAccountComponent,
    MyProfileComponent,
    ProductListComponent,
    DataFilterPipe,
    ProductDetailComponent,
    ShoppingCartComponent
  ],
  imports: [
    BrowserModule,
    MaterialModule,
    routing,
    FormsModule,
    HttpModule,
    BrowserAnimationsModule,
    DataTableModule,
    
  ],
  providers: [
    LoginService,
    UserService,
    ProductService,
    CartService,
    PaymentService,
    ShippingService,
    OrderService,
    CheckoutService
    
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
