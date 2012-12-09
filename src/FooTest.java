import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Author: Wei Guangcheng
 * Time: 12-12-7 10:06
 */
public class FooTest {
    public static void main(String[] args) {
        boolean success = true;
        FooTest fooTest = new FooTest();
        for (Method method : FooTest.class.getMethods()) {
            if(method.getName().startsWith("test_")){
            try {
                success = (Boolean)method.invoke(fooTest) && success;
            } catch (IllegalAccessException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (InvocationTargetException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }                                        }
        }

        if(!success) System.exit(1);
    }

    public boolean test_foo_add_2_and_2_should_be_4() {
        boolean foo_add_2_and_2_should_be_4 = new Foo().add(2, 2) == 4;
        if (!foo_add_2_and_2_should_be_4) System.out.println("test_foo_add_2_and_2_should_be_4 fails!!");
        return foo_add_2_and_2_should_be_4;
    }

    public boolean test_foo_add_1_and_2_should_be_3() {
        boolean foo_add_1_and_2_should_be_3 = new Foo().add(1, 2) == 3;
        if (!foo_add_1_and_2_should_be_3) System.out.println("test_foo_add_1_and_2_should_be_3 fails!!");
        return foo_add_1_and_2_should_be_3;
    }
}
