public class factorial {

    public static int fact(int n){
        if(n==1){
            return 1;
        }

        int fn=n*fact(n-1);
        return fn;

    }
    public static void main(String[] args) {
      int n=6;
    System.out.println(fact(n) );
    }
    
}
