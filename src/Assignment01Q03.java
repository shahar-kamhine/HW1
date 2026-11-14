import java.math.BigInteger;

public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        System.out.println("The first " + x + " Fibonacci numbers are:");

        BigInteger previous = BigInteger.ONE;
        BigInteger current = BigInteger.ONE;
        int numOdd = 2;

        System.out.print(previous + " " + current);

        for (int i = 2; i < x; i++) {
            BigInteger next = previous.add(current);
            System.out.print(" " + next);

            if (!next.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                numOdd++;
            }

            previous = current;
            current = next;
        }

        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
