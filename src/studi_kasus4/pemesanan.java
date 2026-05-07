package studi_kasus4;

public class pemesanan {
    public String nama_layanan,tanggal,status="working";
    public double totalBiaya=0;

    public pemesanan(String nama,String tanggal){
        this.nama_layanan=nama;
        this.tanggal=tanggal;
    }

    public void total_biaya(double biaya){
        totalBiaya+=biaya;
    }
    public double info_biaya(){
        return  totalBiaya;
    }
    public String struk_pemesanan(){
        return "nama layanan : "+nama_layanan+
                "\ntanggal : "+tanggal+
                "\nstatus : "+status+
                "\ntotal biaya : "+info_biaya();
    }
}
