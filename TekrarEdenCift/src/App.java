import java.util.Arrays;

public class App {
    static boolean isFind(int[] arr, int value){
        for(int i: arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        int[] seri = {3,3,6,8,98,64,6,5,8,22,36,98,3,6,5};
        int[] duplicate = new int[seri.length];
        int startIndex = 0;
        for(int i=0;i<seri.length;i++){
            for(int j=i;j<seri.length;j++){
                if(i!=j && seri[i] == seri[j]){
                    if(!isFind(duplicate, seri[i]))
                    duplicate[startIndex++] = seri[i];
                }

            }
        }

        for(int i:duplicate){
            if(i!=0 && i%2==0) System.out.println(i);
        }
        
    }
}
