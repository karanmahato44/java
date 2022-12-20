class Main {
    public static void main(String args[]) {
        AnotherCat obj = new AnotherCat();
        obj.cute();
        obj.cuteAgain();

        Dog dogObj = new Dog();
        dogObj.sadge();

    }
}

class Animal {
    void play() {
        System.out.println("Playing!");
    }
}

class Cat extends Animal {
    void cute() {
        System.out.println("Being cute!");
    }
}

// multilevel
class AnotherCat extends Cat {
    void cuteAgain() {
        System.out.println("Yes, being cute too!");
    }
}

// hierarchical
class Dog extends Animal {
    void sadge() {
        System.out.println("Big boi!");
    }
}

// multi not supported
/*

class A {
    void greet() {
        System.out.println("hi!");
    }
}

class B {
    void greet() {
        System.out.println("hi! again");
    }
}

class C extends A,B
{

    public static void main(String args[]) {
        C obj = new C();
        obj.greet(); // which one to call?
    }
}

*/