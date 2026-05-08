public class Pembayaran {
    int lamaNginap;
    long totalBiaya;

    Pembayaran(int lamaNginap){
        this.lamaNginap = lamaNginap;
    }

    public long hitungTotalBiaya(Pemesanan pesanan){
        long totalKamar = 0;
        for(int i = 0; i < pesanan.jumlahKamar; i++) {
            totalKamar += pesanan.daftarKamar[i].hargaKamar;
        }
        
        long totalLayanan = 0;
        for(int i = 0; i < pesanan.jumlahLayanan; i++) {
            totalLayanan += pesanan.daftarLayanan[i].hargaLayanan;
        }

        this.totalBiaya = (totalKamar * lamaNginap) + totalLayanan;
        return this.totalBiaya;
    }

    public void infoPembayaran(){
        System.out.println("Lama Menginap: " + lamaNginap + " malam");
        System.out.println("Total Biaya Keseluruhan: Rp" + totalBiaya);
    }
}