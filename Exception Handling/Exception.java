 import java.util.Scanner;
    public class Exception {
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter two numbers");
            int num1,num2;
            num1=obj.nextInt();
            num2=obj.nextInt();


            try {
                System.out.println(num1/num2);
            } catch (ArithmeticException e) {

                System.out.println("Cannot be divided by zero");
            }
        }
    }

