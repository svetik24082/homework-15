public class Main {
    public static void main(String[] args) {
        Car car = new Car(null, null, 0,
                null, null, 180f,
                0,
                " МКПП", " универсал ",
                null, 5, false);
        Car car1 = new Car(" Audi ", " A8 50 L TDI quattro ",
                2020,
                " Германия ", " черный ",
                300f,
                3.0, "АКПП", " седан",
                " а012а258 ",
                2, true);
        System.out.println(car1.isCorrectRegistrationNumber());
        Car car2 = new Car(" BMW ", " Z8 ", 2021,
                " Германия", " черный ", 320f,
                3.0, " АКПП ", " внедорожник", " а012ап158 ",
                5, true);
        Car car3 = new Car(" Kia ", " Sportage 4-го поколения",
                2018,
                "  Южная Корея ", " Красный ", 220f,
                2.4, " МКПП ", " внедорожник ", " а056ап158 ",
                5, false);
        Car car4 = new Car(" Hyundai ", "  Avante ",
                2016,
                "  Южная Корея ", " оранжевый ", 225f,
                1.6, " МКПП ", " внедорожник ", " к056ап158 ",
                5, false);


        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println();


        Train train = new Train("Ласточка ", "модель B-901 ",
                2011, " Россия",
                null, 301,
                3500, 0f,
                "Белорусский  вокзал ",
                " Минск-Пассажирский", 11);
        Train train1 = new Train("Ленинград ", " D-125 ",
                2019, " Россия",
                null, 270,
                1700, 0f,
                "Ленинградский вокзал ",
                " Ленинград-Пассажирский", 8);
        System.out.println(train);
        System.out.println(train1);
        System.out.println();

        Bus bus = new Bus(" Икарус", null, 2014,
                null, "красный", 150f);
        Bus bus1 = new Bus(" ПАЗ", null, 2006,
                "Россия ", "зеленый", 80f);
        Bus bus2 = new Bus(" Вольво", null, 2020,
                null, "синий", 160f);
        System.out.println(bus);
        System.out.println(bus1);
        System.out.println(bus2);

    }
}
