import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите два числа, эта программа скажет какое из них больше");
        System.out.println("dВведите первое число");
        Scanner sc = new Scanner(System.in);
        int FirstNumber = sc.nextInt();
        System.out.println("Введите второе число");
        int SecondNumbwer = sc.nextInt();
        if (FirstNumber > SecondNumbwer) {
            System.out.println("Первое число больше");
        }
        else{
            System.out.println("Второе число больше");}
        if (FirstNumber==SecondNumbwer){
            System.out.println("Ваши числа равны");
        }
    }
}
