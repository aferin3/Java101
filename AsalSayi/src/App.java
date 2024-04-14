public class App {
    public static void main(String[] args) throws Exception {

        boolean var = false;

        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    var = true;
            }
            if (!var) {
                System.out.print(i + " ");
                
            }
            var = false;

        }
    }
}
