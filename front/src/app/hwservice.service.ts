import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class HWService {

  constructor(
    private http: HttpClient
  ) { }

  getHW() {
    //return this.http.get('/assets/hwdata.json');
    return this.http.get('http://localhost:8080/greeting');
  }

}
