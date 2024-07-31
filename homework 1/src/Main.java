public class Main {
    public static void main(String[] args) {
        // если друзей не меньше 3 приходим в ресторан  \ если меньше то ничего не делаем
        // открыт каждый четный месяц 2, 4, 6, 8, 10, 12. \ если в нечетные месеца то выявляем причину
        // начало ресторана с 9 до 22 \ если пришли вне время то выявляем причину
        // у каждого друга по 200 $
        // если сумма денег всех друзей больше 600 $  то покупаем еду и остаемся в ресторане. \ если сумма денег меньше то уходим по домам
        // если денег больше 1000 то забираем некоторые еды с собой домой для семьи  \  если меньше то уходим.
        int exactMonth = 4;
        int exactTime = 12;
        int friends = 3;
        double priceMenu = 599.99D;
        String information = "";
        String restaraunt = "";
        String friendsInfo = "";
        int cashSumOfEveryFriend = friends * 400;
        if(friends > 2) {
            if (exactMonth % 2 == 0 && (exactTime >= 8 && exactTime <= 22)) {
                restaraunt = "Открыт.";
                if(cashSumOfEveryFriend >= priceMenu)
                {
                    information = "Вы купили еду и остались в ресторане с друзьями.";
                    if(cashSumOfEveryFriend >= 1400)
                    {
                        information = "Вы купили и остались в ресторане и покупаете добавку для семьи.";
                        friendsInfo = "Вы прошаетесь друзями и уходите домой.";
                    }
                }
                else{
                    information = "У вас с друзьями не хватило денег и ушли по домам.";
                }
            }
            else{
                restaraunt = "Закрыт.";
                if (exactMonth % 2 == 1) {
                    information ="Пришли в нечетную месяц.";
                }
                else if (exactTime > 22){
                    information = "Пришли поздно.";
                }
                if (exactTime < 8) {
                    information = "Пришли рано.";
                }
            }
        }
        else {
            if (exactMonth % 2 == 1)
            {
                restaraunt = "Закрыт, пришли в нечетную месяц.";
                if(exactTime < 8)
                {
                    restaraunt = "Закрыт, пришли рано.";
                }
                else{
                    restaraunt = "Закрыт, пришли поздно.";
                }
            }
            else {
                restaraunt = "неизвестно.";
            }
            information = "Недостаточное количество друзей.";
        }

        System.out.println("Ресторан " + restaraunt);
        System.out.println(information);
        System.out.println(friendsInfo);
    }
}