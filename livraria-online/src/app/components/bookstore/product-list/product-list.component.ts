import { Component, OnInit } from '@angular/core';
import { Book } from './model/Book';
import { BookstoreService } from '../service/bookstore.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  
    books: Array<Book> = [];

  constructor(private bookStoreService: BookstoreService) {}

  ngOnInit(): void {
    this.getBooks();
  }

  getBooks(): void {
    this.bookStoreService.getBooks().subscribe(data => {
      this.books = data;
    });
  }

}
