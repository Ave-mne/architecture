package HomeWork2.adressBook;


public class BookBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;
    private String telephone_number;
    private String mail;

    public BookBuilder set_name(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder set_surname(String surname) {
        this.surname = surname;
        return this;
    }

    public BookBuilder set_age(int age) {
        this.age = age;
        return this;
    }

    public BookBuilder set_address(String address) {
        this.address = address;
        return this;
    }

    public BookBuilder set_telephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
        return this;
    }
    public BookBuilder set_mail(String mail) {
        this.mail = mail;
        return this;
    }

    public Human build() {
        return new Human(name, surname, age, address, telephone_number, mail);
    }
}
