import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Author: Wei Guangcheng
 * Time: 12-12-9 10:42
 */
public class TestRunner {
    public static void main(String[] args) throws ClassNotFoundException {
        boolean success = true;
        Class toBeTest = Class.forName("FooTest");
        for (Method method : FooTest.class.getMethods()) {
            if (method.getName().startsWith("test_")) {
                try {
                    method.invoke(toBeTest.newInstance());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                } catch (InvocationTargetException e) {
                    success = false;
                    Throwable ex = e.getCause();
                    ex.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        }

        if (!success) System.exit(1);
    }
}
