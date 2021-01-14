/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi2;
import java.util.Scanner;//library untuk inputan keyboard
/**
 *
 * @author MOKLET-2
 */
public class FungsiPengembalianNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Untuk mengambil input dari keyboard
        Scanner masukan = new Scanner(System.in);
        //Mendeklarasikan Variabel
        int a, b, c;
        //Perintah untuk menghasilkan output program
        System.out.println("Program Menjumlahkan 2 nilai");
        //User memasukkan nilai Variabel
        System.out.print("Masukkan nilai a : ");
        a = masukan.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = masukan.nextInt();
        System.out.print("Masukkan nilai c : ");
        c = masukan.nextInt();
        //Perintah untuk menghasilkan output program
        System.out.println();
        System.out.println("Jumlah a + b : "+(jumlah(a,b)));
        System.out.println("Jumlah b + c : "+(jumlah(b,c)));
        System.out.println("Jumlah a + c : "+(jumlah(a,c)));
        }
    //konstruktor
    //method int jumlah
    private static int jumlah(int a, int b){
    //Rumus untuk hasil
        int hasil = a + b;
    //Kegunaan return digunakan sebagai fungsi pada program 
        return hasil;
    }
    
}
