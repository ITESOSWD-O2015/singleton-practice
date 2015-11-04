import com.iteso.singleton.Drink;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Paloma on 03/11/2015.
 */
public class drinkTest {
    private Drink drink;

    @Before
    public void setUp(){
        drink = new Drink();
    }

    @Test
    public void testPrice(){
        drink.setPrice(10);
        assertEquals(10, drink.getPrice(),0);
    }

    @Test
    public void testPriceNegative(){
        drink.setPrice(-10);
        assertEquals(-1, drink.getPrice(),0); // mi condicion de error fue que cualquier numero negativo se pusiera en -1, y eso equivale a que es un error
    }

    @Test
    public void testName(){
        drink.setName("horchata");
        assertEquals("horchata", drink.getName());
    }

    @Test
    public void testDescription(){
        drink.setDescription("agua de sabor");
        assertEquals("agua de sabor", drink.getDescription());
    }
}
