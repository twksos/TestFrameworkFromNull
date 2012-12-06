/**
 * Author: Wei Guangcheng
 * Time: 12-12-6 21:40
 */
public class Foo {
    public int add (int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        boolean foo_add_1_and_2_should_be_3 = new Foo().add(1, 2) == 3;
        if(!foo_add_1_and_2_should_be_3){
        System.out.println("foo_add_1_and_2_should_be_3 fails!!");
            System.exit(1);
        }
    }
}
