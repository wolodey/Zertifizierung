package OCP_SE8_1ZO_809_Tests.Java_Class_Design.D_LambldaExpressionsAndFunctionalInterfaces_04.v8_2_1833;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Created by WSteinle on 22.03.2017.
 */
public class BankAccount extends Account {
    private double balance;
    public BankAccount(String id, double balance) {
        super(id);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        Map<String, Account> myAccts = new HashMap<>();
        myAccts.put("111", new Account("111"));
        myAccts.put("222", new BankAccount("111", 200.0));

        BiFunction<String, Account, Account> bif =
                (a1, a2) -> a2 instanceof BankAccount ? new BankAccount(a1, 300.0) : new Account(a1);

        myAccts.computeIfPresent("222", bif);
        BankAccount ba = (BankAccount) myAccts.get("222");
        System.out.println(ba.getBalance());
    }
}
