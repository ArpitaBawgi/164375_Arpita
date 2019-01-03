"use strict";
exports.__esModule = true;
var task = [];
var ToDo = /** @class */ (function () {
    function ToDo() {
    }
    // task:string[]=[];
    ToDo.prototype.addTask = function (tasks) {
        task[task.length] = tasks;
        console.log("\n====NEW TASK===" + "  " + "New task has been inserted : " + tasks + "\n");
    };
    ToDo.prototype.displayAllTask = function () {
        console.log("\n====This is displaying all the tasks: ==== " + "\n");
        for (var i = 0; i < task.length; i++) {
            console.log(task[i] + "\n");
        }
    };
    ToDo.prototype.deleteTask = function (del) {
        for (var index = 0; index <= task.length; index++) {
            //console.log(task.length)
            if (task[index] == del) {
                console.log("\n====remove TASK===" + "\n" + "Task has been removed :" + task[index]);
                task.splice(index, 1);
                console.log("\n");
                break;
            }
        }
    };
    return ToDo;
}());
//var Arraylist=new Arraylist;
var obj = new ToDo();
obj.addTask("Buy Eggs");
obj.addTask("Go to Market");
obj.addTask("Start working with typeScript");
obj.addTask("Mallika");
obj.deleteTask("Go to Market");
obj.deleteTask("Mallika");
obj.displayAllTask();
