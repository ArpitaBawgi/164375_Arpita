import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = ' Welcome to Bangalore...!';
  fname="Arpita";
  lname="Bawgi";
  favourites:  Address_sneha={
  favcolor:"Black",
  favfood:"Pizza",
  favnum:7
};
}

class Address_sneha{
  favcolor:string;
  favfood:string;
  favnum:number;
}