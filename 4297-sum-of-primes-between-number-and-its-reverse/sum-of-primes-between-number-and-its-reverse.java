class Solution {
   
        public boolean isprime(int n){
            if(n<2) return false;
            for(int i=2;i*i<=n;i++){
                if(n%i==0)return false;
            }
            return true;
        }
         public int sumOfPrimesInRange(int num) {
            int res=0;
            int temp=num;
            int sum=0;
            while(temp!=0){
                int rem=temp%10;
                res=res*10+rem;
                temp/=10;
            }
            int min=Math.min(num,res);
            int max=Math.max(num,res);
            for(int i=min;i<=max;i++){
                if(isprime(i)) sum+=i;
            }
            return sum;
    }
}