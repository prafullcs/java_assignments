package assignment4;     

//part3_program_of_linkedlist

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtBeginning(5);
        list.insertAtBeginning(3);
        list.insertAtBeginning(1);
        list.display(); 
        
        list.insertAtPosition(4, 2);
        list.display(); 
        
        Node node = list.getHead().next;
        list.insertAfterNode(node, 6);
        list.display(); 
        
        list.deleteAtBeginning();
        list.display(); 
        list.deleteAtPosition(3);
        list.display(); 
        list.deleteAfterNode(node);
        list.display(); 
        
        list.reverse();
        list.display(); 
    }
}
