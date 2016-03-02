/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marco
 */
public class Orchestra {
    
    private List<IInstrument> InstrumentsList = new ArrayList<>();
    
    
    public int getNumberOfInstruments(){
      
        return InstrumentsList.size();
    }
    
    public void addInstrument(IInstrument objInstrument){
        
        InstrumentsList.add(objInstrument);       
    }
    
     public List<String>  makeMusic() {
        List<String> Listsounds = new ArrayList<>();
          
        for(IInstrument tmpInst : InstrumentsList){
            Listsounds.add(tmpInst.play());
        }  
        return Listsounds;
     }
}
