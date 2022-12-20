class Main {
    public static void main(String args[]) {
    Cat catObj = new Cat();
    catObj.sound();
    catObj.sleep();

    }
}

// can't create objs directly from an abstract class
abstract class Animal {
    public abstract void sound();
    public void sleep() {
        System.out.println("Zzzz!");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("meow!");
    }
}



