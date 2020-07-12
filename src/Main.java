import java.util.Scanner;

/**
 * Created by KPS on 7/12/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleasae enter a string");
        String sentence = scanner.nextLine();
        System.out.println("pleasae enter a word");
        String word = scanner.next();
        int mid = sentence.length()/2;
        System.out.println(sentence.substring(0,mid)+" "+word+" "+sentence.substring(mid));
    }
}
