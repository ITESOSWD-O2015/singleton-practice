import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by ShaSkills on 08/11/2015.
 */
public class DrinkTest {

    public Drink drink;

    @Before
    public void setUp(){
        drink = new Drink();
    }

    @Test
    public void testDescripcion(){
        drink.setDescription("Chesco");
        assertEquals("Chesco", drink.getDescription());
    }

    @Test
    public void testName(){
        drink.setName("Coca");
        assertEquals("Coca", drink.getName());
    }

    @Test
    public void testPtecio(){
        drink.setPrice(14);
        assertEquals(14, drink.getPrice(), 0);
    }

}
