/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author manue
 */
public class nomina {
    private String nombre;
    private String apellidos;
    private double años_en_la_empresa;
    private double dias_trabajados;
    private double salario;

    public nomina() {
    }

    public nomina(String nombre, String apellidos, double años_en_la_empresa, double dias_trabajados) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.años_en_la_empresa = años_en_la_empresa;
        this.dias_trabajados = dias_trabajados;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getAños_en_la_empresa() {
        return años_en_la_empresa;
    }

    public void setAños_en_la_empresa(double años_en_la_empresa) {
        this.años_en_la_empresa = años_en_la_empresa;
    }

    public double getDias_trabajados() {
        return dias_trabajados;
    }

    public void setDias_trabajados(double dias_trabajados) {
        this.dias_trabajados = dias_trabajados;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario() {
        this.años_en_la_empresa=this.años_en_la_empresa+(this.dias_trabajados/360);
        if(this.años_en_la_empresa<7){
            this.salario=70-(70*0.2);
        }
        else{
            this.salario=80-(80*0.2);
        }
    }
    
    
    
}
