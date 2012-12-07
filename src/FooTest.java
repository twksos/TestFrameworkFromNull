/**
 * Author: Wei Guangcheng
 * Time: 12-12-7 10:06
 */
public class FooTest {
    public static void main(String[] args) {
        boolean success = true;
        FooTest fooTest = new FooTest();
        success = fooTest.foo_add_1_and_2_should_be_3() && success;
        success = fooTest.foo_add_2_and_2_should_be_4() && success;
        if(!success) System.exit(1);
    }

    private boolean foo_add_2_and_2_should_be_4() {
        boolean foo_add_2_and_2_should_be_4 = new Foo().add(2, 2) == 4;
        if (!foo_add_2_and_2_should_be_4) System.out.println("foo_add_2_and_2_should_be_4 fails!!");
        return foo_add_2_and_2_should_be_4;
    }

    private boolean foo_add_1_and_2_should_be_3() {
        boolean foo_add_1_and_2_should_be_3 = new Foo().add(1, 2) == 3;
        if (!foo_add_1_and_2_should_be_3) System.out.println("foo_add_1_and_2_should_be_3 fails!!");
        return foo_add_1_and_2_should_be_3;
    }
}
