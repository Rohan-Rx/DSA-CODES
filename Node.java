 class Node{                //user defined datatype
    int data;
    Node next;
    
    Node(int data){
        this.data=data;     //Data Part
        this.next=null;     //Refference to next node
    }
   
}

class Linkedl{
    public static void main(String a[]){
        Node n1= new Node(10);
        Node n2=new Node(20);
        n1.next=n2;
        System.out.println("First Node data:" +n1.data);
        System.out.println("First Node Next:" +n1.next);
        System.out.println("Second Node data:" +n2.data);
        System.out.println("Second Node Next:" +n2.next);

    }
}