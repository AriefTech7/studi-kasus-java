import javax.swing.JOptionPane;

public class Hotel {
    String namaHotel, alamatHotel, telpHotel;
    
    Hotel() { 
    }

    public void pilihHotel() {
        String menu = "Pilih Hotel:\n1. Hotel Pangeran (Jl. Sudirman)\n2. Hotel Novotel (Jl. Riau)";
        int pilih = Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch(pilih) {
            case 1:
                this.namaHotel = "Pangeran";
                this.alamatHotel = "Jl. Sudirman";
                this.telpHotel = "08080808";
                break;
            case 2:
                this.namaHotel = "Novotel";
                this.alamatHotel = "Jl. Riau";
                this.telpHotel = "07119999";
                break;
            default:
                this.namaHotel = "Tidak Diketahui";
                this.alamatHotel = "-";
                this.telpHotel = "-";
                JOptionPane.showMessageDialog(null, "Pilihan tidak tersedia.");
        }
    }

    public void infoHotel() {
        System.out.println("Hotel: " + namaHotel + " | Alamat: " + alamatHotel);
    }
}