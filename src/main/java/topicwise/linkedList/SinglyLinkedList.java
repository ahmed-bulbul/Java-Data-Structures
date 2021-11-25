package topicwise.linkedList;

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data; // Generic Type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public int length(){
        if(head == null){
            return 0;
        }
        int count =0;
        ListNode current = head;
        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void insertAtHead(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);

        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(   11);

        // now we will connect them together to form a chain
        sll.head.next = second; // 10 --> 1
        second.next = third; // 10--> 1 --> 8
        third.next = fourth; // 10--> 1 --> 8 -->11 -->null

        // now we will display the chain
        sll.display();
        System.out.println("\nLength of the chain is: " + sll.length());

        System.out.println("\nInserting at head");
        sll.insertAtHead(3);
        sll.display();
        System.out.println("\nInserting at tail");
        sll.insertAtTail(12);
        sll.display();

    }
}
