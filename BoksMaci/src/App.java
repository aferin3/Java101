public class App {
    public static void main(String[] args) throws Exception {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 50);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 10);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
      
    }
}
