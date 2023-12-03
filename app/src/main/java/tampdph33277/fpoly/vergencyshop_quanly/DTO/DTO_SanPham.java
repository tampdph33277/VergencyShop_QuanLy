package tampdph33277.fpoly.vergencyshop_quanly.DTO;

import java.io.Serializable;

public class DTO_SanPham implements Serializable {

    String anhSP,giaSP,tenSP,motaSP,danhmucSP,trangthaiSP;

    public DTO_SanPham() {
    }

    public String getTrangthaiSP() {
        return trangthaiSP;
    }

    public void setTrangthaiSP(String trangthaiSP) {
        this.trangthaiSP = trangthaiSP;
    }

    public DTO_SanPham(String anhSP, String giaSP, String tenSP, String motaSP, String danhmucSP) {
        this.anhSP = anhSP;
        this.giaSP = giaSP;
        this.tenSP = tenSP;
        this.motaSP = motaSP;
        this.danhmucSP = danhmucSP;
    }

    public DTO_SanPham(String anhSP, String giaSP, String tenSP, String motaSP, String danhmucSP, String trangthaiSP) {
        this.anhSP = anhSP;
        this.giaSP = giaSP;
        this.tenSP = tenSP;
        this.motaSP = motaSP;
        this.danhmucSP = danhmucSP;
        this.trangthaiSP = trangthaiSP;
    }

    public String getMotaSP() {
        return motaSP;
    }

    public void setMotaSP(String motaSP) {
        this.motaSP = motaSP;
    }





    public String getDanhmucSP() {
        return danhmucSP;
    }

    public void setDanhmucSP(String danhmucSP) {
        this.danhmucSP = danhmucSP;
    }



    public String getAnhSP() {
        return anhSP;
    }

    public void setAnhSP(String anhSP) {
        this.anhSP = anhSP;
    }

    public String getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(String giaSP) {
        this.giaSP = giaSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }


}