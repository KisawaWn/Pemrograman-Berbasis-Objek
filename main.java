public class main {
     public static void main(String[] args) {
          
          Mahasiswa mhs1 = new Mahasiswa(123345,"we.enz",'C',"informatika",3.50);



          
          Mahasiswa mhs2 = new Mahasiswa(1281721,"Larry",'D',"desain",2.50);




         
          System.out.println("Data Mahasiswa 1:");
          mhs1.tampilData();
          mhs1.Alamat("Ponorogo");
          System.out.println("Kelulusan: " + mhs1.kelulusan());
          System.out.println("tahun lulus: " + mhs1.Tahunlulus(2023));

          System.out.println();
          
          System.out.println("Data Mahasiswa 2:");
          mhs2.tampilData();
          mhs2.Alamat("Trenggalek");
          System.out.println("Kelulusan: " + mhs2.kelulusan());
          System.out.println("tahun lulus: " + mhs2.Tahunlulus(2023));
        
     }
     }