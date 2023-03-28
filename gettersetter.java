package gettersetter;



public class gettersetter {
private String nama;
private int umur;


public void Cetak(){
    System.out.println("Nama saya = "+getNama()+"\nberumur "+getUmur());
}
public String getNama(){
    return nama;
}
public void setNama(String nama){
    this.nama = nama;
}
public int getUmur(){
    return umur;
}
public void setUmur(int umur){
    this.umur = umur;
    }
}


