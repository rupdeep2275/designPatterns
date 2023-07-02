public class UIFactoryFactory { //practical factory
    public static UIFactory createUIFactoryForPlatform(SupportedPlatform platform){
        //SRP for creating UI Factory
        if(platform.equals(SupportedPlatform.ANDROID)){
            return new AndroidUIFactory();
        }
        else if(platform.equals(SupportedPlatform.IOS)){
            return new IOSUIFactory();
        }
        return null;
    }
}
