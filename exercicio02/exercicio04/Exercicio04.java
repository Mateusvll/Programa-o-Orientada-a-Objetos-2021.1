package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        System.out.println("MDC(10, 2) = " + MDC(10, 2));
        System.out.println("MDC(25, 5) = " + MDC(25, 5));
    }

    public static int MDC(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return MDC(b, a % b);
        }
    }
}
