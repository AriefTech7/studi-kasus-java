import javax.swing.JOptionPane;

public class Tamu {
    String idTamu;
    String namaTamu;
    String kontak;

    Tamu() {    
    }

    public void inputDataTamu() {
        this.idTamu = JOptionPane.showInputDialog("Masukkan ID Tamu:");
        this.namaTamu = JOptionPane.showInputDialog("Masukkan Nama Tamu:");
        this.kontak = JOptionPane.showInputDialog("Masukkan Kontak Tamu:");
    }

    public void cetakInfoTamu() {
        System.out.println("Nama Tamu: " + namaTamu + " | Kontak: " + kontak);
    }
}