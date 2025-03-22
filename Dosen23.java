public class Dosen23 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen23 (String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
        System.out.println("Usia            : " + usia);
    }


}
