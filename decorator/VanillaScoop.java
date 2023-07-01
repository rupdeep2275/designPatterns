public class VanillaScoop implements IceCream{
    public IceCream iceCream;

    public VanillaScoop(){}

    public VanillaScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        if(iceCream != null){
            return iceCream.getCost() + 35;
        }
        return 35;
    }

    @Override
    public String getDescription() {
        if(iceCream != null){
            return iceCream.getDescription() + " " + "Vanilla scoop";
        }
        return "Vanilla scoop";
    }
}
