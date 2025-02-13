import java.util.Scanner;

public class n {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int c = sc.nextInt();
        System.out.println("Введите третье число: ");
        int b = sc.nextInt();

        if (a > b && a > c){
            System.out.println(a);
        }else if (b > a && b > c){
            System.out.println(b);
        }else if (c > a && c > b){
            System.out.println(c);

        }






     }

    }
