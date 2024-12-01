public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + n + ":");
        int total = 0;

        if (n < 2) {
            return;
        }
        
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= n; i++){
            prime[i] = true;
        }

        for (int i = 2; i * i <= n; i++){
            if (prime[i]){
                for (int j = i * i; j <= n; j +=i ){
                    prime[j] = false;
                }
            }
        }
    for (int i = 2; i <= n; i++) {
        if (prime[i]) {
            System.out.println(i);
            total++;
            
        }
    }
    System.out.println("There are " + total + " primes between 2 and " + n + " (" + (int)(((double)total / n) * 100) + "% are primes)");

  
    }
}