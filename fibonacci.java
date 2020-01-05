public class Fibonacci {

    static void fibonacci(int x){
        int a = 1; 
        int b = 1;
        int c = a+b;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i < x; i++){
            System.out.println(c);
            b = c;
            c = a + c;
            a = b;
        }
    }

    public static void main(String[] args){  

        fibonacci(10);

        /*
        // Optional solution with arrays
        int fib [] = new int[10];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 0; i < 8; i++){
            fib[i+2] = fib[i+1] + fib[i];
        }
        for(int i = 0; i < 10; i++){
            System.out.println(fib[i]);   
        }
        */
    }  
}
