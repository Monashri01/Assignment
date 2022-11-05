public class Arm {
    public static void main(String[] args)
    {
        for(int number = 100; number <= 999; number++)
        {
            int temp = number;
           int result=0;
           while (temp>0){
               int d=temp%10;
               result=result+(d*d*d);
               temp=temp/10;
           }
               if(number==result){
                System.out.println(number + " is armstrong Number");
            }
        }
    }
}
