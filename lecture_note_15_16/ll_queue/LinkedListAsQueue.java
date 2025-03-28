package lecture_note_15_16.ll_queue;

import java.util.NoSuchElementException;

public class LinkedListAsQueue
{
    private Node head;
    private Node tail;
    private int numberOfItems;

    /**
     * Default constructor: creates an empty list
     */
    public LinkedListAsQueue( )
    {
        head = null;
        tail = null;
        numberOfItems = 0;
    }

    public int getNumberOfItems( )
    {
        return numberOfItems;
    }

    /**
     * inserts value at the beginning of this list
     * @param value an int
     */
    public void enqueue( int value )
    {
        // create a node that contains value
        Node nd = new Node( value );
        if( tail != null ) {
            // connect nd to the end of the list
            tail.setNext(nd);
            // make nd the tail of the list
            tail = nd;
        }
        else
        {
            head = nd;
            tail = head;
        }

        // update number of items
        numberOfItems++;
    }

    /**
     * deletes the first occurrence of value from the list
     * @return a boolean true if the deletion was successful, false if not
     */
    public int dequeue( ) throws NoSuchElementException
    {
        if( head == null ) // empty queue/list
            throw new NoSuchElementException( "Queue is empty; cannot dequeue" );
        else
        {
            // get value in head
            int value = head.getData( );
            // reset head
            head = head.getNext( );
            if( head == null ) // list is empty
                tail = null;
            numberOfItems--;
            return value;
        }
    }

    /**
     * deletes all the elements in this list
     */
    public void deleteAll( )
    {
        head = null;
        tail = null;
        numberOfItems = 0;
    }

    /**
     * toString method
     * @return a String containing all the elements of the list separated by a comma
     */
    public String toString( )
    {
        String result = "";
        Node current = head;
        while( current != null ) // not at the end of the list
        {
            // pick up data inside current, add it to result
            result += current.getData( ) + ",";
            // move to the next node in the list
            current = current.getNext( );
        }
        if( result.length() >= 1 )
            result = result.substring( 0, result.length( ) - 1 );
        return result;
    }

    /**
     * toString method
     * @return a String containing all the elements of the list separated by a comma
     */
    public String toString2( )
    {
        String result = "";

        // for( initialization; loop condition; loop update )
        // loop body
        for( Node current = head; current != null; current = current.getNext( )  )
            result += current.getData( ) + ",";

        if( result.length() >= 1 )
            result = result.substring( 0, result.length( ) - 1 );
        return result;
    }

}
