public class dataDosen23 {
    Dosen23[] dataDosen = new Dosen23[3];
    int idx = 0;

    void tambah(Dosen23 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen");
        } else {
            System.out.println("\n=== Daftar Dosen ===");
            for (int i = 0; i < idx; i++) {
                dataDosen[i].tampil();
                System.out.println("-----------------------");
            }
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx; i++) {
            for (int j = 0; j < idx - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen23 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = tmp;
                }
            }
        }
        System.out.println("Data dosen berhasil diurutkan (ASC) berdasarkan usia");
    }

    void sortingDSC() {
        for (int i = 0; i < idx; i++) {
            int maxIdx = i; 
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen23 tDosen23 = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = tDosen23;
        }
        System.out.println("Data dosen berhasil diurutkan (DSC) berdasarkan usia");
    }
}
