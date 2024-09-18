public class DetailsPD {
    private String LocateID;
    private String ProductID;
    private int QOPPU;
    private double Price;

    public DetailsPD(String IDl, String IDp, int QoU, double P) {
        this.LocateID = IDl;
        this.ProductID = IDp;
        this.QOPPU = QoU;
        this.Price = P;
    }

    public String getLocateID(){
        return this.LocateID ;
    }
    public void setLocateID(String LocateID){
        this.LocateID = LocateID ;
    }
    public String getproductID(){
        return this.ProductID ;
    }
    public void setProductID(String ProductID){
        this.ProductID = ProductID ;
    }
    public int getQOPPU(){
        return this.QOPPU ; 
    }
    public void setQOPPU(int QOPPU){
        this.QOPPU = QOPPU ;
    }
    public double getPrice(){
        return this.Price; 
    }
    public void setPrice(double Price){
        this.Price = Price ;
    }
}

