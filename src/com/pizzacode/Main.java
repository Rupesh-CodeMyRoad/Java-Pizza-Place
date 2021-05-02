package com.pizzacode;


import com.pizzacode.classes.Pizza;
import com.pizzacode.classes.Topping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        float totalPrice = 0;
        int x,y,totalOrder = 0;
        List<Pizza> pizzaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm");
        String strDate = dateFormat.format(date);
        for(int i=0;i<=64;i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("----------------Welcome to The Pizza Place-----------------------");
        System.out.println("                      "+strDate+"                                ");
        for(int i=0;i<=64;i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.println("Do you want to place order ? (Y/N)");
        String opt = scanner.nextLine();

        switch(opt) {
            case "Y":
            case "y": {
                do {
                    List<String> toppingsList = new ArrayList<>();
                    Pizza pizza = new Pizza();
                    Topping topping = new Topping();
                    System.out.println("Select the size of pizza");
                    System.out.println(String.format("%-3s %-10s %s", "SN", "Size", "Price"));
                    System.out.println(String.format("%-3s %-10s %s", "1)", "Small", "$5.50"));
                    System.out.println(String.format("%-3s %-10s %s", "2)", "Medium", "$9.10"));
                    System.out.println(String.format("%-3s %-10s %s", "3)", "Large", "$13.70"));
                    int a;
                    a = scanner.nextInt();
                    if(a==1){
                        pizza.setSize("Small");
                        totalPrice = 5.50F;
                    }
                    if(a==2){
                        pizza.setSize("Medium");
                        totalPrice = 9.10F;
                    }
                    if(a==3){
                        pizza.setSize("Large");
                        totalPrice = 13.70F;
                    }
                    if (a!=1 && a!=2 && a!=3){
                        System.out.println("Invalid Option");
                        System.exit(0);
                    }
                    System.out.println("Select the type of crust");
                    System.out.println(String.format("%-3s %-10s", "SN", "Type"));
                    System.out.println(String.format("%-3s %-10s", "1)", "Thin"));
                    System.out.println(String.format("%-3s %-10s", "2)", "Thick"));
                    System.out.println("*** Note : Thick-crust pizzas cost $2.20 extra compared to thin-crust pizzas (regardless of size) ***");
                    a = scanner.nextInt();
                    if (a==1){
                        pizza.setCrust("Thin");
                        totalPrice = totalPrice;
                    }
                    if (a==2){
                        pizza.setCrust("Thick");
                        totalPrice = totalPrice + 2.20F;
                    }
                    if (a!=1 && a!=2){
                        System.out.println("Invalid Option");
                        System.exit(0);
                    }
                    System.out.println("****Toppings****");
                    System.out.println("**Can have up to 8 toppings but no more**");
                    System.out.println("Select a sauce");
                    System.out.println(String.format("%-3s %-20s %s", "SN", "Sauce", "Price"));
                    System.out.println(String.format("%-3s %-20s %s", "1)", "Tomato-paste", "$1.00"));
                    System.out.println(String.format("%-3s %-20s %s", "2)", "Barbeque-flavoured", "$1.80"));
                    a = scanner.nextInt();
                    if (a==1){
                        toppingsList.add("tomato-paste sauce");
                        totalPrice = totalPrice + 1.00F;
                    }
                    if (a==2){
                        toppingsList.add("barbeque sauce");
                        totalPrice = totalPrice + 1.80F;
                    }
                    if (a!=1 && a!=2){
                        System.out.println("Invalid Option");
                        System.exit(0);
                    }
                    List<Topping> otherToppings = new ArrayList<>();
                    do {
                            System.out.println("Select upto 3 meat/seafood toppings");
                            System.out.println(String.format("%-3s %-20s %s", "SN", "Topping", "Price"));
                            System.out.println(String.format("%-3s %-20s %s", "1)", "Ham", "$0.50"));
                            System.out.println(String.format("%-3s %-20s %s", "2)", "Salami", "$0.50"));
                            System.out.println(String.format("%-3s %-20s %s", "3)", "Bacon", "$0.90"));
                            System.out.println(String.format("%-3s %-20s %s", "4)", "Chicken", "$2.00"));
                            System.out.println(String.format("%-3s %-20s %s", "5)", "Shrimp", "$1.40"));
                            a=scanner.nextInt();
                            if (a==1){
                                toppingsList.add("ham");
                                totalPrice=totalPrice+0.50F;
                            }
                            if (a==2){
                                toppingsList.add("salami");
                                totalPrice=totalPrice+0.50F;
                            }
                            if (a==3){
                                toppingsList.add("bacon");
                                totalPrice=totalPrice+0.90F;
                            }
                            if (a==4){
                                toppingsList.add("chicken");
                                totalPrice=totalPrice+2.00F;
                            }
                            if (a==5){
                                toppingsList.add("shrimp");
                                totalPrice=totalPrice+1.40F;
                            }
                        if (a!=1 && a!=2 && a!=3 && a!=4 && a!=5){
                            System.out.println("Invalid Option");
                            System.exit(0);
                        }
                            otherToppings.add(topping);
                            if (otherToppings.size() < 3){
                                System.out.println("Do you want to add more meat/seafood topping ? (Press 1 for add more / Press 0 to continue)");
                                y = scanner.nextInt();
                            }
                            else {
                                y =0;
                            }
                    }while (y!=0);
                do {
                    System.out.println("Select other toppings");
                    System.out.println(String.format("%-3s %-20s %s", "SN", "Topping", "Price"));
                    System.out.println(String.format("%-3s %-20s %s", "1)", "Capsicum", "$0.30"));
                    System.out.println(String.format("%-3s %-20s %s", "2)", "Onion", "$0.20"));
                    System.out.println(String.format("%-3s %-20s %s", "3)", "Tomatoes", "$0.40"));
                    System.out.println(String.format("%-3s %-20s %s", "4)", "Mushrooms", "$0.45"));
                    System.out.println(String.format("%-3s %-20s %s", "5)", "Pineapple", "$0.45"));
                    System.out.println(String.format("%-3s %-20s %s", "6)", "Egg", "$0.25"));
                    System.out.println(String.format("%-3s %-20s %s", "7)", "Olives", "$0.35"));
                    System.out.println(String.format("%-3s %-20s %s", "8)", "Garlic", "$0.30"));
                    System.out.println(String.format("%-3s %-20s %s", "9)", "Cheese", "$0.20"));
                    System.out.println(String.format("%-3s %-20s %s", "10)", "Pumpkin", "$0.50"));

                    a=scanner.nextInt();
                    if (a==1){
                       toppingsList.add("capsicum");
                        totalPrice=totalPrice+0.30F;
                    }
                    if (a==2){
                       toppingsList.add("onion");
                        totalPrice=totalPrice+0.20F;
                    }
                    if (a==3){
                       toppingsList.add("tomatoes");
                        totalPrice=totalPrice+0.40F;
                    }
                    if (a==4){
                       toppingsList.add("mushrooms");
                        totalPrice=totalPrice+0.45F;
                    }
                    if (a==5){
                        toppingsList.add("pineapple");
                        totalPrice=totalPrice+0.45F;
                    }
                    if (a==6){
                       toppingsList.add("egg");
                        totalPrice=totalPrice+0.25F;
                    }
                    if (a==7){
                        toppingsList.add("olives");
                        totalPrice=totalPrice+0.35F;
                    }
                    if (a==8){
                        toppingsList.add("garlic");
                        totalPrice=totalPrice+0.30F;
                    }
                    if (a==9){
                       toppingsList.add("cheese");
                        totalPrice=totalPrice+0.20F;
                    }
                    if (a==10){
                       toppingsList.add("pumpkin");
                        totalPrice=totalPrice+0.50F;
                    }
                    if (a!=1 && a!=2 && a!=3 && a!=4 && a!=5 && a!=6 && a!=7 && a!=8 && a!=9 && a!=10){
                        System.out.println("Invalid Option");
                        System.exit(0);
                    }
                    otherToppings.add(topping);
                    if (otherToppings.size() < 8){
                        System.out.println("Do you want to add more meat/seafood topping ? (Press 1 for add more / Press 0 to continue)");
                        y = scanner.nextInt();
                    }
                    else {
                        y =0;
                    }
                }while (y!=0);
                topping.setToppingName(toppingsList);
                totalOrder = totalOrder +1 ;
                pizza.setToppings(topping);
                pizza.setTotalPrice(totalPrice);
                pizzaList.add(pizza);
                    System.out.println("Current Orders :- ");
                    for (int i=0; i < pizzaList.size();i++ ) {
                        System.out.println(i+1+") "+pizzaList.get(i));
                    }
                    if (totalOrder <3 ){
                        System.out.println("Do you want to order another Pizza ? (Press 1 to order another pizza / Press 0 for the Bill)");
                        x = scanner.nextInt();
                        if (x!=1){
                            System.out.println("Final Orders :- ");
                            for (int i=0; i < pizzaList.size();i++ ) {
                                System.out.println(i+1+") "+pizzaList.get(i));
                            }
                            }
                    }else
                        x=0;
                    System.out.println("Final Orders :- ");
                    for (int i=0; i < pizzaList.size();i++ ) {
                        System.out.println(i+1+") "+pizzaList.get(i));
                    }
                }
            while (x!=0);
            }
            case "N":
            case "n": {
                System.out.println("Thank You For Coming");
                break;
            }
            default :
                System.out.println("Invalid Option");
                System.exit(0);
        }
    }
}
