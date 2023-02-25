public class circulo {
    double radio;
    double pi;

    
    public circulo(double radio) {
        this.radio = radio;
        this.pi = 3.1416;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }
        public double getArea() {
            double area;
            area=((this.radio*this.radio)*this.pi);
        return area;
    }
          public double getPerimetro() {
            double perimetro;
            perimetro=((this.radio*2)*this.pi);
        return perimetro;
    }


    
}
