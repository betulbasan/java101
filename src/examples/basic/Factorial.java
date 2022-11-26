package examples.basic;

public class Factorial {
    static int Factorial(int number){
        int result = 1;
        while(number>0){
            result *=number;
            number--;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Factorial(3));
    }
}
