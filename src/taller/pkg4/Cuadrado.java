/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg4;

/**
 *
 * @author ASUS
 */
public class Cuadrado extends FiguraGeometrica{

   private double lado;
    
    public Cuadrado(String nombre, double lado) {
        super(nombre, 4);
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }
    
    public double getLado() {
        return lado;
    }
    
    @Override
    public void calcularArea() {
        area = lado * lado;
    }
    
    @Override
    public void calcularPerimetro() {
        perimetro = 4 * lado;
    }
    
}
