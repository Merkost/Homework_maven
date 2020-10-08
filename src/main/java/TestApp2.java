import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestApp2 {
    private Boolean a;
    private int[] b;
    MainApp mainApp1;

    public TestApp2(Boolean a, int[] b) {
        this.a = a;
        this.b = b;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Boolean(true), new int[]{1, 1, 1, 4, 4, 1, 4,4}},
                {new Boolean(false), new int[]{1, 1, 1, 1, 1, 1 }},
                {new Boolean(false), new int[]{ 4, 4, 4, 4}},
                {new Boolean(false), new int[]{1, 4, 4, 1, 1, 4, 3}}
        });
    }

    @Before
    public void init() {
        mainApp1 = new MainApp();
    }

    @Test
    public void testOneFour() {
        Assert.assertEquals(a, mainApp1.massiveOneFour(b));
    }
}
