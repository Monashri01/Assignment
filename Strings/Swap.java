public class Swap {
        static <T, V> void swap() {
            String[] arr = {"First", "Second", "Third", "Fourth"};
            String temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
            System.out.println("Array after Swap");
            for (String element : arr) {
                System.out.println(element);
            }
        }

        public static void main(String[] args) {
            swap();
        }
}

