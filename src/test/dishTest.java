
import com.iteso.singleton.Dish;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by Paloma on 03/11/2015.
 */
public class dishTest {
    private Dish dish;

    @Before
    public void setUp(){
        dish = new Dish();
    }

    @Test
    public void testPrice(){
        dish.setPrice(60);
        assertEquals(60, dish.getPrice(),0);
    }

    @Test
    public void testPriceNegative(){
        dish.setPrice(-50);
        assertEquals(-1, dish.getPrice(),0); // mi condicion de error fue que cualquier numero negativo se pusiera en -1, y eso equivale a que es un error
    }

    @Test
    public void testName(){
        dish.setName("pozole");
        assertEquals("pozole", dish.getName());
    }

    @Test
    public void testDescription(){
        dish.setDescription("comida mexicana");
        assertEquals("comida mexicana", dish.getDescription());
    }


}
