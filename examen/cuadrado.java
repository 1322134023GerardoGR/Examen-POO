public class cuadrado {
    double lado;

    public cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getArea() {
            double area;
            area=(this.lado*this.lado);
        return area;
    }
          public double getPerimetro() {
            double perimetro;
            perimetro=(this.lado+this.lado+this.lado+this.lado);
        return perimetro;
    }
  
}
