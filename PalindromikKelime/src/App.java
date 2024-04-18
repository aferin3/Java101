import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String input;
        boolean isPalindrome=true;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir kelime giriniz: ");
        input = scanner.nextLine();


        for(int i=0; i<input.length()/2;i++){
            if(!(input.charAt(i) == input.charAt(input.length()-i-1))){
                
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println(input+ " bir palindromiktir.");
        }else{
            System.out.println(input+ " bir palindromik değildir.");
        }
    }
}
