package esercizio;

public class DipendenteFullTime extends Dipendenti{
public DipendenteFullTime (int matricola, int stipendio, Dipartimento dipartimento){
    super(matricola, stipendio, dipartimento);
}

    @Override
    public void calculateSalary() {
        System.out.println("stipendio mensile:" + " "+ getStipendio());
    }
}
