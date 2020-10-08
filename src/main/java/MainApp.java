import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApp {

    private static final Logger logger = Logger.getLogger(MainApp.class.getName());

    public static void main(String[] args) {

    }

    public static int[] massiveFour(int[] m){
            int begin = 0;
            for (int i = m.length-1; i > 0; i--) {
                if (m[i] == 4) {
                    begin = i;
                    break;
                } else if (i == 0) {
                    logger.log(Level.WARNING, "Массив не содержит цифру 4", new RuntimeException());
                    return new int[]{0};

                }
            }
            int[] arr = new int[m.length-begin];
            for (int i = begin, j=0; i < m.length; i++, j++) {
                arr[j] = m[i];
            }
            return arr;
    }

    public Boolean massiveOneFour(int[] m){
        Boolean flag1 = false, flag2 = false;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == 1) {
                flag1 = true;
            }
            else if (m[i] == 4) {
                flag2 = true;
            }
            else return false;
        }
        if (flag1 && flag2) {
            return true;
        }
        else {
            return false;
        }
    }
}
