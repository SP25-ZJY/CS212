package lecture_note_15_16.linked_list;

public class IntLinkedList {
    private Node head;

    public IntLinkedList(){
        this.head = null;
    }

    public void insert(int n){
        Node newNode = new Node(n);

        if(head == null) {
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public String toString(){
        Node current = head;
        String result = new String("head-->");
        while(current!= null){
            result = result + current.n + "-->";
            current = current.next;
        }
        return result;
    }


    boolean delete(int number){
        Node current = head;
        Node previous = null;
        while(current != null) {
            if(current.n == number)
                break;
            previous = current;
            current = current.next;
        }

        //number is not in the list
        if (current == null){
            return false;
        }
        //yes, found the number
        else{
            //number is not the first node
            if (previous != null)
                previous.next = current.next;
            //item is the first node, need to change head
            else
                head = head.next;
            return true;
        }
    }

}
