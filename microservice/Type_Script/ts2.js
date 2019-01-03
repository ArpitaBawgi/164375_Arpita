var Circle = /** @class */ (function () {
    function Circle(color, radius) {
        this.color = color;
        this.radius = radius;
    }
    Circle.prototype.area = function () {
        return 3.14 * this.radius * this.radius;
    };
    Circle.prototype.toString = function () {
        console.log("Colour is:" + this.color + ", Area of circle:  " + this.area());
    };
    return Circle;
}());
var circle = new Circle("Red", 5);
console.log(circle.area());
circle.toString();
var Rectangle = /** @class */ (function () {
    function Rectangle(color, height, width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }
    Rectangle.prototype.area = function () {
        return this.height * this.width;
    };
    Rectangle.prototype.toString = function () {
        console.log("Colour is:" + this.color + ", " + this.area() + " - Rectangle");
    };
    return Rectangle;
}());
var rect = new Rectangle("Green", 12, 10);
rect.area();
rect.toString();
