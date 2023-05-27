package Bank;

import Customer.Customer;

public class BankManager {

    public static void managerAddMoney() {
        System.out.println("Manager takes money and Put them into vault");
        BankVault.addMoney();
    }
}
