public class Exe1 {
    // n
    // ∑ i = 1 + 2 + · · · + (n − 1) + n
    // i=1
    public static int sommeDeUnAN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sommeDeUnAN(n - 1);
    }
    
    // 4! = 4 * 3 * 2 * 1 = 24
    // 0! = 1
    // n! = 1 × 2 × · · · × (n − 1) × n
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }



    public static void main(String[] args) {
        System.out.println(sommeDeUnAN(4));
        System.out.println(factorial(4));
    }
}
