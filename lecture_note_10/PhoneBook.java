package lecture_note_10;

import java.sql.SQLOutput;
import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {

        HashMap<String, Long > phonebook = new HashMap<>();

        phonebook.put("Lamar", 3129092213L);
        phonebook.put("Leo", 3129032213L);
        phonebook.put("Henry", 3129032111L);
        System.out.println(phonebook);
        //print{Leo=3129032213, Lamar=3129092213, Henry=3129032111}

        System.out.println(phonebook.size());

        System.out.println(phonebook.get("Leo"));

        System.out.println(phonebook.containsKey("Sarah"));

        System.out.println(phonebook.put("Lamar", 3129999999L));
        System.out.println(phonebook);

        System.out.println(phonebook.putIfAbsent("Lamar", 3120000000L));
        System.out.println(phonebook);


        System.out.println(phonebook.replace("Lamar", 3120000000L));
        System.out.println(phonebook);

        System.out.println(phonebook.remove("Lamar"));
        System.out.println(phonebook);



    }
}
