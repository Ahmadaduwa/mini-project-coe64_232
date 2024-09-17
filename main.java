import java.util.Scanner;
import java.util.ArrayList;
public class main {

    public void displayProduct(String id, ArrayList<Productdelivery> pd){
        for (int i = 0; i < pd.size(); i++) {
            pd.get(i).getid().equals(id);

        }
    }
    public static void main(String[] args) {
        //เริ่ม
        //รับค่าเลขที่ส่งสินค้า(รายละเอียดจัดส่งสินค้า) เลขที่สมาชิก(id สมาชิก) วันที่(วันที่ส่งสินค้า) ที่อยู่(ที่อยู่ของสมาชิก)
        //เช็คว่ารหัสจัดส่งนี้ 
        //แสดงข้อมูลแล้วถามว่า
        Scanner sc = new Scanner(System.in);
        ArrayList<member> members = new ArrayList<member>(); 
        members.add(new member("66111741", "Siriwit Fueakhong", "Song-kla", "14/04/2548", "063-123-4567"));
        members.add(new member("66114315", "Chutipon Promdee", "Hat-yai", "01/01/2548", "063-666-666"));
        members.add(new member("66113424", "Ahmadaduwa Da-oh", "Narathiwat", "01/01/2548", "063-888-8888"));

        ArrayList<Productdelivery> pd = new ArrayList<Productdelivery>(); 
        pd.add(new Productdelivery(""))
    
        char ans = 'y';
        while (ans == 'y') {
            System.out.println("Enter Product ID: "); //รหัสจัดส่งสินค้า
            String productID = sc.next();
            displayProduct("");
            System.out.println("Enter member ID: "); //รหัสลูกค้า
            String memberID = sc.next();
            System.out.println("Enter Shipping Date: "); //วันที่จัดส่ง
            String productDate = sc.next();
            System.out.println("Enter Shipping address: "); //สถานที่จัดส่ง
            String memberLocate = sc.next();


        }
        
        sc.close();
    }
}