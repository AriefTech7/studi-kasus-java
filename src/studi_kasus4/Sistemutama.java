package studi_kasus4;
import javax.swing.JOptionPane;
public class Sistemutama {
    public static void main(String[] args) {
        layanan l1 =new layanan("desain grafis","menggunakan canva",3,200000);
        layanan l2 =new layanan("pembuatan aplikasi","aplikasi mobile",7,5000000);
        layanan l3 =new layanan("penulisan artikel","artikel aktual",4,700000);
        layanan[] daftarlayanan= {l1,l2,l3};
        user udin = new user("RX-01","putro","873124",daftarlayanan);
        layanan[] pesan = new layanan[2];
        for (int i = 0; i < 3 ; i++) {
            int result = Integer.parseInt(JOptionPane.showInputDialog(null,udin.infoLayanan() + "\npilih layanan dan ketik 0 untuk selesai: "));
            if (result==0){
                break;
            }else if (result==1){
                pesan[i]=l1;
            }else if (result==2){
                pesan[i]=l2;
            } else if (result==3) {
                pesan[i]=l3;
            }
        }
        pemesanan pesananUdin = new pemesanan(udin,"10-05-2026",pesan);
        JOptionPane.showMessageDialog(null,pesananUdin.struk_pemesanan());


    }
}
