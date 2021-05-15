import java.util.Scanner;

public class FactorialTask{
    //Требуется определить факториал числа, которое ввел пользователь.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        int n = sc.nextInt();
        int f = 1;
        for (int i=2; i<=n; i++) {

            f = f * i;

        }

        System.out.println (f);

    }


}