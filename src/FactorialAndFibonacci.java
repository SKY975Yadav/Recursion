public class FactorialAndFibonacci {
    public static void main(String[] args) {
//        System.out.println(factorial(5));
        System.out.println(fibonacci(3));
    }
    private static int factorial(int n){
        if (n==0|| n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    private static int fibonacci(int n){
        if (n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
