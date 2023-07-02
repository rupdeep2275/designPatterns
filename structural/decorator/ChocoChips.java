public class ChocoChips implements IceCream{
    public IceCream iceCream;

    public ChocoChips(){}

    public ChocoChips(IceCream iceCream){
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
            return iceCream.getDescription() + " " + "Chocochips";
        }
        return "Chocochips";
    }
}
