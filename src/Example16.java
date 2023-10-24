public class Example16 {
    public static void main(String[] args) {
        int x;
        long result;

        x = 1234;
        result = countNumber(x, 1);
        System.out.println(result);
    }

    private static long countNumber(long x, long l) {
        if (x == 0) return l;
        return countNumber(x / 10, x % 10 * l);
    }
}
