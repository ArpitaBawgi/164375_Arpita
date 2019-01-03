import {TodoInterface,TodoListInterface} from './Interfaces'

export class ToDoItem implements TodoInterface{
    toggleStatus: boolean;
    title:string
    status:boolean
    updatedAt:Date
    //toggleStatus:boolean

     constructor(title:string, status:boolean){
            this.title=title
            this.status=false
            
           // this.toggleStatus=toggleStatus
        }

       /*  toggleStatus(status:boolean){
            if(this.status==false){
                return this.status=true;
            }
            else{
                return this.status=false;
            }
        } */
    }

    export class TodoList implements TodoListInterface{
        
         //task:string[]=[];
         TodoItems: ToDoItem[];

            addTask(tasks:string):void{
                this.TodoItems.push();
                //task[task.length]=tasks;
            console.log("\n====NEW TASK===" +"  "+"New task has been inserted : "+tasks+"\n")
            }
        
       
            displayAllTask():void{
                console.log("\n====This is displaying all the tasks: ==== "+"\n")
                console.log(this.TodoItems)
                /* for(var i=0; i<ToDoItem.length; i++){
                    console.log(ToDoItem[i]+"\n");
                    
                } */
            }

            deleteTask(del:string):void{
                for(var index=0;index<=ToDoItem.length;index++){
                    //console.log(task.length)
                    if(ToDoItem[index]==del){
                        console.log("\n====remove TASK==="+"\n"+"Task has been removed :" +ToDoItem[index])
                        this.TodoItems.splice(index,1);
                        console.log("\n")
                        break;
                        
                    }
                }
            }
   
    }

