// why cat? yes.
class Main {
    public static void main(String args[]) {
        Cat obj = new Cat();
        obj.name();
        obj.sound();

        multipleInterface multiObj = new multipleInterface(); // multiple inheritance in java
        multiObj.lorem();
        multiObj.ipsum();
    }
}

interface Animal {
    public void name();
    public void sound();
}

class Cat implements Animal {
    public void name() {
        System.out.println("cat");
    }

    public void sound() {
    System.out.println("meow!");

    }
}

interface demo1 {
    public void lorem();
}

interface demo2 {
    public void ipsum();
}

class multipleInterface implements demo1, demo2 {
    public void lorem() {
        System.out.println("nice 1");
    }

    public void ipsum() {
        System.out.println("nice 2");
    }
}
