package lecture_note_10;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList <String> cities = new ArrayList<>();

        boolean check = cities.add("Baltimore");

        System.out.println(check);   //print out true

        System.out.println(cities);  //print out [Baltimore]

        cities.add("Addis Ababa");
        cities.add("Alexandria");
        cities.add("Baltimore");
        cities.add("South Bend");
        System.out.println(cities);

        //[Baltimore, Hanoi, Wichita Falls, Baltimore, South Bend]

        System.out.println(cities.get(2));


        cities.set(2,"Chicago");
        System.out.println(cities);



        cities.add(2,"Macomb");
        System.out.println(cities);


        System.out.println(cities.remove(3));


        System.out.println(cities.remove(5));


        System.out.println(cities.remove("Baltimore"));


        System.out.println(cities);

        System.out.println(cities.remove("New York"));

        System.out.println(cities);


    }
}