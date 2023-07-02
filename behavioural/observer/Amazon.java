import java.util.ArrayList;
import java.util.List;

public class Amazon {
    //publisher
    private static Amazon instance;
    List<OnOrderPlacedSubscriber> onOrderPlacedSubscriberList = new ArrayList<>();

    private Amazon(){

    }

    public static Amazon getInstance(){ //singleton
        if(instance == null){
            instance = new Amazon();
        }
        return instance;
    }

    void registerSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber){
        onOrderPlacedSubscriberList.add(onOrderPlacedSubscriber);
    }

    void withdrawSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber){
        onOrderPlacedSubscriberList.add(onOrderPlacedSubscriber);
    }

    public void onOrderPlaced(){
        //es.sendEmail();
        //ns.notify()

        for(OnOrderPlacedSubscriber subscriber : onOrderPlacedSubscriberList){
            subscriber.announceOrderPlaced();
        }
    }
}
