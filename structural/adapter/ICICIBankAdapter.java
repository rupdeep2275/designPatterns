import ThirdParty.ICICIBankAPI;

public class ICICIBankAdapter implements BankAPI {
    //Adapter class / wrapper class that uses Yes Bank to do all the banking works
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double toAcoount) {
        return false;
    }
}
