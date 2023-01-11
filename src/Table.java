public class Table {
    boolean free;
    String order;
    String orderName;


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


        public void getOrder() {
        }
        public void saveOrder() {
        }
        public void cleanOrder() {
        }

        public boolean isFree() {
            return this.free;
        }







}
