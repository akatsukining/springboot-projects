package cn.kgc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static String isPrime(int n){
        int m = 0;
        for (int i = 2; i < n ; i++) {
            if(n % i==0)
                m++;
        }
        if (m == 0) {
            System.out.println(n+"是素数");
            return n + "是素数";
        }else {
            System.out.println(n+"不是素数");
            return n + "不是素数";
        }
    }
}
