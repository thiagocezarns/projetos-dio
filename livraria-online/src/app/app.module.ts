import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './components/shared/header/header.component';
import { FooterComponent } from './components/shared/footer/footer.component';
import { NavbarComponent } from './components/shared/navbar/navbar.component';
import { BookstoreComponent } from './components/bookstore/bookstore.component';
import { FiltersComponent } from './components/bookstore/filters/filters.component';
import { ProductListComponent } from './components/bookstore/product-list/product-list.component';
import { ProductItemComponent } from './components/bookstore/product-list/product-item/product-item.component';
import { HttpClientModule } from '@angular/common/http';
import { BookstoreService } from './components/bookstore/service/bookstore.service';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    NavbarComponent,
    BookstoreComponent,
    FiltersComponent,
    ProductListComponent,
    ProductItemComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [BookstoreService],
  bootstrap: [AppComponent]
})
export class AppModule { }
