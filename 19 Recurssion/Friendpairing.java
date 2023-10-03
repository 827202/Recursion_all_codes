public class Friendpairing {
    public static int friendpairing(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1=friendpairing(n-1);

        int fnm2=friendpairing(n-2);

        int pairway=(n-1) * fnm2;

        int totway=fnm1 + pairway;

        return totway;
    }
    public static void main(String[] args) {
       System.out.println(friendpairing(2)); 
    }
    
}
