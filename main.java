package test;

/** Main */
public class Main{ 
    
    /** main */
	public static void main(String [] args){
		int a = 10;
        int b = 5;
        int c = div(a, b);
        System.out.println(c);
	}

    /** div */
    private static int div(int a, int b){
        int c = a/b;
        return c;
    }

    /** fib */
    private static int fib(int n){
        if(n == 0) {
             return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}
