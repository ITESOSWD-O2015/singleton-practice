package waiters_test;
import com.iteso.singleton.Dish;
import com.iteso.singleton.Drink;
import com.iteso.singleton.TableOrder;
import com.iteso.singleton.waiter;
import com.iteso.singleton.waiters.waiter_A;
import org.junit.*;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by Paloma on 03/11/2015.
 */
public class waiterA_Test {
    private waiter waiter;
    private TableOrder table;
    private Drink drink;
    private Dish dish;

    @Before
    public void setUp(){
        table = mock(com.iteso.singleton.TableOrder.class);
        waiter = new waiter_A();
    }

    @Test
    public void testAddDrink(){
        drink = mock(Drink.class);
        waiter_A mockedWaiter = mock(waiter_A.class);
        when(mockedWaiter.getTableInstance(3)).thenReturn(table);
        assertTrue(waiter.addDrink(drink,3));
    }

    @Test
    public void testAddDish(){
        dish = mock(Dish.class);
        waiter_A mockedWaiter = mock(waiter_A.class);
        when(mockedWaiter.getTableInstance(1)).thenReturn(table);
        assertTrue(waiter.addDish(dish,1));
    }

    @Test
    public void testGiveCheck(){
        waiter_A mockedWaiter = mock(waiter_A.class);
        when(mockedWaiter.getTableInstance(2)).thenReturn(table);
        assertTrue(waiter.GiveMeTheCheck(2));
    }

}
