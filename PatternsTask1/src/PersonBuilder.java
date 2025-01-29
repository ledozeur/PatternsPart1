public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException, IllegalArgumentException {
        if (name == null & surname == null & age == 0) {
            throw new IllegalStateException("Вы не заполнили обязательные поля");
        } else if (this.age < 0) {
            throw new IllegalArgumentException("Введите корректный возраст");
        } else
            return new Person(this.name, this.surname, this.age);
    }


}
