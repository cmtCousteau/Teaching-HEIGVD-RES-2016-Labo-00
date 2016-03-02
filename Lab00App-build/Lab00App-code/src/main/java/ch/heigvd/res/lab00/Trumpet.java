
package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument{

    int volume = 2;
    String color = "golden";
    String sound = "pouet";
    
    
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
        return color;
    }

    
}
