/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisweek8;

/**
 *
 * @author Student
 */
public abstract class club {
    protected String latihan ="Club Berlatih";
    protected String bertanding = "Club Beranding";
    
    
    protected String getLatihan(){
      return latihan;
    }   
    protected String getTanding(){
        return bertanding;
    }
    protected abstract void PrintLatihan();
    protected abstract void PrintBertanding();
}
