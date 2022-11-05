import java.util.*;
public class EmployeeDemo {

        public static void main(String args[]) {
            HashSet<Employee<Integer,String,Integer,String>> hashSet = new HashSet<>();
            Employee<Integer,String,Integer,String> e1 =  new Employee<>(1201,"Mona",18000,"Cloud");
            Employee<Integer,String,Integer,String> e2 =  new Employee<>(1202,"Shri",16000,"SAP");

            if(e1 instanceof Employee && e2 instanceof Employee) {
                hashSet.add(e1);
                hashSet.add(e2);
            }

            for(Employee<Integer,String,Integer,String> i: hashSet); {
               e1.displayDetails();
            }

        }


    }

