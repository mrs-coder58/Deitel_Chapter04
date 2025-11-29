package chapter04;

public class Increment {
    public static void main(String[] args) {
        int c = 5;

        System.out.println("c before postincrement: " + c);
        System.out.println("  posincrementing c...");
        c++;
        System.out.println("c after postincrementing: " + c);

        c = 5;
        System.out.println("c before preincrement: " + c);
        System.out.println("  preincrementing c...");
        ++c;
        System.out.println("c after preincrementing: " + c);
    }
}
