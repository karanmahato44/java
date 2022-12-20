class Main {
    String name;
    int dob;
    int number1;
    int number2;

    public Main(String x, int y) {
        name = x;
        dob = y;
    }

    public Main(int num1, int num2) {
        number1 = num1;
        number2 = num2;
    }

    static void area(int length, int breadth) {
        System.out.println("Area of the rectangle is: " + length * breadth);
    }

    static void area(double radius) {
        System.out.println("Area of the circle is: " + 3.1415 * radius * radius);
    }

    public static void main(String args[]) {
        area(10, 20);
        area(7);

        Main obj = new Main("kyto", 1969);
        Main newObj = new Main(6, 9);
        System.out.println(obj.name + " was born in " + obj.dob + ".");
        System.out.println("First number is " + newObj.number1 + " & second number is " + newObj.number2 + ".");
    }
}