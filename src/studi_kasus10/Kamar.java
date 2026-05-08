public class Kamar {
    String nomorKamar, tipeKamar;
    long hargaKamar;
    Hotel hotel;

    Kamar(String nomorKamar, String tipeKamar, Hotel hotel) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.hotel = hotel;
        tentukanHarga();
    }
    
    public long tentukanHarga(){
        if(tipeKamar.equalsIgnoreCase("Standar")){
            return hargaKamar = 1000000;
        }else if (tipeKamar.equalsIgnoreCase("Deluxe")){
            return hargaKamar = 1250000;
        }else if (tipeKamar.equalsIgnoreCase("Suite")){
            return hargaKamar = 1500000;
        }else{
            return hargaKamar = 0;
        }
    }

    public void infoKamar(){
        System.out.println("Kamar No: " + nomorKamar + " | Tipe: " + tipeKamar + " | Harga: Rp" + hargaKamar);
    }
}