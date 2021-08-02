package latihan5;

public class Latihan5 {

    public static void main(String[] args) {
        System.out.println("===== Latihan 5 - Operasi Pengurangan Matriks Dengan Array =====");
 
        int matriksA [] [] = {{-5, 3}, {7, 2}}; //Deklarasi matriksA dengan ordo 2.2, memiliki baris 2 dan kolom 2
        int matriksB [] [] = {{3, 1}, {5, -2}}; //Deklarasi matriksB dengan ordo 2.2, memiliki baris 2 dan kolom 2
        
    int barisA = matriksA.length; //Deklarasi dimana barisA memiliki panjang yang sama dengan panjang baris matriksA
                                                     //Mengambil baris matriksA
    int kolomA = matriksA.length; //Deklarasi dimana kolomA memiliki yang sama dengan panjang kolom matriksA
                                                        //Mengambil kolom matriksA
    
    int barisB= matriksB.length; //Deklarasi dimana barisB memiliki panjang yang sama dengan panjang  baris matriksB
                                                   //Mengambil baris matriksB
    int kolomB = matriksB.length; //Deklarasi dimana kolomB memiliki yang sama dengan panjang kolom matriksB
                                                        //Mengambil kolom matriksB
    
    int [] [] hasilKurang = new int [barisA][kolomA]; //Membuat array baru untuk menyimpan hasil pengurangan 
                                                                                       //dimana baris dan kolom dari array baru sama dengan barisA dan kolomA yang 
                                                                                       //artinya baris dan kolom dari array hasilKurang == baris dan kolom dari array matriksA
   
    if(barisA == barisB && kolomA == kolomB){ //Persyaratan dari operasi pengurangan dua matriks, dimana syaratnya adalah ordo
                                                                                   //dari kedua matriks adalah sama, maka disyntax kan seperti syntax line 18 ini
                                                                                   
      for(int i = 0; i < barisA; i++){ //Perulangan untuk baris, dimana nilai i adalah 0 dan i kurang dari barisA, maka 
                                                        //perulangan itu akan dimulai dari angka 0 dan terjadi apabila nilai i kurang dari barisA
                                                        //i++, maka pada perulangannya akan terjadi perubahan nilai dengan i += 1
                                                        
           //For kedua akan terjadi jika for pertama bernilai true, jika for pertama bernilai false maka akan berhenti dan for kedua tdk dijalankan
           
        for(int j = 0; j < kolomA; j++){ //Perulangan untuk kolom, dimana nilai j adalah 0, dan j kurang dari kolomA
                                                             //maka perulangannya akan dimulai dari angka o dan terjadi jika nilai j kurang dari kolomA
                                                             //j++, maka pada perulangannya akan terjadi perubahan nilai dengan j += 1
                                                             
        hasilKurang[i][j] = matriksA[i][j] -  matriksB[i][j]; //Operan dan operator untuk menghitung pengurangan matriks
 
        }
      }  
      
    }else{ //Ini akan terjadi jika persyaratan pada if tidak terpenuhi, yang artinya ordo dari kedua matriks tidak sama
        System.out.println("Jumlah baris dan kolom matrix tidak sama"); //Mencetak message/keterangan bahwa jumlah baris dan kolom
                                                                                                                    //matriks tidak sama
    }
        
        System.out.println("Matriks A : "); //Mencetak keterangan MatriksA
        printArray(matriksA); //Memanggil fungsi printArray untuk mencetak matriiksA
        
        System.out.println("Matriks B : ");  //Mencetak keterangan MatriksB
        printArray(matriksB); //Memanggil fungsi printArray untuk mencetak matriiksB
        
        System.out.println("Matriks A - Matriks B : ");  //Mencetak keterangan MatriksA - MatriksB
        printArray(hasilKurang); //Memanggil fungsi printArray untuk mencetak hasilKurang sebagai hasil dari operasi pengurangan matriksA dan matriksB
    
    }
    
      //Membuat fungsi printArray untuk mencetak array
      private static void printArray(int [] [] dataArray){ //Fungsi printArray memiliki parameter array dataArray dengan tipe data integer
        int baris = dataArray.length; //Mengambil Baris data array
        int kolom = dataArray[0].length; //Mengambil kolom data array
        
        for(int i = 0; i < baris; i++){//Perulangan untuk baris, dimana nilai i adalah 0 dan i kurang dari baris, maka 
                                                        //perulangan itu akan dimulai dari angka 0 dan terjadi apabila nilai i kurang dari baris
                                                        //i++, maka pada perulangannya akan terjadi perubahan nilai dengan i += 1
            
        System.out.print("["); //Mncetak tanda kurung siku 
        
         for(int j = 0; j < kolom; j++){    //Perulangan untuk kolom, dimana nilai j adalah 0, dan j kurang dari kolom
                                                              //maka perulangannya akan dimulai dari angka o dan terjadi jika nilai j kurang dari kolom
                                                              //j++, maka pada perulangannya akan terjadi perubahan nilai dengan j += 1
             
         System.out.print(dataArray [i] [j]); //Mencetak dataArray dimana nilai baris dan kolomnya sesuai dengan variabel yang ada di perulangan
         
        if(j < kolom - 1){ //Persyaratan jika nilai j kurang dari (kolom - 1)
            //Statement ini akan dijalankan jika nilai if true
        System.out.print(",");
        }else{
         System.out.print("]");   
        }
        
            }
        System.out.print("\n"); //Enter
        }
        System.out.print("\n"); //Enter
    }
    
}
