/**
 * User: guoyao
 * Time: 10-24-2012 18:17
 */

public class Main {
    public static void main(String[] args) {
        if (args.length == 0)
            args = new String[]{"abc"};
        for (String str : args) {
            System.out.println(str);
        }
    }
}
