public class Buku16 {

    String judul, pengarang;
    int halaman, stock, harga;

    
    void tampilInformasi(){
        System.out.println("Judul: "+ judul);
        System.out.println("Pengarang: "+ pengarang);
        System.out.println("Halaman: "+ halaman);
        System.out.println("Stok: "+ stock);
        System.out.println("Harga: "+ harga);

    }
    void terjual(int jml){
        if (stock>0){
          stock -= jml;  
        }
        
    }
    void restok(int jml){
        stock += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }
    public Buku16(){

    }
    public Buku16(String jud, String pg, int hal, int stock, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stock = stock;
        harga = har;
    }
    
}