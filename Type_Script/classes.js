"use strict";
exports.__esModule = true;
var Person = /** @class */ (function () {
    function Person(fname, lname) {
        this.fname = fname;
        this.lname = lname;
    }
    Person.prototype.getfullName = function () {
        return this.fname + " " + this.lname;
    };
    return Person;
}());
exports.Person = Person;
var aPerson = new Person("Arpita", "B");
console.log(aPerson.getfullName());
