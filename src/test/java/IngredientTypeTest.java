import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

public class IngredientTypeTest {
    @Test
    public void getIngredientTypeTest() {
        Assert.assertNotNull(IngredientType.SAUCE);
        Assert.assertNotNull(IngredientType.FILLING);
    }
}
