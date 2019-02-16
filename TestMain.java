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
public class TestMain {
    public static void main(String[] args){
        Test[] tsArray = new Test[4];
        
        tsArray[0] = new Test (10,4);
        tsArray[1] = new Test (20,10);
        tsArray[2] = new Test (15,6);
        tsArray[3] = new Test (25,10);
        int i;
        
        for(i=0; i<4; i++){
            System.out.println("Hitung Balok ke "+ i +": " + tsArray[i].hitungLuas());
            System.out.println("Hitung Balok ke "+ i +": " + tsArray[i].hitungKeliling());
        }
    }
}
