public class MyClass {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i += 2; // This improvement will make the code more efficient
        }
    }
}