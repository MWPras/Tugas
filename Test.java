/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;

/**
 *
 * @author LENOVO
 */
public class Test {
    public int alas;
    public int tinggi;
    
    public Test(int a, int t){
        alas = a;
        tinggi = t;
    }
    public int hitungLuas(){
        return alas*tinggi;
    }
    public int hitungKeliling(){
        return 3*alas;
    }
}
