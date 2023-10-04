public class VehicleTester {
    public static void main(String[] args) {

        BangunRuang Balok = new BangunRuang();

        BangunRuang.setPanjang(Integer.parseInt("5"));
        BangunRuang.setLebar(Integer.parseInt("5"));
        BangunRuang.setTinggi(Integer.parseInt("5"));

        int p = BangunRuang.getPanjang();
        int l = BangunRuang.getLebar();
        int t = BangunRuang.getTinggi();

        System.out.println("Luas Balok: " + Balok.getPanjang() * Balok.getLebar() * Balok.getTinggi());
    }
}