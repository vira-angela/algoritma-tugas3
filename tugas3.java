import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array gaji berdasarkan golongan
        double[] gaji = { 5000000, 6500000, 9500000 };

        // Array persentase lembur
        int[] lemburPersen = { 30, 32, 34, 36, 38 };

        System.out.println("===============Sistem Hitung Penghasilan Karyawan===============");
        System.out.println("Gaji Lembur = persen lembur x gaji pokok");
        System.out.println("Total penghasilan = gaji lembur + gaji pokok");

        System.out.print("Masukkan Jenis Golongan (A/B/C): ");
        String golongan = input.next().toUpperCase();

        System.out.print("Masukkan Jumlah Jam Lembur: ");
        int jamLembur = input.nextInt();

        double gajiPokok = 0;

        // Menentukan gaji pokok berdasarkan golongan
        if (golongan.equals("A")) {
            gajiPokok = gaji[0];
        } else if (golongan.equals("B")) {
            gajiPokok = gaji[1];
        } else if (golongan.equals("C")) {
            gajiPokok = gaji[2];
        } else {
            System.out.println("Golongan tidak valid!");
            return;
        }

        double gajiLembur = 0;

        // Menghitung gaji lembur berdasarkan jam lembur
        if (jamLembur == 1) {
            gajiLembur = gajiPokok * lemburPersen[0] / 100;
        } else if (jamLembur == 2) {
            gajiLembur = gajiPokok * lemburPersen[1] / 100;
        } else if (jamLembur == 3) {
            gajiLembur = gajiPokok * lemburPersen[2] / 100;
        } else if (jamLembur == 4) {
            gajiLembur = gajiPokok * lemburPersen[3] / 100;
        } else if (jamLembur >= 5) {
            gajiLembur = gajiPokok * lemburPersen[4] / 100;
        }

        double totalPenghasilan = gajiPokok + gajiLembur;

        // Output
        System.out.println("\n=== Menghitung Total Penghasilan\r\n" + //
                "Karyawan ===");
        System.out.println("Golongan      : " + golongan);
        System.out.println("Gaji Pokok    : Rp " + gajiPokok);
        System.out.println("Jam Lembur    : " + jamLembur);
        System.out.println("Gaji Lembur   : Rp " + gajiLembur);
        System.out.printf("Total Penghasilan    : %,.0f", totalPenghasilan);

        input.close();
    }
}