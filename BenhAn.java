import java.util.Scanner;

public class BenhAn extends BenhNhan{
    public BenhAn() {
    }
    private String TenBenhAn;
    private int Tien;


    public BenhAn(String hoten, String quequan, int namsinh, String tenBenhAn,  int Tien) {
        super(hoten, quequan, namsinh);
        this.TenBenhAn = tenBenhAn;
        this.Tien = Tien;
    }

    public String getTenBenhAn() {
        return TenBenhAn;
    }
    public void setTenBenhAn(String tenBenhAn) {
        this.TenBenhAn = tenBenhAn;
    }
    public int getTien() {
        return Tien;
    }
    public void setTien(int tien) {
        this.Tien = tien;
    }

    public void addBenhAn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin ve benh an\n_____________ ");
        System.out.println("\nNhap ten:");
        super.setHoten(sc.nextLine());
        System.out.println("\nNhap que quan:");
        super.setQuequan(sc.nextLine());
        System.out.println("\nNhap nam sinh");
        super.setNamsinh(Integer.parseInt(sc.nextLine()));
        System.out.println("\nNhap benh an");
        this.setTenBenhAn(sc.nextLine());
        System.out.println("\nNhap tien benh an");
        this.setTien(sc.nextInt());
    }

    public void outBenhAn() {
        System.out.println("Ten: " +getHoten());
        System.out.println("Que quan: "+ getQuequan());
        System.out.println("Nam sinh: " + getNamsinh());
        System.out.println("Ten benh an: " +getTenBenhAn());
        System.out.println("Tien benh an: " +getTien());
    }

    public int getTinhTuoi(){
        return 2022-super.getNamsinh();
    }
}
