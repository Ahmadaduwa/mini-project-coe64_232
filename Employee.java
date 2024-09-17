import java.util.Date;

public class Employee extends Member {
    private String idEmployee; // รหัสพนักงาน
    private String nameEmployee; // ชื่อพนักงาน
    private String addressEmployee; // ที่อยู่พนักงาน
    private Date birthDate; // วันเกิดพนักงาน
    private double salaryEmployee; // เงินเดือนพนักงาน
    private String phoneNumberEmployee; // เบอร์โทรศัพพนักงาน

    public Employee(String id, String n, String l, String d, String num, String idEm, String nameEm, String addressEm, Date birthDateEm, double salaryEm, String phoneNumEm) {
        super(id, n, l, d, num);
        this.idEmployee = idEm;
        this.nameEmployee = nameEm;
        this.addressEmployee = addressEm;
        this.birthDate = birthDateEm;
        this.salaryEmployee = salaryEm;
        this.phoneNumberEmployee = phoneNumEm;
    }


    public String getIdEmployee() {
        return this.idEmployee;
    }

    public void setIdEmployee(String id) {
        this.idEmployee = id;
    }

    public String getNameEmployee() {
        return this.nameEmployee;
    }

    public void setNameEmployee(String name) {
        this.nameEmployee = name;
    }

    public String getAddressEmployee() {
        return this.addressEmployee;
    }

    public void setAddressEmployee(String address) {
        this.addressEmployee = address;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getSalaryEmployee() {
        return this.salaryEmployee;
    }

    public void setSalaryEmployee(double salary) {
        this.salaryEmployee = salary;
    }

    public String getPhoneNumberEmployee() {
        return this.phoneNumberEmployee;
    }

    public void setPhoneNumberEmployee(String phoneNumber) {
        this.phoneNumberEmployee = phoneNumber;
    }
}
