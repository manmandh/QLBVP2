import java.util.Comparator;

public class sortAge implements Comparator<BenhNhan> {
    public int compare(BenhNhan b1, BenhNhan b2) {
        int age1 = ((BenhAn)b1).getTinhTuoi();
        int age2 = ((BenhAn)b2).getTinhTuoi();
        if(age1>age2){
            return -1;
        }
        else{
            return 1;
        }
    }
}
