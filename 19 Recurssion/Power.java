public class Power {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        // int xnm1=power(x,n-1);
        // int pw=x * xnm1;
        // return pw;/

        return x * power(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
        
    }
    
}
