/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

/**
 *
 * @author Massa
 */
public class mymeth {

    public boolean isNum(String txt) {
        try {
            float x = Float.parseFloat(txt);
        } catch (Exception e) {
            return false;
        }
        return  true;
    }
    
   /* public static void main(String[] args) {
        mymeth mm = new mymeth();
       boolean x =  mm.isNum("aaa");
        System.out.println(x);
    }*/
}
