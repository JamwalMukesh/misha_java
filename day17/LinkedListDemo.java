import java.util.*;

// In C, C++ we are using Node as structure but in Java there is no structure. So we are using class.
class Node {
    int info;
    Node link; // Here link is a reference variable of Node type and capable to hold the
               // reference of Node class object
}

class LinkList {
    private Node start; // Here start represent first node of Link List

    // Below is a definition of default constructor
    LinkList() {
        start = null; // It represent Empty Link List
    }

    // Add a new node in beginning of Link List
    void addNodeAtBeginning(int item) {
        Node newnode = new Node();
        newnode.info = item;
        newnode.link = start;
        start = newnode;
        System.out.println("New Node is added at beginning of the Link List ");
    }

    // Traverse the Link List
    void traverse() {
        System.out.print(" Linked List contents: ");
        String output = "";
        if (start == null) {
            output = "EMPTY LIST";
        } else {
            Node ptr = start;
            while (ptr != null) {
                output += "[" + ptr.info + "] ";
                ptr = ptr.link;
            }
        }
        System.out.println(output);
    }

}

class LinkedListDemo {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        int item, choice;
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        while (running) {
            System.out.println("Press 1 For add New Node at beginning in Linked List ");
            System.out.println("Press 2 For traversing the Linked List ");
            System.out.println("Press 3 For Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter new item: ");
                    item = sc.nextInt();
                    list.addNodeAtBeginning(item);
                    break;
                case 2:
                    list.traverse();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("INvalid choice try again");
                    break;
            }
        }
    }
}
