package Actividad_5_04;

public class Triangulo {
    
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int calculoArea(int base, int altura){
        
        return base * altura;
        
    }
    
    public int calculoPerimetro(int base, int altura){
        
        return base * 3;
        
    }

    @Override
    public String toString() {
        
        return "El area del triangulo es " + calculoArea(base, altura) + ".\nEl perímetro es " + calculoPerimetro(base, altura) + ".\nY la hipotenusa es " + altura;
    
    }
    
}
