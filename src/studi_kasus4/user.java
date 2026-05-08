package studi_kasus4;
public class user {
    private String id,nama,kontak;
    public Boolean penyedia=false,pemesan=true;
    public layanan[] jasa;

    public user(String id,String nama, String kontak, layanan[] jasa){
        this.kontak=kontak;
        this.id=id;
        this.nama=nama;
        this.jasa=jasa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String infoUser(){
        String status="";
        if (penyedia==true && pemesan==true){
            status="penyedia jasa dan pemesan";
        } else if (penyedia==true) {
            status="penyedia jasa";
        } else if (pemesan==true) {
            status="pemesan";
        }
        return "nama : "+nama+
                "\nid : "+id+
                "\nkontak : "+kontak+
                "\nstatus : "+status;
    }

    public String infoLayanan(){
        String result = "";
        result+="===Layanan===\n";
        for (int i = 0; i < jasa.length; i++) {
            result+="\n"+(i+1)+". "+jasa[i].info();
        }
        return result;
    }
}
