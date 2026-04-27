import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;

    void InsertAtBegining(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }

    void InsertAtEnd(int data){
        Node newNode=new Node(data);
        if(head ==null){
            head = newNode;
            return;
        }
        Node temp =head;
        while(temp.next !=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void delete(int key){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        Node prev=null;
        //Checks if first node Contains the key
        if(temp != null && temp.data == key){
            head=temp.next;
            return;
        }

        while( temp != null && temp.data != key){
            prev =temp;
            temp=temp.next;
        }
        if(temp ==null){
            return;
        }
        prev.next=temp.next;
    }
    boolean search(int key){
        Node temp =head;
        while(temp !=null){
            if(temp.data == key)
                return true;
            temp=temp.next;
        }
        return false;
    }

    void display(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
}
class LL{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        LinkedList list =new LinkedList();
        int choice,value;
        do{
            System.out.println("Linked List Operations");
            System.out.println("1.Insert at Begining");
            System.out.println("2.Insert At end");
            System.out.println("3.Display");
            System.out.println("4.Delete");
            System.out.println("5.exit");

            System.out.println("Enter the Choice:");
            choice=sc.nextInt();
        
            switch(choice){
                case 1:
                    System.out.println("Enter Value to Insert:");
                    value=sc.nextInt();
                    list.InsertAtBegining(value);
                    System.out.println(value+"Successfully Inserted");
                    break;
                case 2:
                    System.out.println("Enter Value to Insert:");
                    value=sc.nextInt();
                    list.InsertAtEnd(value);
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.println("Enter value to delete:");
                    value=sc.nextInt();
                    list.delete(value);
                    break;
                case 5:
                    System.out.println("Exitting..");
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
    
       
        }
    }while(choice < 5);
}
}