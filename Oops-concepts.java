// OOPs Concepts in Java

// 1. Class and Object
class Animal {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class OopsConcepts {
    public static void main(String[] args) {
        // Creating an object of Animal class
        Animal dog = new Animal();
        dog.name = "Buddy";
        dog.age = 5;
        dog.display();
    }
}

// 2. Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking");
    }
}

public class OopsConcepts {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.age = 5;
        dog.display();
        dog.bark();
    }
}

// 3. Polymorphism
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OopsConcepts {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound(); // Dog barks
    }
}

// 4. Encapsulation
class Person {
    private String name;
    private int age;

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class OopsConcepts {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

// 5. Abstraction
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OopsConcepts {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); // Dog barks
    }
}
