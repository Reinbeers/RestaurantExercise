public class Restaurant {
    private String name;
    private String localization;
    public Client [] clients = new Client[3];
    public Table[] tables = new Table [4];
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
        this.tables[0] = new Table(true,"Arroz", 2);
        this.tables[1] = new Table(true,"massa",4);
        this.tables[2] = new Table(true,"Francesinha",3);
        this.tables[3] = new Table(true,"Arroz",5);



    }


    public void findTable(){
        for (int i = 0; i < tables.length; i++) {
            if(tables[i].isFree()==true){
                tables[i].setFree(false);
            }
            System.out.println("All Tables are occupied");
        }


    }
    public void freeTable(){

    };
    public void getRestaurantCount(){

    };
    public void recieveOrder(){

    };
    public void checkIfTableCanBeFreed(){

    };
    public void occupyTable(){

    };








}
