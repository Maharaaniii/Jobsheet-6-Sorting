import java.util.Scanner;
public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
        System.out.print("Masukkan jumlah Mahasiswa   : ");
        int jml = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM       : ");
            String nim = sc.nextLine();
            System.out.print("Nama      : ");
            String nama = sc.nextLine();
            System.out.print("Kelas     : ");
            String kelas = sc.nextLine();
            System.out.print("IPK       : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa23 m = new Mahasiswa23(kelas, nama, kelas, ipk);
            list.tambah(m);
            System.out.println("--------------------------------");
        }
        System.out.println("Data Mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC)   :   ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}
