package loops;

public class pattern {
    public static void main(String[] args) {

        // Pattern 1 = soild Reactangle
        // int n = 4;
        // int m = 5;

        // //outerloop
        // for(int i = 1; i<= n; i++){
        // for(int j =1; j<=m; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // pattern 2 = hallow rectangle pattern
        // int n = 4;
        // int m = 5;
        // // outerloop
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         if (i ==1 || j == 1 || i == n || j == m ) {
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // pattern =3 half pyramid

        int n = 4;
        int m = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
