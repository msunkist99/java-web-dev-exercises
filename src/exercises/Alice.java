package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String alice =
                "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("enter your search term - ");
        String searchTerm = input.nextLine();
        input.close();

        System.out.println("Alice quote contains your search term - " + alice.toUpperCase().contains(searchTerm));
    }
}
