import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("___Please choose function___");
        System.out.println("1. Them Benh An vao danh sach ");
        System.out.println("2. Sap xep danh sach theo tuoi giam dan ");
        System.out.println("3. Hien ra danh sach cac benh nhan tuoi <10 ");
        System.out.println("4. Benh nhan co tien vien phi cao nhat");
    }
    public static void main(String[] args) {
        Handle handle = new Handle();
        boolean programFlag = true;
        Scanner scanner = new Scanner(System.in);

        while (programFlag){
            try {
                Main.menu();
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice){
                    case 1:
                        handle.add5BenhAn();
                        break;
                    case 2:
                        handle.sortAge();
                        break;
                    case 3:
                        handle.printTuoiNhoHon10();
                        break;
                    case 4:
                        handle.MaxTienPhi();
                        break;
                    default:
                        System.out.println("Sự lựa chọn không hợp lệ. Vui lòng chọn lại");
                }
            } catch (Exception e){
                System.out.println("Error, restart menu");
            }
        }
    }
}