import java.util.*;
class MyStack{
    int arr[];
    int size;
    int top;

    MyStack(int s){
        size=s;
        arr=new int[size];
        top=-1;

    }
    public void push(int data){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top]=data;
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }
    public int peek(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty(){
        if(top>=0){
            return false;
        }
        return true;
    }
     public boolean isFull(){
        if(top==-1){
            return false;
        }
        return true;
    }

}
class MyClass{
    public static void main(String[] args){
        MyStack Stack=new MyStack(5);
        Stack.push(110);
        Stack.push(120);
        Stack.push(130);
        Stack.push(140);
        Stack.push(150);
        System.out.println("Is Empty:"+Stack.isEmpty());
        System.out.println("Is Full:"+Stack.isFull());
        System.out.println("Top Element:"+Stack.peek());
        System.out.println("Deleted element:"+Stack.pop());
        System.out.println("Top Element:"+Stack.peek());
        System.out.println("IS Full:"+Stack.isFull());
        
    }
}