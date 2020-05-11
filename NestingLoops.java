public class NestingLoops {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        // 1. "N" is faster because its controlled by the inner loop.
        // 2. "C" is now faster because it is the inner loop.
        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c + " " + n);
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        // 3. When adding "ln" to print it causes the string to be printed on multiple
        // lines
        // instead of 1.
        // 4. The output prints as a grid when System.out.println(); is added inside the
        // outer loop, but inside the inner.

        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");
            }
            // * You will add a line of code here.
            System.out.println();
        }

        System.out.println("\n");

    }
}