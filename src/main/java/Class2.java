public class Class2 {
    public static void main(String[] args) {

        System.out.println("\ndefines a random number and prints all numbers " +
                "from 1 to that number");
        int n = (int)(Math.random()*101);
        System.out.println("The random number : " + n);
        printFromOneToN(n);

        n = (int)(Math.random()*101);
        int m = (int)(Math.random()*101);
        System.out.println("\ntwo random values and prints all values between them.");
        System.out.println("The numbers are : " + n  + " , " + m);
        printFromNToM(n, m);

        System.out.println("\ndefines a random number and prints all even numbers from 0 to that number");
        n = (int)(Math.random()*101);
        System.out.println("The random number : " + n);
        printEvenFromZeroToN(n);

        System.out.println("\ndefines two random values ‘max’ and ‘den’ and prints all the numbers" +
                " from 0 to ‘max’ that can be divided with ‘den’");
        int max = (int)(Math.random()*101);
        int den = (int)(Math.random()*101);
        System.out.println("The numbers are : max= " + max  + " ,den= " + den);
        printFromZeroToNThatDividesOnM(max , den);

        System.out.println("\nThe factorial");
        n = (int)(Math.random()*8);
        System.out.println( n + "! = " + factorial(n));






    }

    public static void printFromOneToN(int n){
        for(int  i = 1 ; i <= n ; i ++ ){
            System.out.println(i);
        }
    }

    public static void printFromNToM(int n , int m ){
        int max = Math.max(n , m);
        int min = Math.min(n , m);
        for(int  i = min ; i <= max ; i ++ ){
            System.out.println(i);
        }
    }

    public static void printEvenFromZeroToN(int n ){
        for(int  i = 0 ; i <= n ; i += 2 ){
            System.out.println(i);
        }
    }

    public static void printFromZeroToNThatDividesOnM(int n , int m ){
        for(int  i = 0 ; i <= n ; i += m ){
            System.out.println(i);
        }
    }

    public static Long factorial(int n){
        if(n > 20){
            System.out.println("factorial is too large ");
            return Long.valueOf(-1);
        }
        else if(n< 0 ){
            System.out.println("cannot do factorial for negative numbers");
            return Long.valueOf(-1);
        }
        else{
            long f = 1;
            for(int i = 2 ; i <= n ; i++){
                f *= i;
            }
            return f;
        }
    }


}
