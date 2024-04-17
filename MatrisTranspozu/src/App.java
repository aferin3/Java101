import java.util.Arrays;

public class App {
    static void multiArrayPrint(int[][] arr){
        for (int[] i:arr){
            for(int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }

    }
    static void transpoz(int[][] arr){
        
        int[][] trp = new int[arr[0].length][arr.length];
        for(int i=0;i<trp.length;i++){
            for(int j=0;j<trp[0].length;j++){
                trp[i][j]=arr[j][i];

            }
            
        }
        System.out.println("Matris :");
        multiArrayPrint(arr);
        System.out.println("Transpoze :");
        multiArrayPrint(trp);
        
        
    }
    public static void main(String[] args) throws Exception {
        int[][] dizi = { 

            {2,3,4},
            {5,6,4},
            {6,91,32}
        };
        

        
        
        transpoz(dizi);

    }
}
