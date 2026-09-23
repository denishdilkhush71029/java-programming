import java.io.*;

class AnimalMulti {
    void eat() {
        System.out.println("eating...");
    }
}

class DogMulti extends AnimalMulti {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDogMulti extends DogMulti {
    void weep() {
        System.out.println("weeping...");
    }
}

class Multilevel {
    public static void main(String args[]) {
        BabyDogMulti d = new BabyDogMulti();
        d.weep();
        d.bark();
        d.eat();
    }
}