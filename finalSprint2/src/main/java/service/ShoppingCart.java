package service;
import model.Food;

public class ShoppingCart {

    Food[] foods;

    public ShoppingCart(Food[] foods){
        this.foods = new Food[foods.length];
        for (int i = 0; i < foods.length; i++){
            this.foods[i] = foods[i];
        }
    }

    public double getSumWithoutDiscount(){
        double sum = 0.0;
        for (Food food : foods) {
            sum += food.getPrice() * (double) food.getAmount();
        }
        return sum;
    }

    public double getSumWithDiscount(){
        double sum = 0.0;
        for (Food food : foods) {
            sum += food.getPrice() * (double) food.getAmount() * (100.00 - food.getDiscount()) / 100.00;
        }
        return sum;
    }
    public double getVeganWithoutDiscount(){
        double sum = 0.0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                sum += food.getPrice() * (double) food.getAmount();
            }
        }
        return sum;
    }

}
