
package taller.pkg4;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(String nombre, double base, double altura, double lado1, double lado2, double lado3) {
        super(nombre, 3);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        calcularArea();
        calcularPerimetro();
    }
    
    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public double getLado1() {
        return lado1;
    }
    
    public double getLado2() {
        return lado2;
    }
    
    public double getLado3() {
        return lado3;
    }
    
    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
    }
    
    @Override
    public void calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
    }
}
