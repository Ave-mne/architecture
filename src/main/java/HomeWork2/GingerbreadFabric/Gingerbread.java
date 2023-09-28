package HomeWork2.GingerbreadFabric;


public abstract class Gingerbread {
    public abstract void eat();
}

class Chocolate extends Gingerbread {
    @Override
    public void eat() {
        System.out.println("Вы кушаете шоколадный пряник");
    }
}
class Mint extends Gingerbread {
    @Override
    public void eat() {
        System.out.println("Вы кушаете мятный пряник");
    }
}
class Cherry extends Gingerbread {
    @Override
    public void eat() {
        System.out.println("Вы кушаете вишневый пряник");
    }
}

