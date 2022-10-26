public class Exception1 {
    public static void main(String[] args) {
        int a = 15, b = 0;

        try {
            System.out.println(a / b);
        } catch (UnsupportedOperationException e) {

            System.out.println("Cannot be divided by zero");
        }
    }
}
