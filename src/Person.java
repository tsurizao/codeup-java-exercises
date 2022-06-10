public class Person {

    public static void main(String[] args) {
//        Person bob = new Person("Bob Brown");
//        Person jane = new Person("Jane Doe");
//        bob.sayHello();
//        jane.sayHello();

//        System.out.println("Test code 1");
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        System.out.println("Test code 2");
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + this.name);
    }

    public Person(String name) {
        this.name = name;
    }

}
