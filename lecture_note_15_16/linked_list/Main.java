package lecture_note_15_16.linked_list;

public class Main{

    public static void main(String[] args){


        IntLinkedList myList = new IntLinkedList();


        myList.insert(10);
        myList.insert(20);
        myList.insert(81);
        myList.insert(30);
        myList.insert(21);


        System.out.println(myList);


        myList.delete(20);

        System.out.println(myList);
        myList.delete(10);
        System.out.println(myList);
        myList.delete(30);
        System.out.println(myList);
        myList.delete(81);
        System.out.println(myList);
        myList.delete(21);
        System.out.println(myList);





    }


}