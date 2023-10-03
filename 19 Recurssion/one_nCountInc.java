public class one_nCountInc{
    public static void countInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        countInc(n-1);
        System.out.println(n+ " ");

    }
    public static void main(String[] args) {
    countInc(10);
        
    }

}