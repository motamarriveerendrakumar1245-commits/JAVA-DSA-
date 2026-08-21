public class FinallyExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        } finally {
            System.out.println("Finally block always executes!");
        }
    }
}
