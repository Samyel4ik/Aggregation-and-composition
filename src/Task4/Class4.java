package Task4;

import java.util.Arrays;
import java.util.Scanner;

//Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
// Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
public class Class4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = createClient();
        finish(scanner, client);

    }

    public static Client createClient() {
        BankAccount bankAccount = new BankAccount(1, 250, "active", 111222);
        BankAccount bankAccount1 = new BankAccount(2, -5, "locked", 222333);
        BankAccount bankAccount2 = new BankAccount(3, 5000, "locked", 111444);
        BankAccount bankAccount3 = new BankAccount(4, 1000, "active", 555666);

        BankAccount[] bankAccounts = new BankAccount[]{bankAccount, bankAccount1, bankAccount2, bankAccount3};
        return new Client(bankAccounts, "Петров В.В.");
    }

    public static void finish(Scanner scanner, Client client) {
        System.out.println("Выберите пункт меню:" + "\n" +
                "1.Изменение статуса счета" + "\n" +
                "2.Поиск счета." + "\n" +
                "3.Сортировка счетов." + "\n" +
                "4.Общая сумма по счетам." + "\n" +
                "5.Выход из меню.");
        System.out.print("Ваш выбор - ");
        int x = Integer.parseInt(scanner.nextLine());

        if (x == 1) {
            System.out.println("У  какого счета поменять статус - ");
            int t = Integer.parseInt(scanner.nextLine());
            client.changeStatus(t);
            System.out.println(client);
        }
        if (x == 2) {
            System.out.print("Счета клиента: " + Arrays.toString(client.arrayAccount()));
            System.out.println();
            System.out.print("Введите номер счета по котором хотите получить инфу - ");
            int t = Integer.parseInt(scanner.nextLine());
            client.accountInformation(t);
        }
        if (x == 3) {
            System.out.println(Arrays.toString(client.getBankAccountAmountOfMoney()));
        }
        if (x == 4) {
            int t = client.theAmountOfMoneyInAllAccounts();
            System.out.println("Сумма денег по всем счетам составила:" + t);
        }

    }
}
