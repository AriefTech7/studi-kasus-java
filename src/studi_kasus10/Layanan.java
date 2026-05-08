public class Layanan {
    String jenisLayanan;
    long hargaLayanan;

    Layanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
        tentukanHarga();
    }

    public long tentukanHarga(){
        if(jenisLayanan.equalsIgnoreCase("Spa")){
            return hargaLayanan = 200000;
        }else if (jenisLayanan.equalsIgnoreCase("Laundry")){
            return hargaLayanan = 50000;
        }else if (jenisLayanan.equalsIgnoreCase("Gym")){
            return hargaLayanan = 100000;
        }else{
            return hargaLayanan = 0;
        }
    }

    public void infoLayanan() {
        System.out.println("Layanan: " + jenisLayanan + " | Harga: Rp" + hargaLayanan);
    }
}