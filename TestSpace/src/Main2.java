import java.util.Scanner;
class Main2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();
        System.out.println(factorial(n));
    }

    static int factorial(int n){
        if(n <= 1)
            return 1;
        else
            return n*factorial(n-1);
    }
}