import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {

        //1
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        // Array of people
        Person john = new Person("John");
        Person jane = new Person("Jane");
        Person jimmy = new Person("Kimmy");
        Person[] people = {john, jane, jimmy};

        //enhanced for loop
        for (Person person : people) {
            System.out.println(person.getName());
        }

        Person daniel = new Person("DANIEL");
        Person[] newPeople = addPerson(people, daniel);
        for(Person person : newPeople){
            System.out.println(person.getName());
        }
    }

    //method takes array of objects and creates new array with a new object added
    public static Person[] addPerson(Person[] arr, Person person) {
        Person[] newPeople = Arrays.copyOf(arr, arr.length + 1);
        newPeople[newPeople.length - 1] = person;
        return newPeople;
    }
}
