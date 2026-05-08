import javax.swing.JOptionPane;

public class sistemTest {
    public static void main(String[] args) {
        Hotel h = new Hotel();
        h.pilihHotel();

        if (h.namaHotel.equals("Tidak Diketahui")) {
            return;
        }

        Tamu t = new Tamu();
        JOptionPane.showMessageDialog(null, "Selamat Datang di Sistem Reservasi " + h.namaHotel);
        t.inputDataTamu();

        
        Pemesanan pesanan = new Pemesanan(t, 5, 5);
        int tnyKamar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingin Pesan Berapa Kamar?"));
        for(int i = 0; i < tnyKamar; i++) {
            String nomorKamar = JOptionPane.showInputDialog("Masukkan Nomor Kamar:");
            String tipeKamar = JOptionPane.showInputDialog("Masukkan Tipe Kamar (Standar/Deluxe/Suite):");
            Kamar kamarBaru = new Kamar(nomorKamar, tipeKamar, h);
            pesanan.tambahKamar(kamarBaru);
        }

        int tnyLayanan = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingin Pesan Berapa Layanan?"));
        for(int i = 0; i < tnyLayanan; i++) {
            String jenisLayanan = JOptionPane.showInputDialog("Masukkan Jenis Layanan (Spa/Laundry/Gym):");
            Layanan layananBaru = new Layanan(jenisLayanan);
            pesanan.tambahLayanan(layananBaru);
        }

        int lama = Integer.parseInt(JOptionPane.showInputDialog("Lama Menginap (Malam):"));
        Pembayaran p = new Pembayaran(lama);
        p.hitungTotalBiaya(pesanan);
        
        pesanan.setPembayaran(p);
        pesanan.cetakStruk();
    }
}