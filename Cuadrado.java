package Actividad_5_04;

public class Cuadrado {
    
    private int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    public int calculoArea(int lado){
        
        return lado * lado;
        
    }
    
    public int calculoPerimetro(int lado){
        
        return lado * 4;
        
    }
    
    @Override
    public String toString() {
        
        return "El area de cuadrado es: " + calculoArea(lado) + "\nY el perímetro es: " + calculoPerimetro(lado);
        
    }
    
}
