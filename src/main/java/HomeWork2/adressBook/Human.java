package HomeWork2.adressBook;

public class Human {
    private String name;
    private String surname;
    private int age;
    private String address;
    private String telephone_number;
    private String mail;

    public Human(String name, String surname, int age, String address, String telephone_number, String mail) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.telephone_number = telephone_number;
        this.mail = mail;
    }

    // Геттеры для полей

    @Override
    public String toString() {
        return "Контакт: " +
                "Имя = " + name +
                ", Фамилия = " + surname +
                ", Возраст = " + age +
                ", Адрес = " + address +
                ", Номер телефона = " + telephone_number +
                ", Почта = " + mail ;
    }
}