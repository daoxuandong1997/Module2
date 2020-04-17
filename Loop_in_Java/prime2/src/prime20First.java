
public class prime20First {
    public static void main(String[] args) {

        System.out.println("20 first of prime numbers: ");
        int i, n = 0;
        for ( i = 2; ; i++){
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
                n++;
                if (n == 20){
                    break;
                }
            }
        }
    }
}
