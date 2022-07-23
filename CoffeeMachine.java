package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        stage 1 - Printing info on screen
//        String start = "Starting to make a coffee";
//        System.out.println(start);
//        String grind = "Grinding coffee beans";
//        System.out.println(grind);
//        String boil = "Boiling water";
//        System.out.println(boil);
//        String mix = "Mixing boiled water with crushed coffee beans";
//        System.out.println(mix);
//        String pourC = "Pouring coffee into the cup";
//        System.out.println(pourC);
//        String pourM = "Pouring some milk into the cup";
//        System.out.println(pourM);
//        String ready = "Coffee is ready!";
//        System.out.println(ready);

//        stage 2 - Ingredient calculator
//        String question = "Write how many cups of coffee you will need:";
//        System.out.println(question);
//        int userInput = scan.nextInt();
//        String answer = "For " + userInput + " cups of coffee you will need:";
//        System.out.println(answer);
//        int water = 200;
//        int milk = 50;
//        int coffee = 15;
//        String waterCalc = " ml of water";
//        String milkCalc = " ml of milk";
//        String coffeeCalc = " g of coffee beans";

//        System.out.println(water * userInput + waterCalc);
//        System.out.println(milk * userInput + milkCalc);
//        System.out.println(coffee * userInput + coffeeCalc);
//
//        stage 3 - Estimate the number of servings
//        System.out.println("Write how many ml of water the coffee machine has:");
//        int waterAmount = scan.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        int milkAmount = scan.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        int coffeeAmount = scan.nextInt();
//        System.out.println("Write how many cups of coffee you will need:");
//        int cupsNeeded = scan.nextInt();
//
//        if (waterAmount >= water && milkAmount >= milk && coffeeAmount >= coffee) {
//            int waterRes = waterAmount / water;
//            int milkRes = milkAmount / milk;
//            int coffeeRes = coffeeAmount / coffee;
//            int min = Math.min(Math.min(waterRes, milkRes), coffeeRes);
//            int remainder = min - cupsNeeded;
//            if (min == cupsNeeded){
//                System.out.println("Yes, I can make that amount of coffee");
//            } else if (min < cupsNeeded){
//                System.out.println("No, I can make only " + min + "amount of coffee");
//            } else if (min > remainder) {
//                System.out.println("Yes, I can make that amount of coffee (and even " + remainder + "more than that");
//            }
//        }

//        stage 4 Buy, fill, take

