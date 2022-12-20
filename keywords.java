// refactor the mess later
class Main {
    static String message = "Have a nice day! #static variable"; // static in variable, single copy of the variable is created and shared among all objects at the class level
    final int maxSpeed = 100;   // final in variable
    String name;

    public Main(String name) {
        this.name = name;   // this in constructor and variable
    }

    static void staticMethod() {
        System.out.println("Hello from static method.");    // static in method
    }

    public static void main(String args[]) {
        Main obj = new Main("kyto");
        Keywords keywordsObj = new Keywords();
        
        System.out.println(message);
        staticMethod();
        keywordsObj.FromThis();
        System.out.println("Hello, " + obj.name + "." + " #this keyword in constructor");

        Inherited i = new Inherited();
        i.superKeyword();
        i.colorPrinter();
    }
}




class Keywords {

    Keywords() {
        System.out.println("Super keyword in constructor.");
    }
    String color1 = "Red from base class.";
    void greet() {
        System.out.println("Hello from this keyword in method.");
    }

    void FromThis() {
        this.greet();   // this in method
    }

    final void whoWasInParis() {    // final in method, can't override
        System.out.println("ye & Jay-Z #final keyword in method");
    }

}

class Inherited extends Keywords {

    Inherited() {
        super();    // super in constructor
    }

    String color2 = "Blue from inherited class.";

    void colorPrinter() {
        System.out.println(super.color1);   // super in variable
        System.out.println(color2);
    }
    void superKeyword() {
        super.whoWasInParis();  // super in method
    }
    // void whoWasInParis() {
    //     System.out.println("Two fine gentlemen of color.");
    // }
}




final class Animal {    // final in class
    void Sound() {
        System.out.println("Animals make a sound.");
    }
}

// class Cat extends Animal {
//     void Says() {
//         System.out.println("Cat says meow!");
//     }
// }