package com.pizzacode.classes;

import java.util.List;

public class Topping {
    private List<String> toppingName;

    public Topping(){}

    public Topping(List<String> toppingName){
        this.toppingName=toppingName;
    }

    public List<String> getToppingName() {
        return toppingName;
    }

    public void setToppingName(List<String> toppingName) {
        this.toppingName = toppingName;
    }
}
