public class MultiArrayPrint {
    

    public static void mAPrint(int[][] mArray){
        for(int i=0;i<mArray.length;i++){
            for(int j=0;j<mArray[i].length;j++){
                System.out.print(mArray[i][j]+" ");
            }
            System.out.println();

        }
    }
}
