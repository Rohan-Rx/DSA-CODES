class DLL{
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    } 
}
Node head;
public void insert(int data){
    Node newNode=new Node(data);
    if(head == null){
        head=newNode;
    }
    System.out.println("HEAD: "+head );

}
public void insertAtEnd(int data){
    Node newNode= new Node(data);
    if(head  == null){
        head=newNode;
    }
    head.next=newNode;
    newNode.prev=head;
}
public void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.print("NULL");
}
public static void main(String[] arg){
    
    DLL ob= new DLL();
    ob.insert(10);
    ob.insertAtEnd(20);
    ob.display();
}
}
