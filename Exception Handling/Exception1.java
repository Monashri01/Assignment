 public class Exception1 {
        public static void main(String args[]) {
            int a,b,res;

            a = 10;
            b = 2;
            try {
                res = a/b;
                System.out.println("Result: "+res);

            } catch(ArithmeticException e) {

                throw new ArithmeticException("UnsupportedOperationException");
            }
        }
    }

