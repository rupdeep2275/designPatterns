public class StrawberryScoop implements IceCream{
    public IceCream iceCream;

    public StrawberryScoop(){}

    public StrawberryScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        if(iceCream != null){
            return iceCream.getCost() + 30;
        }
        return 30;
    }

    @Override
    public String getDescription() {
        if(iceCream != null){
            return iceCream.getDescription() + " " + "Strawberry scoop";
        }
        return "Strawberry scoop";
    }
}
