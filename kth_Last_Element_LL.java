import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class kth_Last_Element_LL {
    
  public static void  print_Kth_Last_Element_In_LL(Node head,int kth){
        Node slow = head;
        Node fast = head;

        // Move fast k nodes into the list
        for (int i = 0; i < kth; i++) {
            if (fast == null) {
                System.out.println("Invalid kth value");
                return;
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // slow will now be at the kth to the last element
        if (slow != null) {
            System.out.println("Kth to the last element: " + slow.data);
        } else {
            System.out.println("Invalid k value");
        }
    
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your query running  time");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter the number you want to add in linked list");
            int n = sc.nextInt();
            
            Node head = new Node(sc.nextInt());
            Node currentHead = head;
            for (int i = 1; i < n; i++) {
                Node newDataNode = new Node(sc.nextInt());
                currentHead.next = newDataNode;
                currentHead = newDataNode;
            }
            // print_LinkedList(head);
            System.out.println("Enter you kth number");
            int k=sc.nextInt();
            print_Kth_Last_Element_In_LL(head,k);

            q--;
        }
    }
}

