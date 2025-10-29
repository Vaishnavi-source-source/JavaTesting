public class SimpleCalculatorTest {

    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public int divide(int a, int b) { 
        if(b == 0) return 0; 
        return a / b; 
    }

    public void runTests() {
        System.out.println("Add 2 + 3 = " + (add(2,3) == 5));
        System.out.println("Subtract 5 - 2 = " + (subtract(5,2) == 3));
        System.out.println("Multiply 4 * 3 = " + (multiply(4,3) == 12));
        System.out.println("Divide 10 / 2 = " + (divide(10,2) == 5));
        System.out.println("Divide 5 / 0 = " + (divide(5,0) == 0));
    }

    public static void main(String[] args) {
        SimpleCalculatorTest test = new SimpleCalculatorTest();
        test.runTests();
    }
}
