package lecture_note_15_16.name_stack;

public class NameStack {
    private Node topNode;

    public NameStack(){
        this.topNode = null;
    }

    public void push (String newname){
        Node newNode = new Node(newname);
        newNode.next = topNode;
        topNode = newNode;

    }

    public String pop(){
        String toReturn = topNode.name;
        topNode = topNode.next;

        return toReturn;
    }

    public String peek(){
        return topNode.name;
    }

    public boolean isEmpty(){
        return(topNode==null);
    }
}
