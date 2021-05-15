import java.util.Random;

public class MassiveRotation {

    public static void main(String[] args) {

        int [] d = {5, 9, 8, 7, 4, 3};


        for (int i=0; i<d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println(" ");
        //init(d);
        sort(d);
        print(d);


    }

    public static void init(int[] a) {
        Random rand = new Random();
        for (int i = 0; i< a.length; i++) {
            a[i] = rand.nextInt(10);
        }
    }


    public static void print(int[] a) {
        for (int i = 0; i< a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }
    }


}
