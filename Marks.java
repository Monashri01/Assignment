public class Marks {
    public static void main(String[] args){
        int n1=100,n2=70,n3=50;
        if (n1>60 & n2>60 & n3>60) {
            System.out.println("pass");
        }
        else if (n1>60 & n2>60 || n2>60 & n3>60 || n3>60 & n1>60){
            System.out.println("Promoted");
        }
        else if ((n1>60 || n2>60 || n3>60) || (n1<60 & n2<60 & n3<60)) {
            System.out.println("Failed");
        }
            else{
                System.out.println("None");
            }
        }


        }


