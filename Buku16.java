public class Buku16 {

    String judul, pengarang;
    int halaman, stock, harga, jmlTerjual, hargaTotal, diskon, hargaBayar;

    
    void tampilInformasi(){
        System.out.println("Judul: "+ judul);
        System.out.println("Pengarang: "+ pengarang);
        System.out.println("Halaman: "+ halaman);
        System.out.println("Stok: "+ stock);
        System.out.println("Harga: "+ harga);

    }
    void terjual(int jml){
        if (stock>0 && stock >= jml){
          stock -= jml;
          jmlTerjual += jml;
          hitungHargaTotal(jml);
          hitungDiskon();
          hitungHargaBayar();  
        } else {
            System.out.println("Mohon maaf, Stok tidak mencukupi");
        }
        
        
    }
    void restok(int jml){
        stock += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }
    void hitungHargaTotal(int jml){
        hargaTotal=harga*jml;
    }
    void hitungDiskon(){
        if (hargaTotal>150000){
            diskon =(int)(hargaTotal*0.12);
        }else if (hargaTotal>75000){
            diskon =(int)(hargaTotal*0.05);
        }else{
            diskon=0;
        }
    }
    void hitungHargaBayar(){
        hargaBayar = hargaTotal- diskon;
    }
    public Buku16(){    
    }
    void hargaFinal(){
        System.out.println("Harga final: "+ hargaBayar);
    }
    public Buku16(String jud, String pg, int hal, int stock, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stock = stock;
        harga = har;
    }
    
}
