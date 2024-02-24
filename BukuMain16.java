public class BukuMain16 {
    public static void main(String[] args) {
        Buku16 bkl = new Buku16();
        bkl.judul = "Todays End Tomorrow Comes";
        bkl.pengarang = "Denanda Pratiwi";
        bkl.halaman = 198;
        bkl.stock = 13;
        bkl.harga = 71000;

        bkl.tampilInformasi();
        bkl.terjual(5);
        bkl.gantiHarga(60000);
        bkl.tampilInformasi();

        Buku16 bk2 = new Buku16("self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}
