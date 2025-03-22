import java.util.Scanner;
public class SortingMain23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[] = {20, 10, 2, 7, 12};
        Sorting23 dataUrut1 = new Sorting23(a, a.length);
    
        System.out.println("Data awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();

        int b[] = {30, 20, 2, 8, 14};
        Sorting23 dataUrut2 = new Sorting23(b, b.length);
        System.out.println("Data Awal 2");
        dataUrut2.tampil();
        dataUrut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataUrut2.tampil();

        int c[] = {40, 10, 4, 9, 3};
        Sorting23 dataUrut3 = new Sorting23(c, c.length);
        System.out.println("Data Awal 3");
        dataUrut3.tampil();
        dataUrut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataUrut3.tampil();
    }
}
