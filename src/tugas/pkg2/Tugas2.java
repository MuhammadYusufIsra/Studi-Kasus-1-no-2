//Program pembelian tiket kereta api
package tugas.pkg2;
//Menginport scanner
import java.util.Scanner;

public class Tugas2 {

    
    public static void main(String[] args) {
        //Membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        //Mendeklarasikan variabel
        String nama1,kode1,kelas1,titik1,titik2,nama2,titik3,titik4;
        int jeniskereta,harga1,tiket1,total1,tiket2,hitungan1;
        
        //Mencetak judul, pilihan dan lainnya
        System.out.println("----------STASIUN KERETA MAHAL----------");
        System.out.println("1. Kereta Api");
        System.out.println("2. Kereta Listrik");
        //Menampilkan output untuk meminta data pada user
        System.out.print("Masukkan nomor pilihan anda : ");
        //menggunakan scanner
        jeniskereta = input.nextInt();
        
        //Percabangan if
        if (jeniskereta == 1){
            //Mencetak judul
            System.out.println("----------KERETA API----------");
            
            //Mencetak output untuk meminta data pada user
            System.out.print("Nama : ");
            //Menggunakan scanner
            nama1 = input.next();
            
            System.out.print("Kode Kereta : ");
            kode1 = input.next();
            
            System.out.print("Kelas kereta : ");
            kelas1 = input.next();
            
            //Cetak judul
            System.out.println("PILIH TITIK (JURUSAN)");
            System.out.print("[Titik awal] : ");
            titik1 = input.next();
            System.out.print("[Titik Akhir] : ");
            titik2 = input.next();
            
            System.out.println("-------------------");
            System.out.println("JURUSAN : "+titik1+"-"+titik2);
            System.out.println("-------------------");
            
            System.out.print("Harga Tiket yang Anda beli : ");
            harga1 = input.nextInt();
            
            System.out.print("Jumlah Tiket : ");
            tiket1 = input.nextInt();
            
            //Menggunakan operator aritmatika
            total1 = harga1*tiket1;
            //Mencetak total harga
            System.out.println(">>>>>>>>>> TOTAL BAYAR : Rp "+total1+",- <<<<<<<<<<");
            System.out.println(" ");
            System.out.println("------TERIMAKASIH TELAH MEMESAN TIKET KELAS "+kelas1+" KAMI------");
        //Percabangan else
        }else{
            System.out.println("----------KERETA LISTRIK----------");
            
            System.out.print("Nama : ");
            nama2 = input.next();
            System.out.println("PILIH TITIK (JURUSAN)");
            System.out.print("[Titik awal] : ");
            titik3 = input.next();
            System.out.print("[Titik Akhir] : ");
            titik4 = input.next();
            
            System.out.println("-------------------");
            System.out.println("JURUSAN : "+titik3+"-"+titik4);
            System.out.println("-------------------");
            
            
            System.out.print("Jumlah Tiket : ");
            tiket2 = input.nextInt();
            
            System.out.println(" ");
            
            hitungan1 = 4000*tiket2;
            System.out.println(">>>>>>>>>> TOTAL BAYAR : Rp "+hitungan1+",- <<<<<<<<<<");
            
            
            System.out.println("------TERIMAKASIH TELAH MEMESAN TIKET KAMI------");
            
        }
    }
}

// Mulai

// 1. Mengimpor scanner
// 2. Deklarasikan variabelnya
// 3. Buat scanner baru
// 4. Tampilkan judul
// 5. Tampilkan output kepada user (pilihan)
// 6. Menggunakan scanner
// 7. Menyimpan apa yang diberikan user pada scanner

// 8. Jika user memilih pilihan 1 (kereta api)
// 9. Tampilkan beberapa output kepada user
// 10. Menggunakan scanner
// 11. Menyimpan data
// 12. Ulangi sampai tidak ada data yang dibutuhkan
// 13. Menggunakan operator aritmatika (*)
// 14. Tampilkan Total harga bayar
// 15. Tampilkan pesan

// 16. Jika user memilih pilihan 2 (kereta listrik)
// 17. Tampilkan beberapa output kepada user
// 18. Menggunakan scanner
// 19.Menyimpan data
// 20. Ulangi sampai tidak ada data yang dibutuhkan
// 21. Buat operator untuk menghitung total harga bayar tiket (4000*Jumlah tiket yang dibeli)
// 22. Tampilkan pesan

// 23. Selesai
    


