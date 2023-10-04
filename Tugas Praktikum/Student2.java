import java.util.Scanner;

public class Student2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.println("Masukkan SKS yang Anda Tempuh : ");
        int SKS = input.nextInt();

        System.out.println("Masukkan Kredit Nilai Anda : ");
        int kredit = input.nextInt();

        if (kredit <= 75) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Gagal");
        }

        double ipk = 0.0;

        if (kredit != 0) {
            ipk = (double) SKS / kredit;
        }

        System.out.println("Nama Anda : " + nama);
        System.out.println("SKS Anda : " + SKS);
        System.out.println("Kredit Nilai Anda : " + kredit);
        System.out.println("IPK Anda : " + ipk);

        input.close();
    }
}