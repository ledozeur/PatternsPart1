import java.util.OptionalInt;

public class Person {
    protected String name;
    protected String surname;
    private Integer age;
    private String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        if (age.equals(getAge().isEmpty())) {
            return false;
        }
        return getAge().isPresent();
    }

    public boolean hasAddress() {
        return getAddress() != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        if (age == null || age < 0) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return name + " " + surname + " возрастом " + age + " год";
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public PersonBuilder newChildBuilder() {

        return new PersonBuilder()
                .setSurname(this.surname)
                .setAge(0);
    }


}
