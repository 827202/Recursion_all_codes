public class n_oneCountDec{

    public static void numDec(int n){
     
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n+ " ");
        numDec(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        numDec(n);
    }
}