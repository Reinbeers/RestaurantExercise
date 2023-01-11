public class Table {
    boolean free;
    String order;
    int seatNum;


    public String getOrder() {
        return order;
    }
    public boolean getFree(){
        return free;
    }

    public Table(boolean free, String order, int seats) {
        this.free = free;
        this.order = order;
        this.seatNum = seats;

    }


    public void occupy() {
        if (seatNum>4) {
            System.out.println("The table isn't big enough.");;
        } else
        this.free = false;
    }
    public void unoccupy() {
        this.free = true;
    }



    public void saveOrder() {

    }
    public void cleanOrder() {

    }

    public boolean isFree() {
        return this.free;
    }

}