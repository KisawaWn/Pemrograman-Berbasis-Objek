public class Mahasiswa {
     int Nim;
     String Nama;
     char Kelas;
     String Prodi;
     double IPK;

     public Mahasiswa(int Nim,String Nama,char Kelas,String Prodi,double IPK){          
          this.Nim=Nim;
          this.Nama=Nama;
          this.Kelas=Kelas;
          this.Prodi=Prodi;
          this.IPK=IPK;
     }

     public void tampilData() {
          System.out.println("Nim: " +Nim);
          System.out.println("Nama: " +Nama);
          System.out.println("kelas: " +Kelas);
          System.out.println("Prodi: " + Prodi);
          System.out.println("Ipk: " + IPK);
     }     

     public void Alamat(String Alamat) {
          System.out.println("Alamat: " + Alamat);

     }

     public String kelulusan() {
          return (IPK >2.50) ? "Lulus" : "Tidak Lulus";
     }

     public int Tahunlulus(int masuk) {
          return masuk + 4;
     }
}
 