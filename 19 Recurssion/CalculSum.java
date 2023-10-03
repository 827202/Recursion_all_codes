public class CalculSum {
    public static int calSum(int n){ 
        if(n==1){
            return 1;
        }

        int fnm1=calSum(n-1);
        int sn=n+fnm1;
        return sn;
    }
    public static void main(String[] args) {
        System.out.println(calSum(10));
        
    }
    
}
