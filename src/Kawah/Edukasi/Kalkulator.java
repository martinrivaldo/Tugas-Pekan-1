package Kawah.Edukasi;


import java.lang.Exception;
import java.util.Scanner;
import java.io.FileWriter;


public class Kalkulator {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        try {
            while (true){
                System.out.println("\n===== Pilih program =====");
                System.out.println("\n1.Tambah\n2.Pengurangan\n3.Perkalian\n4.Pembagian\n5.Sisa bagi\n6.Keluar");

                System.out.println("Masukan pilihan : ");
                int input = Integer.parseInt(scan.nextLine());
                if (input == 1){
                    tambah();
                } else if (input == 2){
                    kurang();
                } else if (input == 3){
                    perkalian();
                } else if (input == 4){
                    pembagian();
                } else if (input == 5){
                    sisaBagi();
                } else {
                    break;
                }
            }
        } catch (Exception e){
            System.err.println(e);
            System.out.println("\nInput yang anda masukkan tidak sesuai");
        }


    }

    private static void tambah() throws Exception {

        Scanner scan = new Scanner(System.in);
        try{
            FileWriter myWriter = new FileWriter("result.txt");
            double hasil;
            System.out.println("Masukkan angka pertama = ");
            double angka1 = scan.nextDouble();
            System.out.println("Masukkan angka kedua = ");
            double angka2 = scan.nextDouble();
            hasil = angka1 + angka2;
            myWriter.write(String.valueOf(hasil));
            myWriter.close();
            System.out.printf("Hasil = %.1f  " ,hasil);
        } catch (Exception e){
            System.err.println(e);
        }

    }

    private static void kurang() throws Exception {

        Scanner scan = new Scanner(System.in);
        try{
            FileWriter myWriter = new FileWriter("result.txt");

            double hasil;
            System.out.println("Masukkan angka pertama = ");
            double angka1 = scan.nextDouble();
            System.out.println("Masukkan angka kedua = ");
            double angka2 = scan.nextDouble();
            hasil = angka1 - angka2;
            myWriter.write(String.valueOf(hasil));
            myWriter.close();
            System.out.printf("Hasil = %.1f " ,hasil);
        } catch (Exception e){
            System.err.println(e);
        }

    }

    private static void perkalian() throws Exception {

        Scanner scan = new Scanner(System.in);
       try {
           FileWriter myWriter = new FileWriter("result.txt");


           double hasil;
           System.out.println("Masukkan angka pertama = ");
           double angka1 = scan.nextDouble();
           System.out.println("Masukkan angka kedua = ");
           double angka2 = scan.nextDouble();
           hasil =  angka1 * angka2;
           myWriter.write(String.valueOf(hasil));
           myWriter.close();
           System.out.printf("Hasil = %.1f" , hasil);
       } catch (Exception e){
           System.err.println(e);
       }

    }

    private static void pembagian() throws Exception {

        Scanner scan = new Scanner(System.in);
       try {
           FileWriter myWriter = new FileWriter("result.txt");
           double hasil;
           System.out.println("Masukkan angka pertama = ");
           double angka1 = scan.nextDouble();
           System.out.println("Masukkan angka kedua = ");
           double angka2 = scan.nextDouble();
           if (angka1 == 0 || angka2 == 0) {
               myWriter.write("Cannot divide by zero");
               myWriter.close();
               System.out.println("Cannot divide by zero");
           } else {
               hasil = (double)angka1 / angka2;
               myWriter.write(String.valueOf(hasil));
               myWriter.close();
               System.out.printf("Hasil = %.2f" , hasil);

           }
       } catch (Exception e){
           System.err.println(e);
       }
    }

    private static void sisaBagi() throws Exception {

        Scanner scan = new Scanner(System.in);
       try {
           FileWriter myWriter = new FileWriter("result.txt");

           System.out.println("Masukkan angka pertama = ");
           int angka1 = scan.nextInt();
           System.out.println("Masukkan angka kedua = ");
           int angka2 = scan.nextInt();
           int hasil;
           if (angka1 == 0 || angka2 == 0){
               myWriter.write("Cannot divide by zero");
               myWriter.close();
               System.out.println("Cannot divide by zero");
           } else {
               hasil = angka1 % angka2;
               myWriter.write(String.valueOf(hasil));
               myWriter.close();
               System.out.println("Hasil = " + hasil);
           }
       } catch (Exception e){
           System.err.println(e);
       }


    }

}
