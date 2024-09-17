public class member {
    private String id; //รหัสสมาชิก
    private String name; //ชื่อสมาชิก
    private String locate; //ที่อยู่
    private String date; //วันเดือนปีเกิด
    private String number; //เบอร์โทร
    
    public member(String id, String n, String l, String d, String num){
        this.id = id;
        this.name = n;
        this.locate = l;
        this.date = d;
        this.number = num;
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
