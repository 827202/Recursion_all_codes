public class removeDuplicate {
public static void removeDuplicate(String str , int idx , StringBuilder newstr , boolean map){
    if(idx==str.length()){
        System.out.println(newstr);
        return;
    }
    //kaam
    char currchar=str.charAt(idx);
    if(map[currchar-'a']==true){
      removeDuplicate(str, idx, newstr, map)
    }else{
        map[currchar-'a']=true;
        removeDuplicate(str, idx+1, newstr.append(currchar), map);
    }
   
}
private static void extracted(String str, int idx, StringBuilder newstr, boolean map) {
    removeDuplicate(str, idx+1, newstr, map);
}
public static void main(String[] args) {
    String str="appnnacollege";
    System.out.println(removeDuplicate(str,0,StringBuilder(""),new boolean));
}
}
