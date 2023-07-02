public class InventoryService implements OnOrderPlacedSubscriber{
    InventoryService(){ //auto-sub
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Notifying inventory");
    }
}
