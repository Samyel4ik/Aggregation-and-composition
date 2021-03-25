package Task5;

public class Voucher {
    String type;
    String transport;
    int food;
    int numberDays;
    int number;
    int theCost;

    public Voucher(int number, String type, String transport, int food, int numberDays, int theCost) {
        this.number = number;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.numberDays = numberDays;
        this.theCost = theCost;
    }

    public String getTransport() {
        return transport;
    }

    public int getFood() {
        return food;
    }

    public int getNumberDays() {
        return numberDays;
    }

    public int getTheCost() {
        return theCost;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "type='" + type + '\'' +
                ", transport='" + transport + '\'' +
                ", food=" + food +
                ", numberDays=" + numberDays +
                ", number=" + number +
                ", theCost=" + theCost +
                '}';
    }

}
