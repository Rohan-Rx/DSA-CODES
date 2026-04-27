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
        System.out.println(data + " Pushed Successfully!");
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
    public void display(){
        if(top==-1){
            System.out.println("Stack Underflow!.");
        }
       for(int i= top; i>=0; i--){
            System.out.println(arr[i]);
       }
        
    }
    // public boolean isEmpty(){
    //     if(top>=0){
    //         return false;
    //     }
    //     return true;
    // }
    //  public boolean isFull(){
    //     if(top==-1){
    //         return false;
    //     }
    //     return true;
    // }

}
class Stack{
   
    public static void main(String[] args){
        
        int size;
        int x;
        int operation;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of stack:");
        size=sc.nextInt();
        MyStack ob1=new MyStack(size);
       
        do{
            
        System.out.println("Stack Operations");
        System.out.println("1.PUSH");
        System.out.println("2.POP");
        System.out.println("3.PEEK");
        System.out.println("4.Display");
        System.out.println("5.Exit");
        System.out.println("Enter the operation:");
        operation=sc.nextInt();
     
        switch(operation){
            case 1:
                int data;
                System.out.println("Enter data to push:");
                data=sc.nextInt();
                ob1.push(data);
                break;
            case 2:
               System.out.println("Popped:"+ob1.pop());
                break;
            case 3:
                System.out.println("Top: "+ob1.peek());
                break;
            case 4:
                System.out.println("Elements of Stack: ");
                ob1.display();
                break;
            case 5:
                System.out.println("Exitting...");
            default:
                System.out.println("Invalid Operation");
                break;
    
       

            
    }

        }while(operation < 5);
        
    }

}