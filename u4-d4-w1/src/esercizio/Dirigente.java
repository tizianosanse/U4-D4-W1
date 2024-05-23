package esercizio;

public class Dirigente extends Dipendenti{
    public Dirigente (int matricola, int stipendio, Dipartimento dipartimento){
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary() {
        System.out.println("stipendio mensile:" + " "+ getStipendio());
    }
}
