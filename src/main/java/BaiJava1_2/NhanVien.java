/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiJava1_2;

/**
 *
 * @author NGUYENPC
 */
public class NhanVien {
    private String Ten;
    private int Tuoi;
    private String Diachi;
    private double Tienluong;
    private int Tongsogiolam;

   
    public void setTen(String Ten){
        this.Ten = Ten;
    }
     public String getTen() {
        return Ten;
    }
   
    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }
     public int getTuoi() {
        return Tuoi ;
    }
    
    public void setDiachi(String Diachi){
        this.Diachi = Diachi;
    }
    public String getDiachi(){
        return Diachi;
    }
    
    public void setTienluong(double Tienluong){
        this.Tienluong = Tienluong;
    }
    public double getTienluong(){
        return Tienluong;
    }
    
    public void setTongsogiolam(int Tongsogiolam){
        this.Tongsogiolam = Tongsogiolam;
    }
    public int getTongsogiolam(){
        return Tongsogiolam;
    }
    public String getThongTin(){
        return "Ten: " + Ten + "\n" + "Tuoi: " + Tuoi + "\n" + "Dia chi: " + Diachi + "\n" + "Tien luong: " + Tienluong + "\n" + "Tong so gio lam: " + Tongsogiolam;
    }
    public double tinhThuong() {
        if (Tongsogiolam >= 200) return Tienluong * 0.2;
        else if (Tongsogiolam >= 100 && Tongsogiolam < 200) return Tienluong * 0.1;
        else return 0;
    }
}
