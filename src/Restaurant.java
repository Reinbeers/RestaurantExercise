public class Restaurant {
    private String name;
    private String localization;
    public Client [] clients;
    boolean fullCapacity;
    int numberOfOccupiedTables;
    int restaurantCount;
    public Table[] tables;


    public String getName() {
        return name;
    }

    public String getLocalization() {
        return localization;
    }

    public Restaurant(){
        this.name = name;
        this.localization = localization;
    }







}
