
import java.util.Scanner;
import static javafx.scene.input.KeyCode.M;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class EjecucionEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleados camiloc =
                new Empleados ("Camilo" , "Casas" ,"Masculino", "15-12-1990" , "36-08-2016" , 10000, "foto" , 111111111);
        
       
        System.out.println("ingrese su numero de identificacion");
        Scanner teclado = new Scanner(System.in);
        int numid=teclado.nextInt();

        if (camiloc.numeroid == numid){
            System.out.println("ingrese el numero para la opcion que desea ingresas \n 1.Calcular salario 2. Antiguedad en la empresa \n 3. Edad del empleado");
            int opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("ingrese el numero de horas trabajadas");
                    int horast=teclado.nextInt();
                    camiloc.calcularSalario(horas);
                    System.out.println(camiloc.salario);
            }
        }
            

    
    
     
        
        
    }
    
}
