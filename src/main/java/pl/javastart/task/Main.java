package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        try {
            Person person1 = new Person("Jan", "Kowalski", 2137, "123456789");
            Person person2 = new Person("Jan", "Kot", 2137, "123456789");
            Person person3 = new Person("Jan", "Kot", 2, "123456789");
            person3.setFirstName("Zbigniew");
            person3.setLastName("Zero");
            person3.setAge(1);

//            Person person4 = new Person("Jan", null, 25, "1234567890");
//            System.out.println(person4);

            Person person5 = new Person("Jan", "Kowalski", 25, "1234567890");
            System.out.println(person5);
            person5.setAge(-10);
            System.out.println(person5);

        } catch (NameUndefinedException | IncorrectAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Koniec programu");
        }

    }
}
