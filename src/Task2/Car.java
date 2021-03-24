package Task2;

import java.util.Arrays;

//Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
// Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
public class Car {
    private Wheel[] wheels;
    private Engine engine;
    private String brand;
    private int fuel;


    public Car(Wheel[] wheels, Engine engine, String brand, int fuel) {
        this.wheels = wheels;
        this.engine = engine;
        this.brand = brand;
        this.fuel = fuel;
    }


    public void carRides() {
        if (this.wheels[0].getDiameter() == this.wheels[1].getDiameter() && this.wheels[0].getDiameter() == this.wheels[2].getDiameter() && this.wheels[0].getDiameter() == this.wheels[3].getDiameter()) {
            System.out.println("Проверка колёс прошла успешно!!!");
        } else {
            System.out.println("Машина  НЕ может ехать.");
            System.out.println("Нужна замена колеса, не то радиус!!!");
        }
        if (this.fuel > 0) {
            System.out.println("Проверка топлива прошла успешно!!!");
        } else {
            System.out.println("Машина  НЕ может ехать.");
            System.out.println("Нужна дозаправка топлива!!!");
        }
    }

    public void addFuel(int t) {
        this.fuel = fuel + t;
    }

    public void changeTheWheel(int x, Wheel wheel) {
        this.wheels[x - 1] = wheel;

    }

    public void printBrand() {
        System.out.println(this.brand);
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + Arrays.toString(wheels) +
                ", engine=" + engine +
                ", brand='" + brand + '\'' +
                ", fuel=" + fuel +
                '}';
    }

}
