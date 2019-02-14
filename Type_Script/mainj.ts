import { TodoInterface,TodoListInterface }from  './interfaces';

export class ToDoItem implements TodoInterface{
     title: string; 
     status: boolean;
     upadatedAt: Date;

     constructor(title:string){
this.title=title;
this.status=false;
this.upadatedAt=new Date();
     }

    toggleStatus() {
       if(this.status==true){
        this.status=false;
       }
       else {
       this.status=true;
    }
}
}

class TodoList implements TodoListInterface{
    TodoItems: Todo[]= new Array(); 
       addTask(task:TodoList) {
        
      this.TodoItems.push(task) ;
    }
    listAllTasks() {
        console.log(this.TodoItems);
    }
    deleteTask(task:Todo) {
        var len=this.TodoItems.indexOf(task,0);
        if(len>-1){
           var removed= this.TodoItems.splice(len,1);
           return "number of elements "+this.TodoItems.length+" removed:"+removed;
        }
        else{
            console.log("Pass correct values!!!!!");
        }
    }


}
var obj=new TodoList();
var todoObj=new Todo("start assignments");
var todoobj1=new Todo("fkgjhcomplete assignment at");
obj.addTask(todoObj);
obj.addTask(todoobj1);
obj.listAllTasks();
console.log(obj.deleteTask(todoObj));
obj.listAllTasks();
console.log("==================")
var obj=new TodoList();
var todoObj=new Todo("start assignments");
var todoobj1=new Todo("fkgjhcomplete assignment at");
obj.addTask(todoObj);
obj.addTask(todoobj1);
obj.listAllTasks();
console.log(obj.deleteTask(todoObj));
obj.listAllTasks();
console.log("==================")


