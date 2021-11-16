package company_Staff;

public class Staff {
    private int id;
    private String name;
    private String phoneNumber;
    private String address;

    private static int idNumber = 1;

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        Staff.idNumber = idNumber;
    }

    public Staff(String name, String phoneNumber, String address) {
        this.id = idNumber++;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "company_Staff.Staff{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", phone number='" + phoneNumber + '\''
                + ", address='" + address + '\''
                + '}';

    }
}
