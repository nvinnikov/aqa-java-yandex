import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BunTest {
    private final String name;
    private final float price;

    public BunTest(String name, float price){
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] params() {
        return new Object[][]{
                {"СмолТести", 111.2},
                {"МедиумТести", 123.0}
        };
    }

    @Test
    public void getNameTest(){
        Bun bun = new Bun(name, price);
        Assert.assertEquals(name ,bun.getName());
    }
    @Test
    public void getPriceTest(){
        Bun bun = new Bun(name, price);
        Assert.assertEquals(price ,bun.getPrice(), 0.01);
    }
}
