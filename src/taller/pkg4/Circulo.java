
package taller.pkg4;

public class Circulo extends FiguraGeometrica{
    private double radio;
    
    public Circulo(String nombre, double radio) {
        super(nombre, 0);
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    }
    
    public double getRadio() {
        return radio;
    }
    
    @Override
    public void calcularArea() {
        area = Math.PI * radio * radio;
    }
    
    @Override
    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }
}
