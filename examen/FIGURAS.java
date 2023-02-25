import java.util.*;

public class FIGURAS {

    public static void main(String[] args) {

        int opc1;
        double base,altura;
        boolean salida=false;
        Scanner leer1=new Scanner(System.in);
        Scanner leer2=new Scanner(System.in);
        Scanner leer3=new Scanner(System.in);
        while(!salida){
        System.out.println("de que figura desea sacar su Area y perimetro\n1-circulo\n2-cuadrado\n3-rectangulo\n4-triangulo rectangulo");
        opc1=leer1.nextInt();
            switch (opc1) {
                case 1 -> {
                    System.out.println("circulo");
                    System.out.println("ingrese el radio del circulo en cm");
                    double radio = leer2.nextDouble();
                    circulo fig1 = new circulo(radio);
                    System.out.println("el area del circulo es: " + fig1.getArea());
                    System.out.println("el perimetro del circulo es: " + fig1.getPerimetro());
                }
                case 2 -> {
                    System.out.println("cuadrado");
                    System.out.println("ingrese la base del cuadrado en cm");
                    double lado = leer2.nextDouble();
                    cuadrado fig2 = new cuadrado(lado);
                    System.out.println("el area del cuadrado es: " + fig2.getArea());
                    System.out.println("el perimetro del cuadrado es: " + fig2.getPerimetro());
                }
                case 3 -> {
                    System.out.println("rectangulo");
                    System.out.println("ingrese la base del rectangulo en cm");
                    base = leer2.nextDouble();
                    System.out.println("ingrese la altura del rectangulo en cm");
                    altura = leer2.nextDouble();
                    rectangulo fig3 = new rectangulo(base, altura);
                    System.out.println("el area del rectangulo es: " + fig3.getArea());
                    System.out.println("el perimetro del rectangulo es: " + fig3.getPerimetro());
                }
                case 4 -> {
                    System.out.println("triangulo");
                    System.out.println("ingrese la base del triangulo en cm");
                    base = leer2.nextDouble();
                    System.out.println("ingrese la altura del triangulo en cm");
                    altura = leer2.nextDouble();
                    triangulo_rectangulo fig4 = new triangulo_rectangulo(base, altura);
                    System.out.println("el area del triangulo es: " + fig4.getArea());
                    System.out.println("el perimetro del triangulo es: " + fig4.getPerimetro());
                    System.out.println("la hipotenusa del triangulo es: " + fig4.getHipotenusa());
                    System.out.println("el tipo del triangulo es: " + fig4.getTipotriangulo());
                    System.out.println(fig4.getAltura());
                }
                default -> System.out.println("Ingrese una opcion valida ");
            }
        int opc2;
        boolean validacion=false;
        while(!validacion){
        System.out.println("desea realizar otro calculo?\n1-si\n0-no");
          opc2=leer3.nextInt();
            if(opc2==0){
                salida=true;
                validacion=true;
            }
            else if(opc2==1){
                System.out.println("Continuando");

            }
            else{
                System.out.println("ingrese un dato valido");
            }
        }
    }
    
    }
}
