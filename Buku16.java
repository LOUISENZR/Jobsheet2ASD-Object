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
        harga -= hrg;
    }
}