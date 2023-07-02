public class Flutter {

    public void setTheme(){ //non-factory method
        System.out.println("Setting theme");
    }

    public void setRefershRate(){ //non-factory method
        System.out.println("Setting refresh rate");
    }

    public UIFactory createUiFactory(SupportedPlatform platform){
        //OCP is violating in abstract factory due to if else conditions
        //creating UI Factory -> violating OCP
        if(platform.equals(SupportedPlatform.ANDROID)){
            return new AndroidUIFactory();
        }
        else if(platform.equals(SupportedPlatform.IOS)){
            return new IOSUIFactory();
        }
        return null;
    }

}
