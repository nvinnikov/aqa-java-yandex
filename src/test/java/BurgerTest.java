import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import praktikum.*;

public class BurgerTest {
    Bun bun = new Bun("СмолТести", (float) 111.2);
    @Mock
    Database database;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void setBunsTest(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        Assert.assertEquals(burger.bun, bun);
    }
//    @Test
//    public void addIngredientTest(){
//        Burger burger = new Burger();
//
//        Assert.assertEquals();
//    }
//    @Test
//    public void removeIngredientTest(){
//        Assert.assertEquals();
//    }
//    @Test
//    public void moveIngredientTest(){
//        Assert.assertEquals();
//    }
//    @Test
//    public void getPriceTest(){
//        Assert.assertEquals();
//    }
//    @Test
//    public void getReceiptTest(){
//        Assert.assertEquals();
//    }

}
