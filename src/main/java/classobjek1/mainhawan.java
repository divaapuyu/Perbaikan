/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classobjek1;

/**
 *
 * @author DIVA
 */
public class mainhawan {
    public static void main(String[] div) {
       /*bisa mengakses class hewan,burung,ikan
        perlu membuat objek atau (instance of class)
        
        */
       //akses tipe suara  dan usia dari class hewan
       hewan burung = new hewan();
       hewan ikan = new hewan();
       
       //akses methid dari class burumg dan ikan
       burung b = new burung();
       ikan i = new ikan();
       
       //cara isi dari suara, tipe, dan usia 
       burung.settipe("Kakatua");
       burung.setsuara("kuk..kuk..kuk");
       burung.setusia(1);
       
       ikan.settipe("Lumba-lumba");
       ikan.setsuara("blurp..blurp..blurp");
       ikan.setusia(0);
       
       // cara ambil dari setter (hewan, burung, ikan)
       System.out.println("Aku " +burung.gettipe() +" suaraku "+burung.getsuara()+" usiaku "+burung.getusia()+" thn. ");
       b.terbang();
       
       System.out.println("Aku " +ikan.gettipe() +" suaraku "+ikan.getsuara()+" usiaku "+ikan.getusia()+" thn. ");
       i.berenang();
    }
    
}
