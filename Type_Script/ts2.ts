interface Shape{
    color:string
     area():number;
     toString()
}

class Circle implements Shape{

    color:string
    radius:number
    constructor(color:string,radius:number){
        this.color=color;
        this.radius=radius;
    }

    area():number{
        return 3.14*this.radius*this.radius;
    }
    toString(){
        console.log("Colour is:"+this.color+", Area of circle:  "+this.area());
    }
}

var circle=new Circle("Red",5)
console.log(circle.area());
circle.toString();

 class Rectangle implements Shape{
    color:string
 height:number;
 width:number;
 
 constructor(color:string,height:number,width:number){
      this.color=color
     this.height=height;
     this.width=width;
 }

 area():number{
     return this.height*this.width
 }

 toString(){
    console.log("Colour is:"+this.color+", "+this.area()+" - Rectangle");
}
} 

var rect=new Rectangle("Green",12,10)
rect.area()
rect.toString()