package HomeWork2.GingerbreadFabric;

public class Main {
    public static void main(String[] args) {
        GingerbreadFactory gingerbreadFactory = new GingerbreadFactory();
        Gingerbread cherry = gingerbreadFactory.createGingerbread("Cherry");
        cherry.eat();
        Gingerbread mint = gingerbreadFactory.createGingerbread("Mint");
        mint.eat();
        Gingerbread chocolate = gingerbreadFactory.createGingerbread("Chocolate");
        chocolate.eat();
    }
}