package Actividad_5_04;

public class Circulo {
    
    private int radio;

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public int getRadio() {
        return radio;
    }
    
    public Circulo(int radio) {
        this.radio = radio;
    }
    
    public double calculoArea(double radio){
        
        return 3.1416 * (radio * radio);
        
    }
    
    public double calculoPerimetro(int radio){
        
        return 2 * 3.1416 * radio;
        
    }

    @Override
    public String toString() {
        return "El area del circulo es " + calculoArea(radio) + ".\nY el perimetro es " + calculoPerimetro(radio);
    }
    
    
    
}
