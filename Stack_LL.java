import java.util.*;
class Stack_LL{
    class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
Node top;
    Stack_LL(){
        top=null;
    }

    void push(int data){
        Node newNode =new Node(data);

        if(top==null){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
        System.out.println(data+" pushed into stack");
    }
    int pop(){
        if(top==null){
            System.out.println("Stack underflow!");
            return -1;
        }
        else{
            top=top.next;
        }
        System.out.println(top.data+"Successfully Popped");
        return 0;
    }
    void display(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    void peek(){
         if(top==null){
            System.out.println("Stack Underflow");
        }
        System.out.println(top.data);
    }
    public static void main(String[] args){
        int d;
        Scanner sc= new Scanner(System.in);
        int choice;
        Stack_LL ob=new Stack_LL();
        do{
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    int data;
                    System.out.println("Enter data to push:");
                    data=sc.nextInt();
                    ob.push(data);
                    break;
                case 2:
                    ob.pop();
                    break;
                case 3:
                    ob.peek();
                    break;
                case 4:
                    ob.display();
                    break;
                case 5:
                    System.out.println("Exitting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
                


            }


        }while(choice <5);
        sc.close();
    }
}

