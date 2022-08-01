import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Book } from '../product-list/model/Book';

@Injectable({
  providedIn: 'root'
})
export class BookstoreService {
  apiUrl = "https://sheet.best/api/sheets/c169f395-9a12-4eda-8813-3504f0201b9c";
  httpOptions = {
    headers: new HttpHeaders({'content-type': 'application/json'})
  }

  constructor(private httpClient: HttpClient) { }

  getBooks(): Observable<Book[]> {
    return this.httpClient.get<Book[]>(this.apiUrl, this.httpOptions);
  }
}
