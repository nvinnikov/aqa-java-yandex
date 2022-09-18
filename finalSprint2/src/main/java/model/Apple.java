package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple extends Food{
    public String colour;
    public Apple(int amount, double price, String colour){
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount(){
        if(Objects.equals(colour, Colour.COLOR_RED)){
            return Discount.DISCOUNT_60;
        } else {
            return Discount.DISCOUNT_0;
        }
    }
}
