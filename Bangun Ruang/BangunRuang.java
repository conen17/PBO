public class BangunRuang {
    private static int Panjang;
    private static int Lebar;
    private static int Tinggi;

    public BangunRuang() {

    }

    public static void setPanjang(int p) {
        Panjang = p;
    }

    public static void setLebar(int l) {
        Lebar = l;
    }

    public static void setTinggi(int t) {
        Tinggi = t;
    }

    public static int getPanjang() {
        return Panjang;
    }

    public static int getLebar() {
        return Lebar;
    }

    public static int getTinggi() {
        return Tinggi;
    }
}