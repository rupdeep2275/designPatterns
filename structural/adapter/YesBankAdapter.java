import ThirdParty.YesBankAPI;

public class YesBankAdapter implements BankAPI {
    //Adapter class / wrapper class that uses Yes Bank to do all the banking works
    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return yesBankAPI.checkBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return yesBankAPI.sendMoney(fromAccount, toAccount, amount);
    }
}
