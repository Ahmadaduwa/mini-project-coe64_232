import java.util.*;
public class Productdelivery {
    private  String locateID ; // รหัสจัดส่ง 
    private String Productdate; // วันที่ส่งสินค้า
    private String MemberID ; // รหัสสมาชิก
    private String EmployeeID ; // รหัสพนังงาน
    private int ProductNum ; // จำนวนสินค้า
    private double price ; // ราคาสินค้าสุทธิ 

    public Productdelivery(){
        
    }

    public String getIDLocate(){
        return this.locateID ;
    }
    public String setIDLocate(String IDlocate){
        this.locateID = IDlocate ;
    }
}
