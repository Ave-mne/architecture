package HomeWork2.GingerbreadFabric;


class GingerbreadFactory {
    public Gingerbread createGingerbread(String gingerbreadType) {
        if ("Chocolate".equalsIgnoreCase(gingerbreadType)) {
            return new Chocolate();
        } else if ("Mint".equalsIgnoreCase(gingerbreadType)) {
            return new Mint();
        } else if ("Cherry".equalsIgnoreCase(gingerbreadType)) {
            return new Cherry();
        } else {
            throw new IllegalArgumentException("Таких пряников нет =) ");
        }
    }
}


