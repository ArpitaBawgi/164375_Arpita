"use strict";
exports.__esModule = true;
var ToDoItem = /** @class */ (function () {
    //toggleStatus:boolean
    function ToDoItem(title) {
        this.title = title;
        this.status = false;
        this.updatedAt = new Date();
        // this.toggleStatus=toggleStatus
    }
    return ToDoItem;
}());
exports.ToDoItem = ToDoItem;
var TodoList = /** @class */ (function () {
    function TodoList() {
        this.TodoItems = new Array();
    }
    TodoList.prototype.addTask = function (tasks) {
        console.log(this.TodoItems.push(tasks));
    };
    TodoList.prototype.displayAllTask = function () {
        console.log(this.TodoItems);
    };
    TodoList.prototype.deleteTask = function (del) {
        var len = this.TodoItems.indexOf(del, 0);
        if (len > -1) {
            var removed = this.TodoItems.splice(len, 1);
            return "number of elements " + this.TodoItems.length + " removed:" + removed;
        }
        else {
            console.log("Pass correct values!!!!!");
        }
    };
    return TodoList;
}());
var obj = new ToDoItem("buy eggs");
var item = new ToDoItem("eat eggs");
var obj1 = new TodoList();
obj1.addTask(obj);
obj1.addTask(item);
obj1.deleteTask(item);
obj1.displayAllTask();
/*  obj.addTask("Buy Eggs");
 obj.addTask("Go to Market");
 obj.addTask("Start working with typeScript");
 obj.addTask("Mallika");
 
 obj.deleteTask("Go to Market");
 obj.deleteTask("Mallika");
 
 obj.displayAllTask(); */ 
