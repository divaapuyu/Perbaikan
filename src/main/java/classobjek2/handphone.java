/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classobjek2;

/**
 *
 * @author DIVA
 */
public class handphone {
    private String tipe, warna, kapasitas;
    
    //sutter
    public void settipe(String t){
        tipe=t;
    }
    
    public void setwarna(String w){
        warna=w;
    }
    
    public void setkapasitas(String k){
        kapasitas=k;
    }
    
    //getter
    public String gettipe(){
    return this.tipe;
    }
    
    public String getwarna(){
    return this.warna;
    }
    
    public String getkapasitas(){
    return this.kapasitas;
    }
}
