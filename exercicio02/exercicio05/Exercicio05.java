package exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("sqrt(25) = " + sqrt(25, 1, 1));
    }

    public static int sqrt(int N, int A, int E) {
        if (Math.abs(Math.pow(A, 2) - N)  < E) {
            return A;
        } else {
            A = (int) ((Math.pow(A, 2) + N)/(2*A));
            return sqrt(N, A, E);
        }
    }
}
