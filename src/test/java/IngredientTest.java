import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import praktikum.Database;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {
    private IngredientType ingredientType;

    @Test
    public void getPriceTest(){
        Ingredient ingredient = new Ingredient(ingredientType, "qwe", (float) 2.2);
        Assert.assertEquals((float) 2.2, ingredient.getPrice(), 0.01);
    }
    @Test
    public void getNameTest(){
        Ingredient ingredient = new Ingredient(ingredientType, "qwe", (float) 2.2);
        Assert.assertEquals("qwe", ingredient.getName());
    }
    @Test
    public void getTypeTest(){
        Ingredient ingredient = new Ingredient(ingredientType, "qwe", (float) 2.2);
        Assert.assertEquals(ingredientType, ingredient.getType());
    }
}
