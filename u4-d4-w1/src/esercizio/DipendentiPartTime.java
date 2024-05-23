package esercizio;

public class DipendentiPartTime extends Dipendenti{
    protected int oreLavoro;

    public DipendentiPartTime (int matricola, int stipendio, Dipartimento dipartimento,int oreLavoro){
        super(matricola, stipendio, dipartimento);
        this.oreLavoro = oreLavoro;
    }

    public int getOreLavoro() {
        return oreLavoro;
    }

    public void setOreLavoro(int oreLavoro) {
        this.oreLavoro = oreLavoro;
    }

    @Override
    public void calculateSalary() {
       setStipendio( getOreLavoro()*7);
        System.out.println("stipendio mensile:"+ getStipendio());
    }
}
