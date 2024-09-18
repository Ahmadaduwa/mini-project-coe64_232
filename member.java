import java.util.ArrayList;

public class Member {
    private String id;
    private String name;
    private String locate;
    private String date;
    private String number;
    private ArrayList<Product> purchasedProducts; //Association

    public Member(String id, String n, String l, String d, String num) {
        this.id = id;
        this.name = n;
        this.locate = l;
        this.date = d;
        this.number = num;
        this.purchasedProducts = new ArrayList<>(); 
    }

    public void buyProduct(Product product) {
        this.purchasedProducts.add(product);
    }

    public ArrayList<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLocate(){
        return this.locate;
    }

    public void setLocate(String locate){
        this.locate = locate;
    }

    public String getDate(){
        return this.date;
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getNumber(){
        return this.number;
    }

    public void setNumber(String number){
        this.number = number;
    }
}
