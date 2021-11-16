package company_Staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Staff[] staffList = new Staff[3];
        staffList[0] = new Staff("Toàn", "0988238888", "Hà Nội");
        staffList[1] = new Staff("Nam", "0988296666", "Hà Nội");
        staffList[2] = new Staff("Đào", "0988257777", "Hải Phòng");

        while (true) {
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Hiển thị nhân viên");
            System.out.println("4. Sửa nhân viên");
            int so = scanner.nextInt();
            switch (so) {
                case 1:
                    staffList = Controller.createStaff(staffList);
                    break;
                case 2:
                    staffList = Controller.delete(staffList);
                    break;
                case 3:
                    Controller.showStaff(staffList);
                    break;
                case 4:
                    staffList = Controller.editStaff(staffList);
                    break;
            }
        }
    }
}
