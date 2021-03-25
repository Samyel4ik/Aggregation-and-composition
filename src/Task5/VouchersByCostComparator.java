package Task5;

import java.util.Comparator;

public class VouchersByCostComparator implements Comparator<Voucher> {

    @Override
    public int compare(Voucher o1, Voucher o2) {
        int money1 = o1.getTheCost();
        int money2  = o2.getTheCost();
        return money1-money2;
    }
}
