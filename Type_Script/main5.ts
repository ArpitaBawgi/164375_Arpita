import {TodoInterface,TodoListInterface} from './Interfaces'

export class ToDoItem implements TodoInterface{
    //toggleStatus: boolean;
    title:string
    status:boolean
    updatedAt:Date
    //toggleStatus:boolean

     constructor(title:string){
            this.title=title
            this.status=false
            this.updatedAt=new Date()
            
           // this.toggleStatus=toggleStatus
        }

       
    }

 class TodoList implements TodoListInterface{
        
         
         TodoItems: ToDoItem[]= new Array();

         addTask(tasks:ToDoItem){
    
        console.log(this.TodoItems.push(tasks));
        }
        
       
            displayAllTask(){
                console.log(this.TodoItems)
             
            }

            deleteTask(del:ToDoItem){
                var len=this.TodoItems.indexOf(del,0);
        if(len>-1){
           var removed= this.TodoItems.splice(len,1);
           return "number of elements "+this.TodoItems.length+" removed:"+removed;
        }
        else{
            console.log("Pass correct values!!!!!");
        }
    }
   
    }

    var obj=new ToDoItem("buy eggs");
    var item=new ToDoItem("eat eggs");
    var obj1=new TodoList();
    obj1.addTask(obj)
 obj1.addTask(item)
 obj1.deleteTask(item)
    obj1.displayAllTask()



   /*  obj.addTask("Buy Eggs");
    obj.addTask("Go to Market");
    obj.addTask("Start working with typeScript");
    obj.addTask("Mallika");
    
    obj.deleteTask("Go to Market");
    obj.deleteTask("Mallika");
    
    obj.displayAllTask(); */