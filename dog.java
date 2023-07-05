public class dog {
    String name;
    int age;

    dog() {
        System.out.println("Hello, This is a DOG speaking");
    }

    dog(String name) {
        this("John", 21);
        System.out.println("Name of the dog is " + name);
        System.out.println("Age of the dog is " + age);
    }

    dog(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name of the dog is " + name);
        System.out.println("Age of the dog is " + age);
    }

    {
        System.out.println("Initializer block");
    }
    {
        System.out.println("Initialiser block 2");
    }
}