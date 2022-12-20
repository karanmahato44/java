class Main {
    public static void main(String args[]) {
        Child obj = new Child();
        obj.calculate(10, 20, 30);
        obj.display();
    }
}

class Parent {
    void display() {
        System.out.println("nice");
    }

    void calculate(int l, int b) {
        System.out.println("Area: " + l * b);
    }
}

class Child extends Parent {
    void display() {
        System.out.println("69");
    }

    void calculate(int l, int b, int h) {
        System.out.println("Volume: " + l * b * h);
    }
}