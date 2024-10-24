public class pattern {
    public static void main(String[] args) {
//        int[] arr1= new int[5];
//        for(int i=0;i<5;i++){
//
//            for(int j=0;j<=i;j++){
//
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }
//
        int i, j;
        for (i = 1; i <= 6; i++) {
            for (j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
