/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopSbatraski;

/**
 *
 * @author Student
 */
public class MahasiswaTurunan extends Mahasiswa{

    @Override
    protected void printnama() {
       System.out.println(super.nama); 
}
    public static void main(String []args){
        MahasiswaTurunan nt =new MahasiswaTurunan();
    nt.printnama();
    
    }
    }