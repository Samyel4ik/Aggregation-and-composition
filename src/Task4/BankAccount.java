package Task4;

public class BankAccount {
    int account;
    int number;
    String status;
    int amountOfMoney;


    public BankAccount(int number, int amountOfMoney, String status, int account) {
        this.account = account;
        this.number = number;
        this.amountOfMoney = amountOfMoney;
        this.status = status;
    }

    public int getAccount() {
        return account;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public int getNumber() {
        return number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "account=" + account +
                ", number=" + number +
                ", status='" + status + '\'' +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }
}
