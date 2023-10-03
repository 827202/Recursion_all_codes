public class lastoccurance {
    public static int lastOccurance(int arr[],int key,int i){
       
        if(i==arr.length-1){
            return -1;
        }
         int isfound=lastOccurance(arr,key,i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[]={3,4,6,7,9,4,3,2,7,1,6};
        System.out.println(lastOccurance(arr,3,0));
    }
    
}
