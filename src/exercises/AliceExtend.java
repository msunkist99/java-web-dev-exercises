package exercises;

import java.util.Scanner;

public class AliceExtend {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String alice =
                "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("enter your search term - ");
        String searchTerm = input.next();

        boolean foundSearchTerm = alice.toUpperCase().contains(searchTerm.toUpperCase());
        System.out.println("Alice quote contains your search term - " + foundSearchTerm);

        if (foundSearchTerm == true) {
            System.out.println("index of search term in Alice quote - " + alice.toUpperCase().indexOf(searchTerm));
            System.out.println("length of search term - " + searchTerm.length());

            // note -- this does not accommodate for upper/lower case of searchTerm
            System.out.println(alice.replace(searchTerm, ""));
        }
    }
}
