public class tilingWay {
    public static int tilingway(int n){
        if(n==0 || n==1){
            return 1;
        }
        //for vertical way
        int fnm1=tilingway(n-1);
        //for horizontal way
        int fnm2=tilingway(n-2);

        int tilingst=fnm1 + fnm2;
        return tilingst;
    }
    public static void main(String[] args) {
        System.out.println(tilingway(3));
    }
    
}
