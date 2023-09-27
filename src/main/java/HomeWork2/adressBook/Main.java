package HomeWork2.adressBook;

public class Main {
    public static void main(String[] args) {
        Human human1 = new BookBuilder()
                .set_name("Андрей")
                .set_surname("Валеев")
                .set_age(33)
                .set_address("Москва")
                .set_telephone_number("89991234567")
                .set_mail("Valeev@mail.ru")
                .build();

        Human human2 = new BookBuilder()
                .set_name("Вася")
                .set_surname("Пупкин")
                .set_age(10)
                .set_address("Санкт-Петербург")
                .set_telephone_number("89104481276")
                .set_mail("Pypkin@mail.ru")
                .build();

        System.out.println(human1);
        System.out.println(human2);
    }
}