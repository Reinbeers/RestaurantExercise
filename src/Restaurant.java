public class Restaurant {
    private String name;
    private String localization;
    public Client [] clients = new Client[3];
    public Table[] tables;
    boolean fullCapacity;
    int numberOfOccupiedTables;
    int restaurantCount;



    public String getName() {
        return name;
    }

    public String getLocalization() {
        return localization;
    }


    public Restaurant(){
        this.name = "Eat with Poncha";
        this.localization = "Madeira";
        this.fullCapacity = false;
        this.clients[0] = new Client("Tiago");
        this.clients[1] = new Client("JP");
        this.clients[2] = new Client("Filipa");



    }


    public void findTable(){}
    public void freeTable(){};
    public void getRestaurantCount(){};
    public void recieveOrder(){};
    public void checkIfTableCanBeFreed(){};
    public void occupyTable(){};








}
