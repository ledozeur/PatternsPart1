public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String address;


    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name.length() <= 1) {
            throw new IllegalArgumentException("Введите корректное имя");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {
        if (surname.length() <= 1) {
            throw new IllegalArgumentException("Введите корректное имя");
        }
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Введите корректный возраст");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (name == null && surname == null) {
            throw new IllegalStateException("Вы не заполнили обязательные поля");
        } else if (age == null) {
            return new Person(this.name, this.surname);
        } else
            return new Person(this.name, this.surname, this.age);
    }


}
