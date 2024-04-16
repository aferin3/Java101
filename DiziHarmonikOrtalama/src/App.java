public class App {
    public static void main(String[] args) throws Exception {
        double[] numbers = {1,2,3,5};

        double harm=0;
        for(double i:numbers){
            harm+=1/i;
        }
        System.out.println(harm);
    }
}
