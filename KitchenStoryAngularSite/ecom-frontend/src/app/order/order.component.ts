import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  public randomNum: number=0;

  constructor() { }

  ngOnInit(): void {
    this.randomNum = Math.random();
  }

  
}
