package Task3;

import java.util.Scanner;

//Создать объект класса Государство, используя классы Область, Район, Город.
// Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
public class Class3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Area area = new Area(14, "Воложинский");
        Area area1 = new Area(15, "Держинский");
        Area area2 = new Area(15, "Березенский");
        Area area3 = new Area(15, "Минский");
        Area area4 = new Area(15, "Копыльский");

        Area[] areas = new Area[]{area, area1, area2, area3, area4};

        Area area5 = new Area(14, "Бобруйский");
        Area area6 = new Area(15, "Кировский");
        Area area7 = new Area(15, "Горецкий");
        Area area8 = new Area(15, "Быховкий");
        Area area9 = new Area(15, "Чаусский");

        Area[] areas1 = new Area[]{area5, area6, area7, area8, area9};

        Region minskii = new Region(areas, "Минск");
        Region mogilevskii = new Region(areas1, "Могилев");

        Region[] region = new Region[]{minskii, mogilevskii};


        State belarus = new State(region, "Минск", 207000);

        System.out.println("Выберите пункт меню:" + "\n" +
                "1.Вывести на консоль столицу" + "\n" +
                "2.Количество областей." + "\n" +
                "3.Площадь государства." + "\n" +
                "4.Областные центры.");
        System.out.print("Ваш выбор - ");
        int x = scanner.nextInt();

        if (x == 1) {
            belarus.printCapital();
        }
        if (x == 2) {
            belarus.printRegion();
        }
        if (x == 3) {
        belarus.printSquare();
        }
        if (x == 4) {
        belarus.printCapitalRegion();
        }

    }
}
