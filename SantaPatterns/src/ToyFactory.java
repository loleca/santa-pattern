public class ToyFactory extends Workshop {

    @Override
    public ToyProduct createToy(String productName) {
        if(productName == "Dolls") {
            return new Doll();
        }
        if(productName == "Bicycles") {
            return new Bicycle();
        }
        System.out.println("Toy not available");
        return null;
    }
}
