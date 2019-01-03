"use strict";
exports.__esModule = true;
var ToDoItem = /** @class */ (function () {
    //toggleStatus:boolean
    function ToDoItem(title, status) {
        this.title = title;
        this.status = false;
        // this.toggleStatus=toggleStatus
    }
    return ToDoItem;
}());
exports.ToDoItem = ToDoItem;
var TodoList = /** @class */ (function () {
    function TodoList() {
    }
    TodoList.prototype.addTask = function (tasks) {
        this.TodoItems.push();
        //task[task.length]=tasks;
        console.log("\n====NEW TASK===" + "  " + "New task has been inserted : " + tasks + "\n");
    };
    TodoList.prototype.displayAllTask = function () {
        console.log("\n====This is displaying all the tasks: ==== " + "\n");
        console.log(this.TodoItems);
        /* for(var i=0; i<ToDoItem.length; i++){
            console.log(ToDoItem[i]+"\n");
            
        } */
    };
    TodoList.prototype.deleteTask = function (del) {
        for (var index = 0; index <= ToDoItem.length; index++) {
            //console.log(task.length)
            if (ToDoItem[index] == del) {
                console.log("\n====remove TASK===" + "\n" + "Task has been removed :" + ToDoItem[index]);
                this.TodoItems.splice(index, 1);
                console.log("\n");
                break;
            }
        }
    };
    return TodoList;
}());
exports.TodoList = TodoList;
