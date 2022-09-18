import model.*;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args){
        Meat meat = new Meat(5, 100.000);
        Apple red_apple = new Apple(10, 50.00, Colour.COLOR_RED);
        Apple green_apple = new Apple(8, 60.00, Colour.COLOR_GREEN);

        Food[] foods = {meat, red_apple, green_apple};

        ShoppingCart carts = new ShoppingCart(foods);

        System.out.println(carts.getSumWithDiscount());
        System.out.println(carts.getSumWithoutDiscount());
        System.out.println(carts.getVeganWithoutDiscount());
    }
}
