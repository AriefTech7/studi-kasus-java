package studi_kasus4;

public class layanan {
    private String nama,deskripsi;
    private int estimasi;
    private double harga;

    public layanan(String nama,String deskripsi, int estimasi, double harga){
        this.deskripsi=deskripsi;
        this.estimasi=estimasi;
        this.harga=harga;
        this.nama=nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getEstimasi() {
        return estimasi;
    }

    public void setEstimasi(int estimasi) {
        this.estimasi = estimasi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String info(){
        return "nama= "+nama+
                "\ndeskripsi= "+deskripsi+
                "\nestimasi= "+estimasi+
                "\nharga= "+harga;
    }



}
