public class Recursion {
    // iterative
    public static int nSumNNI(int n) {
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += i;
        }
        return res;
    }

    // mathematical
    public static int nSumNNM(int n) {
        return n * (n + 1) / 2;
    }

    // recursive
    public static int nSumNNR(int n) {
        if (n == 0) {
            return 0; // base case
        }
        return n + nSumNNR(n - 1); // recursive
    }

    public static void main(String[] args) {
        System.out.println(nSumNNI(4));
        System.out.println(nSumNNM(4));
        System.out.println(nSumNNR(4));
    }
}
