/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classobjek1;

/**
 *
 * @author DIVA
 */
public class hewan {
    //attribut / data 
    private String tipe, suara;
    private int usia;
    
    //setter dari semua variabel/data/attribute
    //setter memiliki parameter
    public void settipe(String t){
         tipe=t;
    
    }
    
    public void setsuara(String suara){
        this.suara=suara;
    
    }
    
    public void setusia(int usia){
        this.usia=usia;
    
    }
    
    
    //getter dari semua variabel/data/attribute
    //geter tidak memiliki parameter karena lgsg mengambil data dari setter
    public String gettipe(){
        return this.tipe;
    }
    
    public String getsuara(){
        return this.suara;
    }
    
    public int getusia(){
        return this.usia;
    }
    
}
