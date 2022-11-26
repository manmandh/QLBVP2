public class BenhNhan {
    private String hoten;
    private String quequan;
    private int namsinh;
    public BenhNhan(){

    }

    public BenhNhan(String hoten, String quequan, int namsinh) {
        this.hoten = hoten;
        this.quequan = quequan;
        this.namsinh = namsinh;
    }

    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

}
