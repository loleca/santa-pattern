public abstract class Workshop {
    public abstract ToyProduct createToy(String productName);

    public ToyProduct produceProduct(String productName) {
        ToyProduct product = createToy(productName);
        product.prepare();
        return product;
    }
}
