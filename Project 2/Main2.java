public class Main2 {
    public static void main(String[] args) {
        // b && ||

        // &&
        // true && true   -> true
        // false && true  -> false
        // true && false  -> false
        // false && false -> false

//        boolean store = true;
//        boolean phone = true;
//        int myCash = 580;
//        int pricePhone = 550;
//
//        System.out.println(store && phone && myCash >= pricePhone);

        // ||
        // true || true   -> true
        // false || true  -> true
        // true || false  -> true
        // false || false -> false

//        boolean bread = true;
//        boolean lep = true;
//
//        System.out.println(bread || lep);

        // u !
        // !true  -> false
        // !false -> true
//        boolean lamp = false;
//        lamp = !lamp;
//        lamp = !lamp;
//        lamp = !lamp;
//        lamp = !lamp;
//        lamp = !lamp;
//        lamp = !lamp;

//        int a = 5;
//        int b = 10;
//        int r = a + b;
//        System.out.println(r);

        // if(...) {} [else if(...){} else {}]

//        int friends = 0;
//        if(friends >= 5) {
//            System.out.println("Едем в горы!");
//        } else if(friends >= 1) {
//            System.out.println("Пойдем в кино!");
//        } else {
//            System.out.println("Останусь дома!");
//        }
        //...

        // building -> Заходим в здание | Идем домой
        // elevator -> Поднимаемся по лифту | Идем по лестнице
        // door     -> Заходим | Стучимся в дверь
        // manager  -> Здароваемся с менеджером | ...

//        boolean building = false;
//        boolean elevator = true;
//        boolean door = false;
//        boolean manager = false;
//        if(building) {
//            if(elevator) {
//
//            } else {
//
//            }
//            if(door) {
//
//            } else {
//
//            }
//            if(manager) {
//
//            }
//        } else {
//
//        }

        // < 9 - 18 > 13 .. 14
        int currentTime = 15;
        boolean phone = true;
        int pricePhone = 550;
        int myCash = 500;
        String shop = "";
        String info = "";

        if(currentTime >= 9 && currentTime <= 18) {
            shop = "Открыт";

            if(phone) {
                info = "Купили телефон!";
            } else {
                info = "Не купили телефон, не было в наличии!";
            }
        } else {
            shop = "Закрыт";

            if(currentTime < 9) {
                info = "Пришли рано!";
            } else {
                info ="Пришли поздно!";
            }
        }

        System.out.println("Магазин: " + shop);
        System.out.println("Информация: " + info);

    }
}

