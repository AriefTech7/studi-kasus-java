public class Pemesanan {
    Tamu dataTamu;
    Kamar[] daftarKamar;
    Layanan[] daftarLayanan;
    int jumlahKamar = 0;
    int jumlahLayanan = 0;
    Pembayaran dataPembayaran;

    Pemesanan(Tamu dataTamu, int maxKamar, int maxLayanan) {
        this.dataTamu = dataTamu;
        this.daftarKamar = new Kamar[maxKamar];
        this.daftarLayanan = new Layanan[maxLayanan];
    }

    public void tambahKamar(Kamar kamarBaru) {
        if(jumlahKamar < daftarKamar.length) {
            daftarKamar[jumlahKamar] = kamarBaru;
            jumlahKamar++;
        }
    }

    public void tambahLayanan(Layanan layananBaru) {
        if(jumlahLayanan < daftarLayanan.length) {
            daftarLayanan[jumlahLayanan] = layananBaru;
            jumlahLayanan++;
        }
    }

    public void setPembayaran(Pembayaran p) {
        this.dataPembayaran = p;
    }

    public void cetakStruk() {
        System.out.println("\n--- DATA PEMESANAN ---");
        dataTamu.cetakInfoTamu();
        
        System.out.println("\nDaftar Kamar:");
        for(int i = 0; i < jumlahKamar; i++) {
            daftarKamar[i].infoKamar();
        }

        System.out.println("\nDaftar Layanan Tambahan:");
        if(jumlahLayanan == 0) System.out.println("- Tidak ada layanan tambahan -");
        for(int i = 0; i < jumlahLayanan; i++) {
            daftarLayanan[i].infoLayanan();
        }

        System.out.println("-----------------------");
        dataPembayaran.infoPembayaran();
    }
}