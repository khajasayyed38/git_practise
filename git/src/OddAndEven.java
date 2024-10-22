package src;

public class OddAndEven {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            checkEvenAndOdd(i);
        }

    }
    public static void checkEvenAndOdd(int n){
        if(n%2==0){
            System.out.println("even :"+n);
        }else {
            System.out.println("odd  :"+n);
        }
    }
}
