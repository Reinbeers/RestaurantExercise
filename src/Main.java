public class Main {
    public static void main(String[] args) {
        System.out.println("Hell´s Kitchen Begin...");
        Restaurant restaurant1 = new Restaurant();
        System.out.println(restaurant1.clients[1].getName());
        restaurant1.clients[0].order("Quero Batatas Fritas");
        System.out.println(restaurant1.clients[0].getOrder());
    }
}
