public class rectangulo {
    double base;
    double altura;
    
    public rectangulo(double base, double altura) {
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
            area=(this.base*this.altura);
        return area;
    }
          public double getPerimetro() {
            double perimetro;
            perimetro=(this.base+this.base+this.altura+this.altura);
        return perimetro;
    }
}
