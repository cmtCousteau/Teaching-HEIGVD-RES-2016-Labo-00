
package ch.heigvd.res.lab00;


public class Flute implements IInstrument{

    
    int volume = 1;
    String sound = "trilili";
    
    @Override
    public String play() {
       return sound;
    }

    @Override
    public int getSoundVolume() {
        return volume;
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
