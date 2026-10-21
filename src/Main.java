void main() {
    Scanner scan = new Scanner(System.in);
        int WaterInMl = 400;
        int MilkInMl = 540;
        int BeansInGrams = 120;
        int Cups = 9;
        int Money = 550;



    System.out.println("The coffee machine has:");
    System.out.printf("%d ml of water%n",WaterInMl );
    System.out.printf("%d ml of milk%n", MilkInMl);
    System.out.printf("%d g of coffee beans%n",BeansInGrams);
    System.out.printf("%d disposable cups%n",Cups);
    System.out.printf("$%d of money",Money);


    System.out.println("Write action (buy, fill, take):");
    String category = scan.next().toLowerCase();

    switch (category){
    case "buy":
        WaterInMl -= 250;
        BeansInGrams -= 16;
        Cups -= 1;
        Money += 4;
        break;
    case "fill":
        System.out.println(" Insert how many ml of water in the coffee machine:");
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
        System.out.printf("I gave you $%d", Money);
        Money -= Money;
        break;
    }

    System.out.println("The coffee machine has:");
    System.out.printf("%d ml of water%n",WaterInMl );
    System.out.printf("%d ml of milk%n", MilkInMl);
    System.out.printf("%d g of coffee beans%n",BeansInGrams);
    System.out.printf("%d disposable cups%n",Cups);
    System.out.printf("$%d of money",Money);


//    System.out.println("Write how many ml of water the coffee machine has:");
//    int waterMl = scan.nextInt();
//    System.out.println("Write how many ml of milk the coffee machine has:");
//    int milkMl = scan.nextInt();
//    System.out.println("Write how many grams of coffee beans the coffee machine has:");
//    int beanGrams = scan.nextInt();
//    System.out.println("Write how many cups of coffee you will need:");
//    int cupNeeds = scan.nextInt();

//    int maxCupsWater = waterMl/200;
//    int maxCupsMilk = milkMl/50;
//    int maxCupsBeans = beanGrams/15;
//
//    int maxCups = Math.min(maxCupsWater,Math.min(maxCupsMilk,maxCupsBeans));
//
//    int extraCups = maxCups - cupNeeds;
//
//    if(cupNeeds  == maxCups){
//        System.out.println("Yes, I can make that amount of coffee");
//    } else if (maxCups > cupNeeds) {
//        System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)",extraCups);
//
//    }else{
//        System.out.printf("No, I can only make %d cup(s) of coffee", maxCups);
//    }











    System.out.println("Starting to make a coffee");
    System.out.println("Grinding coffee beans");
    System.out.println("Boiling water");
    System.out.println("Mixing boiled water with crushed coffee beans");
    System.out.println("Pouring coffee in the cup");
    System.out.println("Pouring some milk in the cup");
    System.out.println("Coffee is ready!");

}

