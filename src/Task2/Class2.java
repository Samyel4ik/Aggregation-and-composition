package Task2;


import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = createACar();
        finish(scanner, car);
    }

    public static Car createACar() {
        Wheel[] wheels = new Wheel[]{
                new Wheel(15),
                new Wheel(15),
                new Wheel(16),
                new Wheel(15)};

        Engine engine = new Engine(120);

        return new Car(wheels, engine, "BMW", 0);
    }

    public static void finish(Scanner scanner, Car car) {
        System.out.println("Выберите пункт меню:" + "\n" +
                "1.Может ли машина ехть?" + "\n" +
                "2.Заправиться." + "\n" +
                "3.Заменить колесо." + "\n" +
                "4.Марка автомобиля" + "\n" +
                "5.Выход из меню.");

        System.out.print("Ваш выбор - ");
        int z = scanner.nextInt();

        if (z == 1) {
            car.carRides();
        }
        if (z == 2) {
            System.out.print("введите количество топлива - ");
            int x = scanner.nextInt();
            car.addFuel(x);
            System.out.println(car);
        }
        if (z == 3) {
            System.out.print("какое колесо меняем ? ");
            int x = scanner.nextInt();
            System.out.print("какой радиус вы хотите поставить ?");
            int y = scanner.nextInt();

            Wheel wheel = new Wheel(y);
            car.changeTheWheel(x, wheel);
            System.out.println(car);

        }
        if (z == 4) {
            car.printBrand();
        }
    }
}
