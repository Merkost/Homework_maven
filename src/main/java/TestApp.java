import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestApp {
    private int[] a;
    private int[] b;
    MainApp mainApp;

    public TestApp(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{4,1}, new int[]{2,4,1}},
                {new int[]{4,2,2,5}, new int[]{5,8,9,3,2,4,5,4,6,4,2,2,5}},
                {new int[]{4}, new int[]{1, 2, 3, 5, 6, 7, 4}}
        });
    }

    @Before
    public void init() {
        mainApp = new MainApp();
    }

    @Test
    public void testMassiveFour() {
        Assert.assertArrayEquals(a, MainApp.massiveFour(b));
    }
}
