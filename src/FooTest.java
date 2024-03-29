/**
 * Author: Wei Guangcheng
 * Time: 12-12-7 10:06
 */
public class FooTest {

    public void test_foo_add_2_and_2_should_be_4() throws Exception {
        boolean foo_add_2_and_2_should_be_4 = new Foo().add(2, 2) == 4;
        if (!foo_add_2_and_2_should_be_4) throw new Exception("test_foo_add_2_and_2_should_be_4 fails!!");
    }

    public void test_foo_add_1_and_2_should_be_3() throws Exception {
        boolean foo_add_1_and_2_should_be_3 = new Foo().add(1, 2) == 3;
        if (!foo_add_1_and_2_should_be_3) throw new Exception("test_foo_add_1_and_2_should_be_3 fails!!");
    }
}
