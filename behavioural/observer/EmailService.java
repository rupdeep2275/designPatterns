public class EmailService implements OnOrderPlacedSubscriber{
    EmailService(){ //auto-sub
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Sending email");
    }
}
