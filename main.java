import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        int a = new Scanner(System.in).nextInt();
        int[] b = new int[a];
        System.out.println("Введите элементыы массива: ");
        for (int i = 0; i < a; i++) {
            b[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("Массив b");
        for (int i = 0; i < a; i++) {
           if (b[i] % 2 == 0) {
               System.out.println("Чётные числа: ");
               System.out.println(b[i]);
           }else if (b[i] % 2 != 0){
               System.out.println("Нечётные числа");
               System.out.println(b[i]);
           }
        }










    }
}