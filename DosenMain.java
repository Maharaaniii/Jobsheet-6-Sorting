import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        dataDosen23 daftarDosen = new dataDosen23();

        while (true) {
            System.out.println("\n=== Menu Data Dosen ===");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampilkan data dosen");
            System.out.println("3. Urutkan ASC berdasarkan usia");
            System.out.println("4. Urutkan DSC berdasarkan usia");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu:   ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode                  : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama                  : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis kelamin (P/L)   : ");
                    char jk = sc.next().charAt(0);
                    System.out.print("Usia                  : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    Dosen23 dsn = new Dosen23(kode, nama, null, usia);
                    daftarDosen.tambah(dsn);
                    break;

                case 2:
                    daftarDosen.tampil();
                    break;

                case 3:
                    daftarDosen.sortingASC();
                    break;

                case 4:
                    daftarDosen.sortingDSC();
                    daftarDosen.tampil();
                    break;

                case 5:
                    System.out.println("Selesai");
                    return;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}

