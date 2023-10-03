public class firstOccurance {
    public static int firstoccurance(int arr[],int key ,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurance(arr,key,i+1);
    }
    public static void main(String[] args) {
       int arr[]={3,4,6,7,9,4,3,2,1,6};
       System.out.println(firstoccurance(arr,7,0)); 
    }
    
}
