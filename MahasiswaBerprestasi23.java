public class MahasiswaBerprestasi23 {
    Mahasiswa23 [] listmhs = new Mahasiswa23[5];
    int idx;

    void tambah (Mahasiswa23 m) {
        if (idx < listmhs.length) {
            listmhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa23 m : listmhs) {
            m.tampilInformasi();
            System.out.println("--------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listmhs.length - 1; i++) {
            for (int j = 1; j < listmhs.length - i; j++) {
                if (listmhs[j].ipk > listmhs[j - 1].ipk) {
                    Mahasiswa23 tmp = listmhs[j];
                    listmhs[j] = listmhs[j - 1];
                    listmhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listmhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listmhs.length; j++) {
                if (listmhs[j].ipk < listmhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa23 tmp = listmhs[idxMin];
            listmhs[idxMin] = listmhs[i];
            listmhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listmhs.length; i++) {
            Mahasiswa23 temp = listmhs[i];
            int j = i;
            while (j > 0 && listmhs[j - 1].ipk < temp.ipk) {
                listmhs[j] = listmhs[j - 1];
                j--;
            }
            listmhs[j] = temp;
        }
    }
}
