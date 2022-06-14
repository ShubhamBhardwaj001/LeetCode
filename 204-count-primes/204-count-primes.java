class Solution {
    public int countPrimes(int n) {
        boolean[] sieve = new boolean[n];
        int c = 0;
        int k=1;
        Arrays.fill(sieve, true);
        int l = (int)Math.floor(Math.sqrt(Double.valueOf(n)));
        for(int i=2; i<=l; i++){
            if(sieve[i] == true){
                for(int j=2*i; j<n; j+=i){
                    sieve[j] = false;
                }
            }
        }
        for(int i=2; i<n; i++){
            if(sieve[i] == true) c++;
        }   
        return c;
    }
} 