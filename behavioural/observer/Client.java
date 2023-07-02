public class Client {
    public static void main(String[] args) {
        Amazon amazon = Amazon.getInstance();
        EmailService es = new EmailService();
        InvoiceGenerator ig = new InvoiceGenerator();
        InventoryService is = new InventoryService();
        amazon.onOrderPlaced();
    }
}
