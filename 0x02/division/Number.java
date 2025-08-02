public class TheNumber {
    public static void todivide(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("\nIt is not possible to divide by zero.");
        } finally {
            System.out.print(a + " / " + b + " = " + result);
        }
    }
}