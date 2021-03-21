/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author MOKLET-2
 */
public class Mountain extends Truck{
 
    public int seatHeight;
    public Mountain (int startHeight, int startCadence, int startGear, int startSpeed){
        super (startCadence, startGear, startSpeed);
        seatHeight = startHeight; 
    }
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public static void main (String [] aku){
        System.out.println("mulai berjalan");
        Mountain MB = new Mountain(0,0,0,0);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.speedUp(2);
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
    }
}
