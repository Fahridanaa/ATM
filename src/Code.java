import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int[][] user = {{123,123},{321,321}};
        boolean cot = true;
        System.out.println("SELAMAT DATANG DI ATM ANJAY!");
        
        while(cot) {
        System.out.println("1. Ganti Pin\t\t 2. Penarikan Tunai\n3. Transfer\t\t 4. Informasi Saldo\n5. Pembayaran/Pembelian\t 6. Keluar");
        System.out.print("Pilih Transaksi yang Anda Inginkan: ");
        int menu = scan.nextInt();
        switch (menu) {
            case 1: 
                while(pin) {
                System.out.println("Masukkan PIN Baru: ");
                int pin = scan.nextInt();
                System.out.println("Konfirmasi PIN");
                int konfirmasi = scan.nextInt();
                if (pin == konfirmasi) {
                    System.out.println("Perubahan Berhasil!");
                    break;
                }
                else {

                }
                }
            }
            System.out.print("Apakah Ingin Kembali ke Menu ? (Yes / No): ");
            String menu2 = sc.nextLine();
            if (menu2.equalsIgnoreCase("yes")) {
                continue;
            }
            else {
                cot = false;
            }
        }
    }
}