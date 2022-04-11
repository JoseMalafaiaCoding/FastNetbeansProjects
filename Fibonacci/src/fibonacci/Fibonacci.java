
package fibonacci;

class Fib{
    int fibMeth(int x){
        int result = 1;
        if(x <= 1){
            return 1;
        }
        if(x == 2){
            return fibMeth(0) + fibMeth(1);
        }
        if (x > 0){
            result = fibMeth(x - 1) + fibMeth(x - 2);
        }
        return result;
    }
}

public class Fibonacci {

    public static void main(String[] args) {
        Fib newFib = new Fib();
        System.out.println(newFib.fibMeth(5));
    }
    
}
