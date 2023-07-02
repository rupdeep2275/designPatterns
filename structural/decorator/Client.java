public class Client {
    public static void main(String[] args) {
        IceCream iceCream =
                new ChocoChips(
                        new StrawberryScoop(
                                new VanillaScoop(
                                        new ChocolateCone(
                                                new OrangeCone()
                                        )
                                )
                        )
                );
        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getCost());
    }
}
