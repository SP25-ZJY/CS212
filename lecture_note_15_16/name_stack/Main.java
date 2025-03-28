package lecture_note_15_16.name_stack;

public class Main {

    public static void main(String[] args){

        NameStack names = new NameStack();


        names.push("Leo");
        names.push("Henry");
        names.push("Hoang");
        names.push("Jack");
        names.push("Bethlehem");




        String name = names.peek();

        System.out.println(name);
        name = names.pop();
        System.out.println(name);

    }
}
