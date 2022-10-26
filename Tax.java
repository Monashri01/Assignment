import java.util.Scanner;
    public class Tax {
        public static void main(String[]args){
            int Salary; double tax;
            System.out.print("Enter Salary");
            Scanner r=new Scanner (System.in);
            Salary=r.nextInt();
            if(Salary<=180000) {
                System.out.print(Salary + "No Tax");
            }
            else if (Salary>180000 && Salary<=300000)
            {
                tax=Salary*0.10;
                System.out.print(Salary+" "+tax);
            }
            else if (Salary>300000 && Salary<=500000)
            {
                tax=Salary*0.20;
                System.out.print(Salary+" "+tax);
            }
            else if (Salary>500001 && Salary<=1000000)
            {
                tax=Salary*0.30;
                System.out.print(Salary+" "+tax);
            }
        }

    }
