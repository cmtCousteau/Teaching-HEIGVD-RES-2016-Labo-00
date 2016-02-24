/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author marco
 */
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
