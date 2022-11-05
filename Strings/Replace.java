public class Replace {
    public static void main(String args[]) {
        String str = "Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println(str);
        String replaceString=str.replace('a','$');
        System.out.println(replaceString);

    }
}
