package studi_kasus4;

public class pemesanan {
    public String tanggal,status="working";
    public double totalBiaya=0;
    private layanan[] daftarLayanan;
    private user pemesan;

    public pemesanan(user pemesan, String tanggal, layanan[] daftarLayanan){
        this.pemesan=pemesan;
        this.daftarLayanan=daftarLayanan;
        this.tanggal=tanggal;
        total_biaya();
    }

    public void total_biaya(){
        for (int i = 0; i < daftarLayanan.length; i++) {
            if(daftarLayanan[i] != null){
                totalBiaya+=daftarLayanan[i].getHarga();
            }
        }
    }
    public String struk_pemesanan(){
        String struk = "Pemesan : "+pemesan.getNama()+
                "\nTanngal : "+tanggal+
                "\nStatus : "+status+
                "\n--Daftar Layanana---\n";
        for (int i = 0; i < daftarLayanan.length; i++) {
            if(daftarLayanan[i] != null){
                struk+= "- "+daftarLayanan[i].getNama() + "Rp"+daftarLayanan[i].getHarga()+"\n";
            }
        }
        struk+="Total Biaya : Rp"+totalBiaya;
        return struk;
    }
}
