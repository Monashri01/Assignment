
    public class Labour extends Employee {
        int overTime = 500;

        public void calculate() {
            super.calculate();
            System.out.println(basic + overTime);


        }

        public static void main(String[] args) {
            Labour l = new Labour();
            l.calculate();

        }
    }





