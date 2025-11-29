package chapter04;

public class TabularOutput {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("N" + "\t" + "10*N" + "\t" + "100*N" + "\t" + "1000*N" + "\n");
        while (i<=5){
            System.out.print(i + "\t" + 10 * i + "\t\t" + 100 * i + "\t\t" + 1000 * i);
            System.out.println();
            i++;
        }
    }
}
