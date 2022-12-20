import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Factorial of? : ");
        int num = s.nextInt();
        Inherited obj = new Inherited();
        int result = obj.CalculateFact(num);
        System.out.println(result);
        s.close();
    }
}

interface Fact {
    public int CalculateFact(int n);
}

class Inherited implements Fact {
    public int CalculateFact(int n) {
        if (n >= 1)
            return n * CalculateFact(n - 1);
        else
            return 1;
    }
}
