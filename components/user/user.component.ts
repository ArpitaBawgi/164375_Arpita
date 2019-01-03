import { Component, OnInit } from '@angular/core';
//import { getMaxListeners } from 'cluster';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

   name:String;
   age:number;
   email:string;
   address:address;
   hobbies:string[];

  constructor() { 
    console.log("Constructor has started");
  }

  ngOnInit() {
    console.log("Method has started...."+"\n");
     this.name="ABC",
     this.age=14,
     this.email="abc@gmail.com",
     this.address={
       state:"Karnataka",
       city:"B'lore",
       street:"kcolony"
     };
     this.hobbies=["sing","dance","eat"]
  };
  }

interface address{
  state:string
  city:string
  street:string
}