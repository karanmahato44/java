// import com.sun.jdi.event.StepEvent;

// import java.awt.*;
// import java.text.NumberFormat;
// import java.util.Arrays;
// import java.util.Date;
// import java.util.Scanner;

// interface Animal {
//     public void sciName();
//     public void says();
// }


// class cat implements Animal {
//     public void sciName() {
//         System.out.println("xxxxxxxx");

//     }
//     public void says() {
//         System.out.println("meow");

//     }
// }

// class Main {
//     public static void main(String[] args) {
// //        System.out.println("Hello world!");
// //        Date now = new Date();
// //        System.out.println(now);
// //
// //        Point point1 = new Point(4, 2);
// //        Point point2 = point1;
// //        System.out.println(point1);
// //        point1.x = 44;
// //        System.out.println(point2);
// //
// ////        String message = new String("Since this is also a ref. type");
// //        String message = "nice" + "kek";
// //        System.out.println(message.length());
// //
// ////        int[] numbers = new int[4];
// ////        numbers[1] = 44;
// //
// //        int[] numbers = {1, 69, -1, 5, 444, 2, 3 ,4, 44};
// //        System.out.println(numbers.length);
// //        Arrays.sort(numbers);
// //        System.out.println(Arrays.toString(numbers));
// //        //2d arrays
// //        int[][] matrix = {{1, 1, 1}, {2, 2, 2}};
// //        System.out.println(Arrays.deepToString(matrix));
// //        double div = (double)10 / (double) 3;
// //        System.out.println(div);
// //

//         //casting
// //        String number = "10";
// //        String numberFloat = "44.44";
// //        int y = Integer.parseInt(number) + 20;
// //        double z = Double.parseDouble(numberFloat) + 20;
// //        System.out.println(y);
// ////        System.out.println(z);
// //        double randomNumber = (Math.random() * 100);
// //        System.out.println("The random number is: " + (int)randomNumber);

// //
// //        //number formatting
// ////        NumberFormat currency = NumberFormat.getCurrencyInstance();
// ////        String result = currency.format(123456.44);
// ////        System.out.println(result);
// //
// //
// //        // method chaining
// //    String result = NumberFormat.getPercentInstance().format(0.44);
// //        System.out.println(result);
// //
// //        // user input
// //
// //        Scanner userInput = new Scanner(System.in);
// //        System.out.print("Enter your age: ");
// //        int age = userInput.nextInt();
// //        System.out.println("You are " + age + " years old.");
// //
// //
// //         Scanner name = new Scanner(System.in);
// //        System.out.print("Enter full name: ");
// //         String fullName = name.nextLine().trim();
// //        System.out.println("Your name is " + fullName + ".");


// //        Scanner scan = new Scanner(System.in);
// //        System.out.print("Enter Principal: ");
// //        int principle = scan.nextInt();
// //
// //        System.out.print("Enter Rate: ");
// //        float rate = scan.nextFloat();
// //
// //        System.out.print("Enter Time (Years): ");
// //        float time = scan.nextFloat();
// //
// //        double simpleInterest = ((principle * time * rate) / 100);
// //        String formattedSimpleInterest = NumberFormat.getCurrencyInstance().format(simpleInterest);
// //        System.out.print("Simple Interest is: " + formattedSimpleInterest);

//         // ternary operator, same as in c
// //        int income = 110_000;
// //        String className = income > 100_000 ? "Firstclass" : "Economy";
// //        System.out.println(className);


// //
// //        //sth with while loops
// //
// //        String input = "";
// //        Scanner scanner = new Scanner(System.in);
// //        while(!input.equals("quit")) {
// //            System.out.print("Input is? ");
// //            input = scanner.next().toLowerCase();
// //            System.out.println(input);
// //        }
// //
// //        sz
// //    }
// //}

//         cat obj = new cat();
//         obj.sciName();

//         obj.says();
//     }
//     }
