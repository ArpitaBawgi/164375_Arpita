var task:string[]=[];
//task=["Bring eggs","Go to Market","call sneha"]
//console.log(task[0]);

class Arraylist{
    addTask(tasks:string):void{
        task[task.length]=tasks;
    console.log("\n====NEW TASK===" +"  "+"New task has been inserted : "+tasks+"\n")
    }

    deleteTask(del:string):void{
        for(var index=0;index<=task.length;index++){
            //console.log(task.length)
            if(task[index]==del){
                console.log("\n====remove TASK==="+"\n"+"Task has been removed :" +task[index])
                task.splice(index,1);
                console.log("\n")
                break;
                
            }
        }
    }

    /*deleteSpecific(del:number):void{
        array.forEach(element => {
            
        });*/

        
    


displayAllTask():void{
    //console.log(this.task[])
    console.log("\n====This is displaying all the tasks: ==== "+"\n")
   for(var i=0; i<task.length; i++){
        console.log(task[i]+"\n"); 
        
    }
  }
}

var obj=new Arraylist();
obj.addTask("Buy Eggs");
obj.addTask("Go to Market");
obj.addTask("Start working with typeScript");
obj.addTask("Mallika");

obj.deleteTask("Go to Market");
obj.deleteTask("Mallika");

obj.displayAllTask();
//obj.displayAllTask();