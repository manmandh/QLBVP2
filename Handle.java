import QuanLyBenhNhan.Model.BenhAnModel;
import QuanLyBenhNhan.Model.BenhNhanModel;

import java.util.ArrayList;
import java.util.Collections;

public class Handle {
    private ArrayList<BenhNhan> list;

    public Handle() {
        this.list = new ArrayList<BenhNhan>();
    }

    public void add(BenhAn benhAn) {
        this.list.add(benhAn);
    }

    public void add5BenhAn() {
        for (int i = 0; i < 2; i++) {
            System.out.println(String.format("Enter information (%d/%d)", i + 1, 2));
            BenhAn benhAn = new BenhAn();
            benhAn.addBenhAn();
            this.add(benhAn);
        }
    }

    public void printTuoiNhoHon10() {
        System.out.println("Print all age:");
        for (BenhNhan benhAn : list) {
            if (((BenhAn) benhAn).getTinhTuoi() < 10) {
                ((BenhAn)benhAn).outBenhAn();
                System.out.println("___");
            }
        }
    }

    public void sortAge(){
        Collections.sort(list, new sortAge());
        for(BenhNhan i : list){
            ((BenhAn) i).outBenhAn();
        }
    }

    public void MaxTienPhi() {
        double max = 0.0;
        for(BenhNhan BN :list){
            if(((BenhAn)BN).getTien() > max) max = ((BenhAn)BN).getTien();
        }
        for(int i = 0; i <list.size(); i++){
            double tienVienPhiTungBenhNhan = ((BenhAn) list.get(i)).getTien();
            if(tienVienPhiTungBenhNhan == max ){
                ((BenhAn) list.get(i)).outBenhAn();
            }
        }
    }
}
