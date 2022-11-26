package examples.basic;

public class FibonacciNumbers {
    static void fibonacci(int count){
        int a,b,c;
        a=0;
        b=1;
        System.out.print(a+" "+b);
        for(int i=3;i<=count;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        fibonacci(10);
    }
}
