import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import praktikum.Database;

public class BurgerTest {
    @Mock
    Database database;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
//    @Test
//    public void getPriceTest(){
//        Assert.assertEquals();
//    }
}
