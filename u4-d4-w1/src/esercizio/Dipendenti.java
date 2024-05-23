package esercizio;

public  class Dipendenti {
private int matricola;
private int stipendio;
protected  Dipartimento dipartimento;

    public Dipendenti(int matricola, int stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;


    }

    public  int getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public Dipartimento setDipartimento(Dipartimento dipartimento) {
         return this.dipartimento = dipartimento;
    }
}


