package recursion;

public class Recursion2 {

    // public static void towerOfHanoi(int n, String src, String helper, String Dest ){
    //     if (n == 1) {
    //         System.out.println("transfer disk " + n + " from " + src + " to " + Dest);
    //         return;
    //     }
    //     towerOfHanoi(n-1, src, Dest, helper);
    //     System.out.println("transfer disk " + n + " from "+ src + " to "+ Dest);
    //     towerOfHanoi(n-1, helper, src, Dest);
    // }\

    // public static void prinitRev( String str, int idx){
    //     if(idx == 0){
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }

    //     System.out.print(str.charAt(idx));
    //     prinitRev(str, idx-1);
    // }

    // public static int first = -1;
    // public static  int last = -1;



    // public static void findOccurance(String str, int idx, char element){
    //     if(idx == str.length()){
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(currChar == element){
    //         if(first == -1){
    //             first = idx;
    //         } else{
    //             last = idx;
    //         }
    //     }
    //     findOccurance(str, idx+1, element);
    // }

    // public static boolean isSorted(int arr[], int idx){

    //     if(idx == arr.length-1){
    //         return true;
    //     }
    //     if(arr[idx] >= arr[idx+1]){
    //         //array is sorted till now 
    //      return   false;
    //     }else{
    //         return isSorted(arr, idx + 1);
    //     }
    // }

    // public static  void moveAllX(String str, int idx, int count, String newString){
        
    //     if(idx == str.length()){
    //         for(int i =0; i<count; i++){
    //         newString += "x";
    //     }
    //         System.out.println(newString);
    //         return;
    //     }


    //     char currChar = str.charAt(idx);
    //     if(currChar == 'x'){
    //         count++;
    //         moveAllX(str, idx+1, count, newString);
    //     }else{
    //         newString += currChar;//newString = newString + currChar
    //         moveAllX(str, idx+1, count, newString);
    //     }
    // }

    public static  boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString){

        if(idx ==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicates(str, idx+1, newString);
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }



    public static void main(String[] args) {
        // int n = 2;
        // towerOfHanoi(n, "S", "H", "D");

        // String str = "abcd";
        // prinitRev(str, str.length()-1);

        // String str = "abaacdaefab";
        // findOccurance(str, 0, 'b');

        // int arr[] = {1,3, 3};
        // System.out.println(isSorted(arr, 0));

        // String str = "axbcxxd";
        // moveAllX(str, 0, 0, "");

        String str = "abbccda";
        removeDuplicates(str, 0, "");
        
    }
}
