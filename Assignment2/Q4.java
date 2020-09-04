public class Q4{
    public static void main(String[] args){
        int n=1;
        int sum = 1;
        while(n<Integer.MAX_VALUE){
            if(sum==n*n){
                System.out.println("Ans: "+n);
            }
            n+=1;
            sum+=n;
        }
        System.out.println("Last loop:-\n\tsum: "+sum+"\n\tn: "+n);
    }
}
