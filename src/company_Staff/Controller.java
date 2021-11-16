package company_Staff;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    public static void showStaff(Staff[] staffList) {
        for (Staff staff :staffList) {
            System.out.println(staff.toString());
        }
    }
    public static Staff[] createStaff(Staff[] staffList) {
        Staff staff = create();
        Staff[] newStaff = new Staff[staffList.length + 1];
        for (int i = 0; i < staffList.length; i++) {
            newStaff[i] = staffList[i];
        }
        newStaff[newStaff.length - 1] = staff;
        return newStaff;
    }
    public static Staff create() {
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter address");
        String address = scanner.nextLine();
        Staff staff = new Staff(name, phoneNumber, address);
        return staff;
    }

    public static int findStaffById(Staff[] staffList) {
        System.out.println("Enter staff-id:");
        int id = scanner.nextInt();
        for (int i = 0; i < staffList.length; i++) {
            if (id == staffList[i].getId()) {
                return i;
            }
        }
        return -1;
    }
    public static Staff[] delete(Staff[] staffList) {
        int index = findStaffById(staffList);
        if (index >= 0) {}
        Staff[] newList = new Staff[staffList.length - 1];
        for (int i = 0; i < newList.length; i++) {
            if (index <= i) {
                newList[i] = staffList[i + 1];
            } else {
                newList[i] = staffList[i];
            }
        }
        return newList;
    }
    public static Staff[] editStaff(Staff[] staffList){
        int index = findStaffById(staffList);
        Staff newStaff = create();
        staffList[index] = newStaff;
        Staff.setIdNumber(Staff.getIdNumber()-1);
        return staffList;
    }
}
