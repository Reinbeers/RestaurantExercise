public class Table {
    boolean free;
    String order;


    public String getOrder() {
        return order;
    }
    public boolean getFree(){
        return free;
    }

    public Table(boolean free, String order) {
        this.free = free;
        this.order = order;


    }


    public void occupy() {
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