export class Person{
    fname: string;
    lname:string;

    constructor(fname:string, lname:string){
        this.fname=fname;
        this.lname=lname;
    }
getfullName(){
    return this.fname+" " +this.lname;
}
}
var aPerson= new Person("Arpita","B");
console.log(aPerson.getfullName());
