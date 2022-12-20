import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");

    char c = input.next().toLowerCase().charAt(0);
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        BufferedWriter bw = new BufferedWriter(new FileWriter("vowels.txt", true));
        bw.write(c);
        System.out.println("Vowel, written to vowels.txt!");
        bw.close();
    }
    
    else {
        BufferedWriter bw = new BufferedWriter(new FileWriter("consonants.txt", true));
        bw.write(c);
        System.out.println("Consonant, written to consonants.txt!");
        bw.close();
    }

    input.close();

    }
}