public class Class1 {
    public static void main(String[] args) {
        printHello10TimesWithoutLoop();
        hello10TimesWithForIncremental();
        hello10TimesWithForDecremental();
        hello10TimesWithWhileDecremental();
        hello10TimesWithWhileIncremental();
    }

    public static void printHello10TimesWithoutLoop(){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    public static void hello10TimesWithForIncremental(){
        for (int i=0 ; i < 10 ; i++){
            System.out.println("Hello World!");
        }
    }

    public static void hello10TimesWithForDecremental(){
        for (int i=10 ; i > 0 ; i--){
            System.out.println("Hello World!");
        }
    }

    public static void hello10TimesWithWhileIncremental(){
        int i = 0 ;
        while(i<10){
            System.out.println("Hello World!");
            i++;
        }
    }

    public static void hello10TimesWithWhileDecremental(){
        int i = 10 ;
        while(i>0){
            System.out.println("Hello World!");
            i--;
        }
    }
}
