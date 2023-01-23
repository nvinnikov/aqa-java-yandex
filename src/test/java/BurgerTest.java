import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    @Test
    public void setBunsTest() {
        Burger burger = new Burger();
        Bun bun = new Bun("СмолТести", (float) 111.2);
        burger.setBuns(bun);
        Assert.assertEquals(bun, burger.bun);
    }

    @Test
    public void addIngredientTest() {
        Burger burger = new Burger();
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Лук", (float) 20.0);
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(ingredient);
        burger.addIngredient(ingredient);
        Assert.assertEquals(ingredients, burger.ingredients);
    }

    @Test
    public void removeIngredientTest() {
        Burger burger = new Burger();
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Лук", (float) 20.0);
        List<Ingredient> ingredients = new ArrayList<>();
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertEquals(ingredients, burger.ingredients);
    }

    @Test
    public void moveIngredientTest() {
        Burger burger = new Burger();
        Ingredient ingredient0 = new Ingredient(IngredientType.SAUCE, "Лук", (float) 20.0);
        Ingredient ingredient1 = new Ingredient(IngredientType.FILLING, "Помидор", (float) 50.0);
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(ingredient1);
        ingredients.add(ingredient0);
        burger.addIngredient(ingredient0);
        burger.addIngredient(ingredient1);
        burger.moveIngredient(0, 1);
        Assert.assertEquals(ingredients, burger.ingredients);
    }

    @Test
    public void getPriceTest() {
        Burger burger = new Burger();
        Bun bun = new Bun("СмолТести", (float) 111.2);
        burger.setBuns(bun);
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Лук", (float) 20.0);
        burger.addIngredient(ingredient);
        Assert.assertEquals((float) 242.4, burger.getPrice(), 0.01);
    }

    @Test
    public void getReceiptTest() {
        Burger burger = new Burger();
        Bun bun = new Bun("СмолТести", (float) 111.2);
        burger.setBuns(bun);
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Лук", (float) 20.0);
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(ingredient);
        burger.addIngredient(ingredient);
        StringBuilder receipt = new StringBuilder(String.format("(==== %s ====)%n", bun.getName()));
        for (Ingredient i : ingredients) {
            receipt.append(String.format("= %s %s =%n", i.getType().toString().toLowerCase(),
                    i.getName()));
        }
        receipt.append(String.format("(==== %s ====)%n", bun.getName()));
        receipt.append(String.format("%nPrice: %f%n", (float) 242.4));
        Assert.assertEquals(receipt.toString(), burger.getReceipt());
    }

}
