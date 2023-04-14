
package taller.pkg4;

public abstract class FiguraGeometrica {
   protected String nombre;
    protected int numLados;
    protected double area;
    protected double perimetro;
    
    public FiguraGeometrica(String nombre, int numLados) {
        this.nombre = nombre;
        this.numLados = numLados;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getNumLados() {
        return numLados;
    }
    
    public double getArea() {
        return area;
    }
    
    public double getPerimetro() {
        return perimetro;
    }
    
    public abstract void calcularArea();
    
    public abstract void calcularPerimetro();
}

