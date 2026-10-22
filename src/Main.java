void main() {
    Scanner scan = new Scanner(System.in);
    int WaterInMl = 400;
    int MilkInMl = 540;
    int BeansInGrams = 120;
    int Cups = 9;
    int Money = 550;


    boolean stillLooping = true;

    while (stillLooping) {
        System.out.print("Write action (buy, fill, take, remaining, exit): ");
        String category = scan.next().toLowerCase();

        switch (category) {
        case "buy":

                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String drink = scan.next().toLowerCase();
                if (drink.equals("1") || drink.equals("espresso")) {

                    if (Cups < 1) {
                        System.out.println("Sorry, not enough cups!");

                    } else if (WaterInMl < 250) {
                        System.out.println("Sorry, not enough water!");

                    } else if (BeansInGrams < 16) {
                        System.out.println("Sorry, not enough beans!");
                    } else {
                        System.out.println("I have enough resources, making you a Espresso!");
                        WaterInMl -= 250;
                        BeansInGrams -= 16;
                        Money += 4;
                        Cups -= 1;
                    }

                } else if (drink.equals("2") || drink.equals("latte")) {

                    if (Cups < 1) {
                        System.out.println("Sorry, not enough cups!");

                    } else if (WaterInMl < 350) {
                        System.out.println("Sorry, not enough water!");

                    } else if (MilkInMl < 75) {

                        System.out.println("Sorry, not enough milk!");

                    } else if (BeansInGrams < 20) {

                        System.out.println("Sorry, not enough beans!");

                    } else {
                        System.out.println("I have enough resources, making you a Latte!");
                        WaterInMl -= 350;
                        MilkInMl -= 75;
                        BeansInGrams -= 20;
                        Money += 7;
                        Cups -= 1;
                    }

                } else if (drink.equals("3") || drink.equals("cappuccino")) {

                    if (Cups < 1) {
                        System.out.println("Sorry, not enough cups!");

                    } else if (WaterInMl < 200) {
                        System.out.println("Sorry, not enough water!");

                    } else if (MilkInMl < 100) {

                        System.out.println("Sorry, not enough milk!");

                    } else if (BeansInGrams < 12) {

                        System.out.println("Sorry, not enough beans!");

                    } else {
                        System.out.println("I have enough resources, making you a Cappuccino!");
                        WaterInMl -= 200;
                        MilkInMl -= 100;
                        BeansInGrams -= 12;
                        Money += 6;
                        Cups -= 1;
                    }

                } else if (drink.equals("back")) {
                    break;
                }

            break;
        case "fill":
            System.out.println("Insert how many ml of water in the coffee machine:");
            int insertWater = scan.nextInt();
            System.out.println("Insert how many ml of milk the in the coffee machine:");
            int insertMilk = scan.nextInt();
            System.out.println("Insert how many grams of coffee beans in the coffee machine:");
            int insertBeans = scan.nextInt();
            System.out.println("Insert how many cups in the coffee machine:");
            int insertCups = scan.nextInt();
            WaterInMl += insertWater;
            MilkInMl += insertMilk;
            BeansInGrams += insertBeans;
            Cups += insertCups;
            break;
        case "take":
            System.out.printf("I gave you $%d%n", Money);
            Money = 0;
            break;
        case "remaining":
            System.out.println("The coffee machine has:");
            System.out.printf("%d ml of water%n", WaterInMl);
            System.out.printf("%d ml of milk%n", MilkInMl);
            System.out.printf("%d g of coffee beans%n", BeansInGrams);
            System.out.printf("%d disposable cups%n", Cups);
            System.out.printf("$%d of money%n", Money);
            break;
        case "exit":
            stillLooping = false;
            break;
        }

    }

}

