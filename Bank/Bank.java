package Bank;

public class Bank {
    private int vault;
    protected int addCash;
    protected int takeCash;

    public Bank(int vault, int addCash, int takeCash) {
        this.vault = vault;
        this.addCash = addCash;
        this.takeCash = takeCash;
    }





    public int getVault() {
        return vault;
    }

    public void setVault(int vault) {
        this.vault = vault;
    }

    public int getAddCash() {
        return addCash;
    }

    public void setAddCash(int addCash) {
        this.addCash = addCash;
    }

    public int getTakeCash() {
        return takeCash;
    }

    public void setTakeCash(int takeCash) {
        this.takeCash = takeCash;
    }
}
