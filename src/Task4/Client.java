package Task4;

import java.util.Arrays;

public class Client {
    BankAccount[] bankAccount;
    String customerName;

    public Client(BankAccount[] bankAccount, String customerName) {
        this.bankAccount = bankAccount;
        this.customerName = customerName;
    }

    public void changeStatus(int t) {
        t = t - 1;
        if (this.bankAccount[t].getStatus() == "active") {
            this.bankAccount[t].setStatus("locked");
        } else {
            this.bankAccount[t].setStatus("active");
        }

    }

    public int[] arrayAccount() {
        int[] array = new int[this.bankAccount.length];
        for (int i = 0; i < this.bankAccount.length; i++) {
            array[i] = this.bankAccount[i].getAccount();
        }
        return array;
    }

    public void accountInformation(int t) {
        for (int i = 0; i < this.bankAccount.length; i++) {
            if (this.bankAccount[i].getAccount() == t) {
                System.out.println(this.bankAccount[i]);
            }
        }
    }

    public void getBankAccountAmountOfMoney() {
        BankAccount[] bankAccounts = Arrays.copyOf(this.bankAccount, this.bankAccount.length);
        Arrays.sort(bankAccounts, new BankAccountAmountOfMoneyComparator());
        System.out.println(Arrays.toString(bankAccounts));
    }

    public int theAmountOfMoneyInAllAccounts() {
        int t = 0;
        for (int i = 0; i < this.bankAccount.length; i++) {
            t += this.bankAccount[i].getAmountOfMoney();
        }
        return t;
    }

    @Override
    public String toString() {
        return "Client{" +
                "bankAccount=" + Arrays.toString(bankAccount) +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
