package Task4;

import java.util.Comparator;

public class BankAccountAmountOfMoneyComparator implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount o1, BankAccount o2) {
        int money1 = o1.getAmountOfMoney();
        int money2 = o2.getAmountOfMoney();

        return money1 - money2;
    }
}
