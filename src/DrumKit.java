/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class DrumKit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DrunKitTestDrive d = new DrunKitTestDrive ();
       d.snare=false;
        if (d.snare==true){
            d.PlaySnare();
        }
        d.PlaySnare();
        d.PlayTopHat();
        
    }
    
}
