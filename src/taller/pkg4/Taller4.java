package taller.pkg4;

import java.util.ArrayList;
import java.util.Scanner;

public class Taller4 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        String opcion;

        do
        {
            System.out.println("¿Qué figura desea crear? (Circulo, Triangulo, Cuadrado o Salir)");
            opcion = read.nextLine().toLowerCase();

            switch (opcion)
            {
                case "circulo":
                    System.out.println("Ingrese el radio del círculo en Cm:");
                    double radioCirculo = read.nextDouble();
                    read.nextLine();
                    Circulo circulo = new Circulo("Círculo", radioCirculo);
                    figuras.add(circulo);
                    break;

                case "triangulo":
                    System.out.println("Ingrese la medida de la base del triángulo en Cm:");
                    double baseTriangulo = read.nextDouble();
                    System.out.println("Ingrese la medida de la altura del triángulo en Cm:");
                    double alturaTriangulo = read.nextDouble();
                    System.out.println("Ingrese la medida del lado 1 del triángulo en Cm:");
                    double lado1Triangulo = read.nextDouble();
                    System.out.println("Ingrese la medida del lado 2 del triángulo en Cm:");
                    double lado2Triangulo = read.nextDouble();
                    System.out.println("Ingrese la medida del lado 3 del triángulo: en Cm");
                    double lado3Triangulo = read.nextDouble();
                    read.nextLine();
                    Triangulo triangulo = new Triangulo("Triángulo", baseTriangulo, alturaTriangulo, lado1Triangulo, lado2Triangulo, lado3Triangulo);
                    figuras.add(triangulo);
                    break;

                case "cuadrado":
                    System.out.println("Ingrese la medida de los lados del cuadrado en Cm:");
                    double ladoCuadrado = read.nextDouble();
                    read.nextLine();
                    Cuadrado cuadrado = new Cuadrado("Cuadrado", ladoCuadrado);
                    figuras.add(cuadrado);
                    break;

                case "salir":
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (!opcion.equals("salir"));

        System.out.println("Lista de figuras:");
        for (FiguraGeometrica figura : figuras)
        {
            
                System.out.println(figura.nombre+" area:"+figura.getArea()+" peimetro: "+figura.getPerimetro());
            
        }
    }

}
