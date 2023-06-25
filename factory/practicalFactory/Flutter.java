public class Flutter {

    public void setTheme(){ //non-factory method
        System.out.println("Setting theme");
    }

    public void setRefershRate(){ //non-factory method
        System.out.println("Setting refresh rate");
    }

    public UIFactory createUiFactory(SupportedPlatform platform){
        return UIFactoryFactory.createUIFactoryForPlatform(platform);
    }
    //due to no if else here, srp and ocp are not violated unlike abstract factory design pattern
}
