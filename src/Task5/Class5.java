package Task5;

import java.util.Arrays;
import java.util.Scanner;

//Туристические путевки.
// Сформировать набор предложений клиенту по выбору туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
// для оптимального выбора. Учитывать возможность выбора транспорта, питания и числа дней.
// Реализовать выбор и сортировку путевок.
public class Class5 {
    public static void main(String[] args) {

        Vouchers vouchers = createTours();
        Scanner scanner = new Scanner(System.in);
        finish(vouchers, scanner);
    }

    public static Vouchers createTours() {
        Voucher voucher = new Voucher(1, "Relaxation", "Airplane", 3, 7, 550);
        Voucher voucher1 = new Voucher(2, "Shopping", "Bus", 1, 1, 100);
        Voucher voucher3 = new Voucher(3, "Treatment", "Minibus", 5, 14, 1300);
        Voucher[] vouchers = new Voucher[]{voucher, voucher1, voucher3};

        return new Vouchers(vouchers);
    }

    public static void finish(Vouchers vouchers1, Scanner scanner) {
        System.out.println("Выберите пункт меню:" + "\n" +
                "1.Показать предложения по путевкам." + "\n" +
                "2.Выбор путевки по типу." + "\n" +
                "3.Выбор транспорта." + "\n" +
                "4.Выбор количества раз питания в день." + "\n" +
                "5.Выбор количество дней прибывания." + "\n" +
                "6.Сортировка путевок по стоимости.");

        System.out.print("Ваш выбор - ");
        int x = Integer.parseInt(scanner.nextLine());

        if (x == 1) {
            System.out.println(vouchers1);
        }
        if (x == 2) {
            System.out.println("Все типы предлагаемых путевок ");
            vouchers1.arrayTypeVoucher();
            System.out.print("Ваш выбор - ");
            String str = scanner.nextLine();
            vouchers1.selectionByType(str);
        }
        if (x == 3) {
            System.out.println("Все типы предлагаемых видов транспорта ");
            vouchers1.arrayTransportVoucher();
            System.out.print("Ваш выбор - ");
            String str = scanner.nextLine();

            System.out.println(Arrays.toString(vouchers1.selectionByTransport(str)));
        }
        if (x == 4) {
            System.out.println("Все типы предлагаемыхколичеств питания в день ");
            vouchers1.arrayFoodVoucher();
            System.out.print("Ваш выбор - ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.println(Arrays.toString(vouchers1.selectionByFood(a)));
        }
        if (x == 5) {
            System.out.println("Все типы предлагаемыхколичеств питания в день ");
            vouchers1.arrayNumberDaysVoucher();
            System.out.print("Ваш выбор - ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.println(Arrays.toString(vouchers1.selectionByNumberDays(a)));
        }
        if (x == 6) {
            System.out.println(Arrays.toString(vouchers1.sortingVouchersByCost()));
        }

    }
}
