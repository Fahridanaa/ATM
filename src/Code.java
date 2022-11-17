import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int[][] user = {{123,123},{321,321}};
        boolean cot = true;
        int saldo = 0;
        String str = null;

        System.out.println("SELAMAT DATANG DI ATM ANJAY!");
        
        while(cot) {
        System.out.println("1. Ganti Pin\t\t 4. Pembayaran/Pembelian\n2. Penarikan Tunai\t 5. Informasi Saldo\n3. Transfer \t\t 6. Keluar");
        System.out.print("Pilih Transaksi yang Anda Inginkan: ");
        int menu = scan.nextInt();
        switch (menu) {

            //ganti pin
            case 1:
            boolean cotcot = true;
                while(cotcot) {
                System.out.println("Masukkan PIN Baru: ");
                int pin = scan.nextInt();
                System.out.println("Konfirmasi PIN");
                int konfirmasi = scan.nextInt();
                if (pin == konfirmasi) {
                    System.out.println("Perubahan Berhasil!");
                    break;
                }
                else {
                    System.out.println("\nMaaf pin yang anda masukkan salah, silahkan coba lagi!");
                }
                }
                break;

            //penarikan
            case 2:
                //beta vresion
                if (str == null) {
                    System.out.print("\nMasukkan saldo anda sekarang: ");
                    saldo = scan.nextInt();
                    str = String.valueOf(saldo);
                }
                    int[] tunai = {50000, 100000, 150000, 300000, 500000, 1000000, 2000000};
                    System.out.println("Pilih jumlah paket tunai: ");

                    //Ini seharusnya fix pilih salah satu----------------------------------------------------------------------------------
                    System.out.println("1. 50.000\t5. 500.000\n2. 100.000\t6. 1.000.000\n3. 150.000\t7. 2.000.000\n4. 300.000\t8. Lainnya");
                    System.out.print("Pilihan menu : ");
                    int tarik = scan.nextInt();
                            //perhitungan untuk pengambilan fixed nominal
                            for (int i = 0; i < tunai.length; i++) {
                                if (tarik == (i+1)) {
                                    saldo -= tunai[i];
                                }
                            }
                            //perhitungan pengambilan custom nominal--------------------------------------------------------------------------------------------------------------
                            if (tarik == 8) {
                                boolean bacot = true;
                                while(bacot) {
                                    System.out.print("Masukkan jumlah penarikan yang anda inginkan (Dalam Kelipatan Rp50.000) : ");
                                    tarik = scan.nextInt();
                                    if (tarik % 50000 != 0){
                                        System.out.println("Jumlah penarikan harus kelipatan Rp50.000!\n");
                                    }
                                    else if (saldo < tarik) {
                                        System.out.println();
                                    }
                                    else {
                                        saldo -= tarik;
                                        break;
                                    }
                                }
                        }
                System.out.println("Penarikan Berhasil!");
                System.out.println("Sisa saldo anda : " + saldo);
                break;

            //transfer    
            case 3:
            //ini gk guna, buat keren-kerenan hehe
            System.out.println("Masukkan Tujuan Bank : ");
            System.out.println("1. BCA\t\t5. BNI\n2. BRI\t\t6. BTN\n3. Danamon\t7. Mandiri\n4. VOC\t\t8. Lainnya");
            System.out.print("Tujuan Bank : ");
            int bank = scan.nextInt();
            System.out.print("Masukkan nominal transfer (biaya admin : 7500) : ");
            int trans = scan.nextInt();
            if (saldo > trans) {
                saldo -= trans - 7500;
                System.out.println("Transfer berhasil!");
                System.out.println("Sisa saldo anda : " + saldo);
            }
            else if (saldo < trans) {
                System.out.println("Maaf Saldo anda tidak cukup!");
            }
            
            break;

            //pembayaran
            case 4:
            System.out.println("Masukkan merchant : ");
            System.out.println("1. Tokopedia\t\t4. Shoopee\n2. Gojek\t\t5. Lazada\n3. Gramedia\t\t6. Dana");


            //keluar
            // case 6:
            // cot = false;
            // System.out.println("Terimakasih telah menggunakan layanan kami!");
            // break;

        }
            System.out.print("\nApakah Ingin Kembali ke Menu ? (Yes / No): ");
            String menu2 = sc.nextLine();
            if (menu2.equalsIgnoreCase("yes")) {
                continue;
            }
            else {
                cot = false;
                System.out.println("Terimakasih telah menggunakan layanan kami!");
            }
        }
    }
}