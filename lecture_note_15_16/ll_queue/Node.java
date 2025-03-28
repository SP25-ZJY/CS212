package lecture_note_15_16.ll_queue;

public class Node
{
    private int data;
    private Node next;

    public Node( int newData )
    {
        setData( newData );
        next = null;
    }

    public int getData( )
    {
        return data;
    }

    public Node getNext( )
    {
        return next;
    }

    public void setData( int newData )
    {
        data = newData;
    }

    public void setNext( Node nd )
    {
        next = nd;
    }
}
