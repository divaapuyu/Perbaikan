/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classobjek2;

/**
 *
 * @author DIVA
 */
public class samsung {
    private int harga,jumlah,total;
    
    //setter
    public void setharga(int h){
        harga=h;
    }
    
    public void setjumlah(int j){
        jumlah=j;
    }
    
    //getter
    public int getharga(){
        return this.harga;
    }
    
    public int getjumlah(){
        return this.jumlah;
    }
    
    //custom
    public int getbeli(){
     total = getharga() * getjumlah();
     return total;
    }
    
}
