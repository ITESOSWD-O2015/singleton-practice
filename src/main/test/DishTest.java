import com.iteso.singleton.Dish;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by ShaSkills on 08/11/2015.
 */
public class DishTest {

    public Dish dish;

    @Before
    public void setUp(){
        dish = new Dish();
    }

    @Test
    public void testDescripcion(){
        dish.setDescription("Sopa");
        assertEquals("Sopa", dish.getDescription());
    }

    @Test
    public void testName(){
        dish.setName("Fideos");
        assertEquals("Fideos", dish.getName());
    }

    @Test
    public void testPtecio(){
        dish.setPrice(22);
        assertEquals(22, dish.getPrice(), 0);
    }

}
