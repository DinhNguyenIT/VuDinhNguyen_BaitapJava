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
public class MainClass {
        public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Vu Dinh Nguyen");
        nv1.setTuoi(22);
        nv1.setDiachi("Huyen: Eakar,Tinh: Daklak");
        nv1.setTienluong(2300);
        nv1.setTongsogiolam(90);
        System.out.println(nv1.getThongTin());
        System.out.println("Tien thuong: " + nv1.tinhThuong() + "\n");

        NhanVien nv2 = new NhanVien();
        nv2.setTen("Tran Nhat Nam");
        nv2.setTuoi(19);
        nv2.setDiachi("Huyen: Ehleo, Tinh: Daklak");
        nv2.setTienluong(2000);
        nv2.setTongsogiolam(140);
        System.out.println(nv2.getThongTin());
        System.out.println("Tien thuong: " + nv2.tinhThuong());
    }
}
