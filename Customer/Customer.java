package Customer;

import Bank.BankManager;

public class Customer {

    private String CustomerName;
    private int Deposite;

public void customerGiveMoneytoManger(){
    System.out.println(CustomerName + " Give Manager: " + Deposite);
    System.out.println("Customer.Customer: Give money to Manager");
    BankManager.managerAddMoney();
    }


    public Customer(String customerName, int deposite) {
        CustomerName = customerName;
        Deposite = deposite;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public int getDeposite() {
        return Deposite;
    }

    public void setDeposite(int deposite) {
        Deposite = deposite;
    }
}
