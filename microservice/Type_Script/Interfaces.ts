import {ToDoItem} from './main5'

export interface TodoInterface{
     title:string
     status:boolean
     updatedAt:Date
     //toggleStatus:boolean

}

export interface TodoListInterface{
    TodoItems : ToDoItem[]
    addTask(tasks:ToDoItem)
    displayAllTask()
    deleteTask(del:ToDoItem)
}