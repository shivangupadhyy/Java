package array;

public class Practice {
    public static void main(String[] args) {
        // //practice problem 1
        // float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};

        // float sum = 0;
        // for (float f : marks) {
        // sum += f;
        // }
        // System.out.println(sum);

        // practice problem 2
        // float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};

        // float num = 45.7f;
        // boolean isInArray = false;

        // for (float f : marks) {
        // if(num == f){
        // isInArray = true;
        // break;
        // }
        // }
        // // System.out.println(sum);

        // if(isInArray){
        // System.out.println("The value is present in the array");
        // }else{
        // System.out.println("the is not present in this array");
        // }

        // practice problem 3
        // float[] marks = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };

        // float sum = 0;
        // for (float f : marks) {
        // sum += f;
        // }
        // System.out.println("the value of average marks is " + sum / marks.length);

        // practice problem 4

        // int[][] mat1 = { { 1, 2, 3 },
        // { 4, 5, 6 } };

        // int[][] mat2 = { { 2, 6, 13 },
        // { 3, 7, 1 } };

        // int[][] result = { { 0, 0, 0 },
        // { 0, 0, 0 } };

        // for( int i=0; i<mat1.length;i++){
        // for(int j=0; j<mat1[i].length;j++){
        // System.out.format("setting value i=%d and j+%d\n", i, j);
        // result[i][j] = mat1[i][j] + mat2[i][j];
        // }
        // }

        // //printing the element of an 2-d Array
        // for(int i=0; i<mat1.length;i++){
        // for(int j=0; j<mat1[i].length;j++){
        // System.out.print(result[i][j] + " ");
        // result[i][j] = mat1[i][j] + mat2[i][j];
        // }
        // System.out.println("");
        // }

        // problem number 5

        // int [] arr = {1, 2, 3, 4, 5, 6};
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;

        // for(int i=0; i<n; i++){
        // //swap a[i] and a[l-1-i]
        // // a b temp
        // temp = arr[i];
        // arr[i] = arr[l-1-i];
        // arr[l-1-i] = temp;
        // }

        // for (int element : arr) {
        // System.out.print(element + " ");
        // }

        // // practice problem 6
        // int[] arr = { 1, 21, 3, 455, 5, 34, 67 };
        // int min = Integer.MAX_VALUE;
        // for (int e : arr) {
        //     if (e < min) {
        //         min = e;
        //     }
        // }
        // System.out.println(min);

        // boolean isSorted  = true;
        // int [] arr = {1, 3, 4, 5, 34, 67};
        // for(int i=0; i<arr.length-1; i++){
        //     if(arr[i] > arr[i+1]){
        //         isSorted = false;
        //         break;
        //     }
        // }

        // if(isSorted){
        //     System.out.println("the array is sorted");
        // }else{
        //     System.out.println("array is not sorted");
        // }

        //practice problem 1

        int n = 4;
        for(int i=n; i>0; i--){
            
                System.out.print('*');
            
        }
    }
}
