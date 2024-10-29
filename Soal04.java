import java.util.Scanner;

public class Soal04 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

        String kodePekerjaan = input.nextLine().toLowerCase();

        double honorKaryawan = 0;

        switch (kodePekerjaan) {
            case "DES":
                double jumlahJamsebulan = input.nextDouble();
                honorKaryawan = jumlahJamsebulan * 30000 ;
                break;
            case "PRG":
			double jumlahJamsebulan = input.nextDouble();
			honorKaryawan = jumlahJamsebulan * 30000 ;
                break;
            case "WRT":
			double jumlahJamsebulan = input.nextDouble();
			honorKaryawan = jumlahJamsebulan * 30000 ;
                honorKaryawan = 0.5 * alas * tinggi;
                break;
            case "MKT":
			double jumlahJamsebulan = input.nextDouble();
			honorKaryawan = jumlahJamsebulan * 30000 ;
                break;
            default:
                return;
        }

        // Menampilkan honorKaryawan
        System.out.println(honorKaryawan);
	}
}