import java.util.*;
public class triangulo_rectangulo {
    double base;
    double altura;
    double hipotenusa;
    public triangulo_rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
     
    }

    public double getBase() {

        return base;
    }

    public void setBase(double base) {

        this.base = base;
    }

    public double getAltura() {

        return altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }
        public double getArea() {
            double area;
            area=(this.base*this.altura)/2;
        return area;
    }
          public double getPerimetro() {
            double perimetro;
            this.hipotenusa=Math.sqrt(Math.pow(this.altura,2)+Math.pow(this.base,2));
            perimetro=(this.hipotenusa+this.base+this.altura);
        return perimetro;
    }
    public double getHipotenusa() {
            this.hipotenusa=Math.sqrt(Math.pow(this.altura,2)+Math.pow(this.base,2));
        return hipotenusa;
    }
    public String getTipotriangulo(){
        this.hipotenusa=Math.sqrt(Math.pow(this.altura,2)+Math.pow(this.base,2));
        double alt=this.altura;
        double bas=this.base ;
        double hip=this.hipotenusa;
        String tipotriangulo="";
        if(alt==bas && alt==hip &&bas==hip){
        tipotriangulo="equilatero";
        }
        if((alt==bas && alt!=hip)||(bas==hip && bas!=alt)||(hip==alt && hip!=bas)){
        tipotriangulo="isosceles";
        }
        if(alt!=bas&&alt!=hip&&bas!=hip){
            tipotriangulo="escaleno";
        }
    return tipotriangulo;
    }
          
}
