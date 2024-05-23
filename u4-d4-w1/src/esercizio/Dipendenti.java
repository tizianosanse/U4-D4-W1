package esercizio;

public abstract class Dipendenti {
private int matricola;
private int stipendio;
protected  Dipartimento dipartimento;

    public Dipendenti(int matricola, int stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;


    }
public abstract void calculateSalary();
    public  int getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public Dipartimento setDipartimento(Dipartimento dipartimento) {
         return this.dipartimento = dipartimento;
    }
}


