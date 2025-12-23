class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
      void sound() {
        System.out.println("Dog barks");
    }
   void bark() {
        System.out.println("Dog is barking loudly");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        Dog d = (Dog) a;
        d.bark();
    }
}
