public class Main {
    public static void main(String[] args)
    {
        // < 9 - 18 > 13 .. 14
        int currentTime = 15;
        boolean phone = true;
        int pricePhone = 550;
        int myCash = 550;
        String shop = "";
        String info = "";

        if(currentTime >= 9 && currentTime <= 18 && currentTime != 13 && currentTime != 14) {
            shop = "Открыт";
            if(phone) {
                if (pricePhone >ы myCash) {
                    info = "Не купили телефон!";
                }
                else
                {
                    info = "Купили телефон!";
                }
            }
            else{
                System.out.println("Нету в наличии!");
            }
        } else {
            shop = "Закрыт";
            if(currentTime == 13 || currentTime == 14)
            {
                info = "Пришли в обед.";
            }
            if (currentTime < 9) {
                info = "Пришли рано!";
            }
            else {
                info ="Пришли поздно!";
            }
        }

        System.out.println("Магазин: " + shop);
        System.out.println("Информация: " + info);
    }
}