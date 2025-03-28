package lecture_note_15_16.ll_queue;

import java.util.NoSuchElementException;

public class Main
{
    public static void main( String [] args )
    {
       LinkedListAsQueue queue = new LinkedListAsQueue( );
       queue.enqueue( 56 );
       queue.enqueue( 22 );
       queue.enqueue( 76 );
       System.out.println( "Queue: " + queue );
       try
       {
           int dequeued = queue.dequeue();
           System.out.println( "Dequeued " + dequeued );
           System.out.println( "Queue: " + queue );

           dequeued = queue.dequeue();
           System.out.println( "Dequeued " + dequeued );
           System.out.println( "Queue: " + queue );

           dequeued = queue.dequeue();
           System.out.println( "Dequeued " + dequeued );
           System.out.println( "Queue: " + queue );

           dequeued = queue.dequeue();
           System.out.println( "Dequeued " + dequeued );
           System.out.println( "Queue: " + queue );
       }
       catch( NoSuchElementException nsee )
       {
           System.out.println( nsee.getMessage( ) );
       }
    }
}
