/**
 * Author: Wei Guangcheng
 * Time: 12-12-6 21:40
 */
public class Foo {
    public int add(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        boolean success = true;
        success = foo_add_1_and_2_should_be_3() && success;
        success = foo_add_2_and_2_should_be_4() && success;
        if(!success) System.exit(1);
    }

    private static boolean foo_add_2_and_2_should_be_4() {
        boolean foo_add_2_and_2_should_be_4 = new Foo().add(2, 2) == 4;
        if (!foo_add_2_and_2_should_be_4) System.out.println("foo_add_2_and_2_should_be_4 fails!!");
        return foo_add_2_and_2_should_be_4;
    }

    private static boolean foo_add_1_and_2_should_be_3() {
        boolean foo_add_1_and_2_should_be_3 = new Foo().add(1, 2) == 3;
        if (!foo_add_1_and_2_should_be_3) System.out.println("foo_add_1_and_2_should_be_3 fails!!");
        return foo_add_1_and_2_should_be_3;
    }
}
