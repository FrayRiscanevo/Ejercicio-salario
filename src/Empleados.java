/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Empleados {
    private String nombre;
    private String apellido;
    private String genero;
    private String fechaNacimiento;
    private String fechaInreso;
    public int salario;
    private String foto;
    public int numeroid;
    public int horas;

    public Empleados(String nombre, String apellido, String genero, String fechaNacimiento, String fechaInreso, int salario, String foto, int numeroid) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaInreso = fechaInreso;
        this.salario = salario;
        this.foto = foto;
        this.numeroid = numeroid;
        
    }

    
    int calcularSalario(int numeroHoras){
        
        salario=numeroHoras*salario;
        return salario;
    }
    
    
}
