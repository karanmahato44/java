class Main {
    public static void main(String args[]) {

        Animal animalObj = new Animal();
        Cat catObj = new Cat();
        Dog dogObj = new Dog();

        animalObj.sound();
        catObj.sound();
        dogObj.sound();

    }
}

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Cat says Meow!");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog says Woof!");
    }
}

