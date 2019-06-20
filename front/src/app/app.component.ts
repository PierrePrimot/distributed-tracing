import { Component, OnInit } from '@angular/core';

import { HWService } from './hwservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title;

  constructor(
    private hwService: HWService
  ) {
    this.hwService.getHW().subscribe((res) => this.title = res);
  }

  ngOnInit() {
  }
}
