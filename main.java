import java.util.Scanner;
import java.util.ArrayList;
public class main {

    public void displayProduct(String id, ){

    }
    public static void main(String[] args) {
        //เริ่ม
        //รับค่าเลขที่ส่งสินค้า(รายละเอียดจัดส่งสินค้า) เลขที่สมาชิก(id สมาชิก) วันที่(วันที่ส่งสินค้า) ที่อยู่(ที่อยู่ของสมาชิก)
        //เช็คว่ารหัสจัดส่งนี้ 
        //แสดงข้อมูลแล้วถามว่า
        Scanner sc = new Scanner(System.in);
        ArrayList<member> members = new ArrayList<member>(); 
        members.add(new member("1111", "Boss", "Hat-yai", "", null))
        ArrayList<member> productDelivery = new ArrayList<member>(); 
    
        char ans = 'y';
        while (ans == 'y') {
            System.out.println("Enter Product ID: "); //รหัสจัดส่งสินค้า
            String productID = sc.next();

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