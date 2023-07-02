public class InvoiceGenerator implements OnOrderPlacedSubscriber{

    InvoiceGenerator(){ //auto-sub
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Generating invoice");
    }
}
