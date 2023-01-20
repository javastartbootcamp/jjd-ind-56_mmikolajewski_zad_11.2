package pl.javastart.task;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.pesel = pesel;
    }

    private static void checkAge(int age) {
        if (age < 1) {
            throw new IncorrectAgeException("Nieprawidłowy wiek");
        }
    }

    private void validateFirstName(String firstName, String message) {
        if (firstName == null || firstName.length() < 2) {
            throw new NameUndefinedException(message);
        }
    }

    private void validateLastName(String lastName, String message) {
        if (lastName == null || lastName.length() < 2) {
            throw new NameUndefinedException(message);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        validateFirstName(firstName, "Nieprawidłowe imię, błąd - null lub za krótkie, min. 2 znaki");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validateLastName(lastName, "Nieprawidłowe nazwisko, błąd - null lub za krótkie, min. 2 znaki");
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkAge(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
