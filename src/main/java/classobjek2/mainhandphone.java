
package classobjek2;

import java.io.*;

public class mainhandphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        handphone hp= new handphone();
        samsung samsung= new samsung();
        
       try{
           do{
               System.out.println("--PBO Cell--");
               System.out.println("1. Isi data HP");
               System.out.println("2. Beli Hp");
               System.out.println("3. Keluar aplikasi");
               System.out.println("Pilih menu : ");
               int pilih = Integer.parseInt(br.readLine());
               
               switch(pilih){
                   case 1 :
                       System.out.println("--ISI DATA--");
                       System.out.println("Tipe : ");
                       hp.settipe(br.readLine());
                       System.out.println("Warna : ");
                       hp.setwarna(br.readLine());
                       System.out.println("Kapasitas : ");
                       hp.setkapasitas(br.readLine());
                       System.out.println("Harga : ");
                       samsung.setharga(Integer.parseInt(br.readLine()));
                       break;
                       
                   case 2 :
                       System.out.println("--BELI HP--");
                       System.out.println("Jumlah beli  : ");
                       samsung .setjumlah(Integer.parseInt(br.readLine()));
                       System.out.println("Total bayar : "+samsung.getbeli());
                       
                       break;
                       
                   case 3 : 
                       System.exit(0);
               }
           }while (true);
       }catch(Exception e){
           System.out.println("Ups ada yang tidak beres");
       }
    }
    
}
