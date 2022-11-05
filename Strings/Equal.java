public class Equal {
    public static void main(String args[]) {
        String str1 = "Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println(str1);
        String str2 = "java string pool refers to collection of Strings which are stored in heap memory";
System.out.println(str2);


        System.out.println((str1).equals(str2));
        System.out.println((str1).equalsIgnoreCase(str2));
    }
}
