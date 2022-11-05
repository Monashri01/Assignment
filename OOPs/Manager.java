
    public class Manager extends Employee{
    int incentive=800;

        @Override
        public void calculate() {
            super.calculate();
            System.out.println(basic+incentive);
        }
        public static void main(String[] args){
            Manager m=new Manager();

            m.calculate();

        }
    }