//        int waterOnMachine = 400;
//        int milkOnMachine = 540;
//        int coffeeOnMachine = 120;
//        int cupsOnMachine = 9;
//        int moneyOnMachine = 550;
//        System.out.println("Write action (buy, fill, take");
//        String action = scan.next();
//
//        int actualWater;
//        int actualMilk;
//        int actualCoffee;
//        int actualCups;
//        int actualMoney;
//
//        if (action.equals("buy")) {
//            System.out.println("The coffee machine has:");
//            System.out.println(waterOnMachine + " ml of water");
//            System.out.println(milkOnMachine + " ml of milk");
//            System.out.println(coffeeOnMachine + " g of coffee beans:");
//            System.out.println(cupsOnMachine + " disposable cups:");
//            System.out.println("$" + moneyOnMachine + " of money:");
//            System.out.println();
//
//            System.out.println("What do you want to buy? - 1 espresso, 2 - latte, 3 - cappuccino:");
//            int option = scan.nextInt();
//
//
//            switch (option) {
//                case 1:
//                    actualWater = waterOnMachine - 250;
//                    actualMilk = milkOnMachine;
//                    actualCoffee = coffeeOnMachine - 16;
//                    actualCups = cupsOnMachine - 1;
//                    actualMoney = moneyOnMachine + 4;
//                    System.out.println("The coffee machine has:");
//                    System.out.println(actualWater + " ml of water");
//                    System.out.println(actualMilk + " ml of milk");
//                    System.out.println(actualCoffee + " g of coffee beans:");
//                    System.out.println(actualCups + " disposable cups:");
//                    System.out.println("$" + actualMoney + " of money:");
//                    break;
//
//                case 2:
//                    actualWater = waterOnMachine - 350;
//                    actualMilk = milkOnMachine - 75;
//                    actualCoffee = coffeeOnMachine - 20;
//                    actualCups = cupsOnMachine - 1;
//                    actualMoney = moneyOnMachine + 7;
//                    System.out.println("The coffee machine has:");
//                    System.out.println(actualWater + " ml of water");
//                    System.out.println(actualMilk + " ml of milk");
//                    System.out.println(actualCoffee + " g of coffee beans:");
//                    System.out.println(actualCups + " disposable cups:");
//                    System.out.println("$" + actualMoney + " of money:");
//                    break;
//
//                case 3:
//                    actualWater = waterOnMachine - 200;
//                    actualMilk = milkOnMachine - 100;
//                    actualCoffee = coffeeOnMachine - 12;
//                    actualCups = cupsOnMachine - 1;
//                    actualMoney = moneyOnMachine + 6;
//                    System.out.println("The coffee machine has:");
//                    System.out.println(actualWater + " ml of water");
//                    System.out.println(actualMilk + " ml of milk");
//                    System.out.println(actualCoffee + " g of coffee beans:");
//                    System.out.println(actualCups + " disposable cups:");
//                    System.out.println("$" + actualMoney + " of money:");
//                    break;
//
//            }
//        } else if (action.equals("fill")) {
//            System.out.println("The coffee machine has:");
//            System.out.println(waterOnMachine + " ml of water");
//            System.out.println(milkOnMachine + " ml of milk");
//            System.out.println(coffeeOnMachine + " g of coffee beans:");
//            System.out.println(cupsOnMachine + " disposable cups:");
//            System.out.println("$" + moneyOnMachine + " of money:");
//            System.out.println();
//            System.out.println("Write how many ml of water you want to add:");
//            waterOnMachine += scan.nextInt();
//            System.out.println("Write how many ml of milk you want to add:");
//            milkOnMachine += scan.nextInt();
//            System.out.println("Write how many grams of coffee beans you want to add:");
//            coffeeOnMachine += scan.nextInt();
//            System.out.println("Write how many disposable cups you want to add:");
//            cupsOnMachine += scan.nextInt();
//            System.out.println("I gave you $ " + moneyOnMachine);
//            System.out.println("The coffee machine has:");
//            System.out.println(waterOnMachine + " ml of water");
//            System.out.println(milkOnMachine + " ml of milk");
//            System.out.println(coffeeOnMachine + " g of coffee beans:");
//            System.out.println(cupsOnMachine + " disposable cups:");
//            System.out.println("$" + moneyOnMachine + " of money:");
//
//
//
//        } else if (action.equals("take")) {
//            System.out.println("The coffee machine has:");
//            System.out.println(waterOnMachine + " ml of water");
//            System.out.println(milkOnMachine + " ml of milk");
//            System.out.println(coffeeOnMachine + " g of coffee beans:");
//            System.out.println(cupsOnMachine + " disposable cups:");
//            System.out.println("$" + moneyOnMachine + " of money:");
//            System.out.println();
//            System.out.println("I gave you $ " + moneyOnMachine);
//            moneyOnMachine = 0;
//            System.out.println("The coffee machine has:");
//            System.out.println(waterOnMachine + " ml of water");
//            System.out.println(milkOnMachine + " ml of milk");
//            System.out.println(coffeeOnMachine + " g of coffee beans:");
//            System.out.println(cupsOnMachine + " disposable cups:");
//            System.out.println("$" + moneyOnMachine + " of money:");
//        }
//
//        stage 5: Keep track of the supplies
//
        int waterOnMachine = 400;
        int milkOnMachine = 540;
        int coffeeOnMachine = 120;
        int cupsOnMachine = 9;
        int moneyOnMachine = 550;
        System.out.println("Write action (buy, fill, take, remaining, exit)");
        String action;

        do {
            System.out.println();
            switch (action = scan.next()) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String buying = scan.next();
                    if (buying.equals("1")) {
                        if (waterOnMachine >= 250 && coffeeOnMachine >= 16 && cupsOnMachine >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            waterOnMachine -= 250;
                            coffeeOnMachine -= 16;
                            cupsOnMachine -= 1;
                            moneyOnMachine += 4;
                            System.out.println();
                            break;
                        } else if (waterOnMachine < 250) {
                            System.out.println("Sorry, not enough water!");
                            System.out.println();
                            break;
                        } else if (coffeeOnMachine < 16) {
                            System.out.println("Sorry, not enough coffee!");
                            System.out.println();
                            break;
                        } else if (cupsOnMachine < 1) {
                            System.out.println("Sorry, not enough cups!");
                            System.out.println();
                            break;
                        }
                        break;
                    }

                    if (buying.equals("2")) {
                        if (waterOnMachine >= 350 && milkOnMachine >= 75 && coffeeOnMachine >= 20 && cupsOnMachine >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            waterOnMachine -= 350;
                            milkOnMachine -= 75;
                            coffeeOnMachine -= 20;
                            cupsOnMachine -= 1;
                            moneyOnMachine += 7;
                            System.out.println();
                            System.out.println("Write action (buy, fill, take, remaining, exit)");
                            break;
                        } else if (waterOnMachine < 350) {
                            System.out.println("Sorry, not enough water!");
                            System.out.println();
                            System.out.println("Write action (buy, fill, take, remaining, exit)");
                            break;
                        } else if (milkOnMachine < 75) {
                            System.out.println("Sorry, not enough milk!");
                            System.out.println();
                            break;
                        } else if (coffeeOnMachine < 20) {
                            System.out.println("Sorry, not enough coffee!");
                            System.out.println();
                            break;
                        } else if (cupsOnMachine < 1) {
                            System.out.println("Sorry, not enough cups!");
                            System.out.println();
                            break;
                        }
                        break;
                    }

                    if (buying.equals("3")) {
                        if (waterOnMachine >= 200 && milkOnMachine >= 100 && coffeeOnMachine >= 12 && cupsOnMachine >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            waterOnMachine -= 200;
                            milkOnMachine -= 100;
                            coffeeOnMachine -= 12;
                            cupsOnMachine -= 1;
                            moneyOnMachine += 6;
                            System.out.println();
                            break;
                        } else if (waterOnMachine < 200) {
                            System.out.println("Sorry, not enough water!");
                            System.out.println();
                            break;
                        } else if (milkOnMachine < 100) {
                            System.out.println("Sorry, not enough milk!");
                            System.out.println();
                            break;
                        } else if (coffeeOnMachine < 12) {
                            System.out.println("Sorry, not enough coffee!");
                            System.out.println();
                            break;
                        } else if (cupsOnMachine < 1) {
                            System.out.println("Sorry, not enough cups!");
                            System.out.println();
                            break;
                        }
                        break;
                    }
                    if (buying.equals("back")) {
                        break;
                    }

                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(waterOnMachine + " ml of water");
                    System.out.println(milkOnMachine + " ml of milk");
                    System.out.println(coffeeOnMachine + " g of coffee beans");
                    System.out.println(cupsOnMachine + " disposable cups");
                    System.out.println("$" + moneyOnMachine + " of money");
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit)");
                    break;

                case "take":
                    System.out.println("I gave you $ " + moneyOnMachine);
                    moneyOnMachine = 0;
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit)");
                    break;

                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    waterOnMachine += scan.nextInt();
                    System.out.println("Write how many ml of milk you want to add:");
                    milkOnMachine += scan.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    coffeeOnMachine += scan.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    cupsOnMachine += scan.nextInt();
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit)");
                    break;

            }
        } while (!"exit".equals(action));
    }
}
