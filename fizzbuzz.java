// for div.able by 3/5
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int num = s.nextInt();
        
        if((num % 3 == 0) && (num % 5 == 0))
            System.out.println("FizzBuzz!");
        else if(num % 3 == 0)
            System.out.println("Fizz!");
        else if(num % 5 == 0)
            System.out.println("Buzz!");
        else
        System.out.println(num);

        s.close();
    }
}