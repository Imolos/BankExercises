package Bank;

public class Bank {
    private int vault;

    public Bank(int vault, int addCash, int takeCash) {
        this.vault = vault;
    }

    public void addMoney(int vault) {
        System.out.println("you add money");
    }

    public int getVault() {
        return vault;
    }

    public void setVault(int vault) {
        this.vault = vault;
    }
}
