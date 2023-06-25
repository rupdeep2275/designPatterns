public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uifactory = flutter.createUiFactory(SupportedPlatform.ANDROID);
        //uifactory -> AndroidFactory

        Button button = uifactory.createButton();
        button.showButton();

        Menu menu = uifactory.createMenu();
        menu.showMenu();
    }
}
