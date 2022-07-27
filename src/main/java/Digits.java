public class Digits {
    public static void main(String[] args) {
        System.out.println("\ndigits : ");
        int n = (int)(Math.random()*10001);
        n = 10000;
        System.out.println("The random number : " + n);
        System.out.println("number of digits: " + numberOfDigits(n));
        System.out.println("right digit: "+rightDigit(n));
        System.out.println("left digit: "+ leftDigit(n));
        System.out.println("Sum of Digits: " + sumOfDigits(n));
        System.out.println("revered: " + reverse(n));
    }

    public static int numberOfDigits(int n){
        int ans = 0;
        while(n > 0){
            n/=10;
            ans++;
        }
        return ans;
    }

    public static int rightDigit(int n){
        return n%10;
    }

    public static int leftDigit(int n){
        int ans = 0;
        while(n > 0){
            ans  = n ;
            n/=10;
        }
        return ans;
    }

    public static String reverse(int n){
        String ans = "";
        while(n > 0){
            int d = n%10;
            ans +=d;
            n/=10;
        }
        return ans;
    }

    public static int sumOfDigits(int n){
        int ans = 0;
        while(n > 0){
            int d = n%10;
            ans+=d;
            n/=10;
        }

        return ans;
    }
}
