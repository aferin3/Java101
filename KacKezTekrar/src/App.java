import java.util.Arrays;

public class App {
    
    public static void main(String[] args) throws Exception {
        int[] dizi = { 10, 20, 20, 10, 10, 20, 5, 20 ,30,30,5,45,45,45,60,45};
        int num = 1;
        System.out.println("Dizi: " + Arrays.toString(dizi)+"\nTekrar Sayıları");
        Arrays.sort(dizi);
        
        for (int i = 0; i < dizi.length-1; i++) {
            if(dizi[i]==dizi[i+1]){
                num++;
            }else{
                System.out.println(dizi[i]+"sayısı "+num+" kere tekrar edildi.");
                num=1;
            }
            
            
        }
        System.out.println(dizi[dizi.length-1]+"sayısı "+num+" kere tekrar edildi.");
        
        
    }
}
