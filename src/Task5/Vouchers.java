package Task5;

import java.util.Arrays;

public class Vouchers {
    Voucher[] vouchers;

    public Vouchers(Voucher[] vouchers) {
        this.vouchers = vouchers;
    }

    public void arrayNumberDaysVoucher() {
        int[] array = new int[this.vouchers.length];

        for (int i = 0; i < this.vouchers.length; i++) {
            array[i] = this.vouchers[i].getNumberDays();
        }
        System.out.println(Arrays.toString(array));
    }

    public int quantityByNumberDays(int a) {
        int t = 0;
        for (int i = 0; i < this.vouchers.length; i++) {
            if (this.vouchers[i].getNumberDays() == a) {
                t++;
            }
        }
        return t;
    }

    public Voucher[] selectionByNumberDays(int a) {
        Voucher[] vouchers1 = new Voucher[quantityByNumberDays(a)];

        for (int i = 0; i < this.vouchers.length; i++) {
            if (this.vouchers[i].getNumberDays() == a) {
                vouchers1[i] = this.vouchers[i];
            }
        }
        return vouchers1;
    }

    public void arrayFoodVoucher() {
        int[] array = new int[this.vouchers.length];

        for (int i = 0; i < this.vouchers.length; i++) {
            array[i] = this.vouchers[i].getFood();
        }
        System.out.println(Arrays.toString(array));
    }

    public int quantityByFood(int a) {
        int t = 0;
        for (int i = 0; i < this.vouchers.length; i++) {
            if (this.vouchers[i].getFood() == a) {
                t++;
            }
        }
        return t;
    }

    public Voucher[] selectionByFood(int a) {
        Voucher[] vouchers1 = new Voucher[quantityByFood(a)];

        for (int i = 0; i < this.vouchers.length; i++) {
            if (this.vouchers[i].getFood() == a) {
                vouchers1[i] = this.vouchers[i];
            }
        }
        return vouchers1;
    }


    public void arrayTransportVoucher() {
        String[] array = new String[this.vouchers.length];

        for (int i = 0; i < this.vouchers.length; i++) {
            array[i] = this.vouchers[i].getTransport();
        }
        System.out.println(Arrays.toString(array));
    }

    public int quantityByTransport(String str) {
        int t = 0;
        for (int i = 0; i < this.vouchers.length; i++) {
            if (this.vouchers[i].getTransport().equals(str)) {
                t++;
            }
        }
        return t;
    }

    public Voucher[] selectionByTransport(String str) {
        Voucher[] vouchers1 = new Voucher[quantityByTransport(str)];

        for (int i = 0; i < this.vouchers.length; i++) {
            if (this.vouchers[i].getTransport().equals(str)) {
                vouchers1[i] = this.vouchers[i];
            }
        }
        return vouchers1;
    }


    public void arrayTypeVoucher() {
        String[] array = new String[this.vouchers.length];

        for (int i = 0; i < this.vouchers.length; i++) {
            array[i] = this.vouchers[i].getType();
        }
        System.out.println(Arrays.toString(array));
    }

    public int quantityByType(String str) {
        int t = 0;
        for (int i = 0; i < this.vouchers.length; i++) {
            if (this.vouchers[i].getType().equals(str)) {
                t++;
            }
        }
        return t;
    }

    public void selectionByType(String str) {
        Voucher[] vouchers1 = new Voucher[quantityByType(str)];

        for (int i = 0; i < this.vouchers.length; i++) {
            if (this.vouchers[i].getType().equals(str)) {
                vouchers1[i] = this.vouchers[i];
            }
        }
        System.out.println(Arrays.toString(vouchers1));
    }

    public Voucher[] sortingVouchersByCost() {
        Voucher[] vouchers1 = Arrays.copyOf(this.vouchers, this.vouchers.length);
        Arrays.sort(vouchers1, new VouchersByCostComparator());
        return vouchers1;
    }

    @Override
    public String toString() {
        return "Vouchers{" +
                "vouchers=" + Arrays.toString(vouchers) +
                '}';
    }
}
