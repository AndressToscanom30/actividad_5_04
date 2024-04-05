package Actividad_5_04;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    
    private LocalDate bornDate;

    public Persona(LocalDate bornDate) {
        this.bornDate = bornDate;
    }
        

    public LocalDate getbornDate() {
        return bornDate;
    }

    public void setbornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public String dias () {
        
        LocalDate fechaActual = LocalDate.now();
        Period vida = Period.between(bornDate, fechaActual);

        int años = vida.getYears();
        int meses = vida.getMonths();
        int dias = vida.getDays();

        return "Tienes " + años + " años, " + meses + " meses y " + dias + " dias de vida.";
    }

    
    public String toString() {
        
        return dias();
        
    }
}