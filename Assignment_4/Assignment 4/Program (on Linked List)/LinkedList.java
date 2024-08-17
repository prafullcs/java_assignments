package assignment4;   

//part2_program_of_linkedlist

public class LinkedList {
    private Node head;

    LinkedList() {
        this.setHead(null);
    }

// Insert at the beginning

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = getHead();
        setHead(newNode);
    }

 // Insert at given position

    void insertAtPosition(int data, int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = getHead();
            setHead(newNode);
            return;
        }

        Node temp = getHead();
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

// Insert after a given node
    void insertAfterNode(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

 // Delete at the beginning
    void deleteAtBeginning() {
        if (getHead() == null) {
            System.out.println("List is empty");
            return;
        }

        setHead(getHead().next);
    }

// Delete at given position
    void deleteAtPosition(int position) {
        if (position <= 0 || getHead() == null) {
            System.out.println("Invalid position or empty list");
            return;
        }

        if (position == 1) {
            setHead(getHead().next);
            return;
        }

        Node temp = getHead();
        Node prev = null;
        for (int i = 1; i < position && temp != null; i++) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        prev.next = temp.next;
    }
// Delete after a given node
    void deleteAfterNode(Node prevNode) {
        if (prevNode == null || prevNode.next == null) {
            System.out.println("Previous node cannot be null or last node");
            return;
        }

        prevNode.next = prevNode.next.next;
    }

 // Reverse the linked list
    void reverse() {
        Node prev = null;
        Node current = getHead();
        Node nextNode = null;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        setHead(prev);
    }

// Display the linked list
    void display() {
        Node temp = getHead();
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
}
