package lecture_note_15_16.name_stack;

public class Node {
    //data
    public String name;
    // reference to the next node
    public Node next;


    public Node (){
        this.name = null;
        this.next = null;
    }

    public Node (String name){
        this.name = name;
        this.next = null;
    }
}
