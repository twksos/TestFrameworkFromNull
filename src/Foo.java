/**
 * Author: Wei Guangcheng
 * Time: 12-12-6 21:40
 */
public class Foo {
    public int add (int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(new Foo().add(1,2));
    }
}
