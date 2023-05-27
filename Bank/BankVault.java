package Bank;

public class BankVault {
    private int vault;

    public BankVault(int vault, int addCash, int takeCash) {
        this.vault = vault;
    }

    protected static void addMoney() {
        System.out.println("Vault: New money");
    }

    public int getVault() {
        return vault;
    }

    public void setVault(int vault) {
        this.vault = vault;
    }
}
