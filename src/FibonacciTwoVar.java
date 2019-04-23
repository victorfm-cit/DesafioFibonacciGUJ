public class FibonacciTwoVar {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1;
        while (n1 < 1000) {
            n1 += n2;
            System.out.println(n1 - n2);
            n2 += n1;
            System.out.println(n2 - n1);
        }
    }
}




