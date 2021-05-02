package com.pizzacode.classes;

public class Pizza {
    private int id;
    private String size;
    private String crust;
    private float totalPrice;
    private Topping toppings;

    public Pizza(){}

    public Pizza(int id,String size,String crust,float totalPrice,Topping toppings){
        this.id=id;
        this.size=size;
        this.crust=crust;
        this.totalPrice=totalPrice;
        this.toppings=toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public Topping getToppings() {
        return toppings;
    }

    public void setToppings(Topping toppings) {
        this.toppings = toppings;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalprice) {
        this.totalPrice = totalprice;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (String toppings : toppings.getToppingName()){
            str.append(toppings);
            str.append(",");
        }
        String toppings = str.toString();
        return size+" "+crust+"-Crust pizza, with "+toppings+" price: $" + totalPrice;
    }
}
