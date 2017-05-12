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
public abstract  class Mahasiswa {
    protected String nama ="Pradhana Syukur";
    protected String nim = "14111074";
    
    
    protected String getNama(){
        return nama;
    }
     protected String getNim(){
           return nim;
     }
     protected abstract void printnama();
     
     
}

