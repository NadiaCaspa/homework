import java.util.Scanner;
public class problem2 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int a, b, c, d;

        System.out.println("Enter a:");
        a = kbd.nextInt();
        System.out.println("Enter B:");
        b = kbd.nextInt();
        System.out.println("Enter c:");
        c = kbd.nextInt();
        System.out.println("Enter d:");
        d = kbd.nextInt();

        int Sum = sum(a, b, c, d);
        System.out.println(Sum);
        int Multiply = multiply(a , b ,c );
        System.out.println(Multiply);
        double Divide = divide(a, b);
        System.out.println(Divide);
        int Subtract = subtract(a, b);
        System.out.println(Subtract);



    }
    public static int sum(int a, int b, int c, int d){
        int result = a + b + c + d;
        return result;
    }
    public static int multiply(int a, int b, int c){
        int result = a * b * c;
        return result;
    }

    public static double divide(int a, int b){
        double result = a/b;
        return result;

    }

    public static int subtract(int a, int b){
        int result = a - b ;
        return result;
    }

}

