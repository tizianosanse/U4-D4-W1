import esercizio.Dipartimento;
import esercizio.Dipendenti;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dipendenti JACOPO = new Dipendenti(123213,2000, Dipartimento.AMMINISTRAZIONE);
        Dipendenti GIOVA = new Dipendenti(753753,1600, Dipartimento.VENDITE);
        Dipendenti TOMMY = new Dipendenti(56780,1300, Dipartimento.PRODUZIONE);

        System.out.println(JACOPO.getMatricola());
        System.out.println(GIOVA.getMatricola());
        System.out.println(TOMMY.getMatricola());
        System.out.println(JACOPO.getStipendio());
        System.out.println(GIOVA.getStipendio());
        System.out.println(TOMMY.getStipendio());
        System.out.println(JACOPO.getDipartimento());
        System.out.println(GIOVA.getDipartimento());
        System.out.println(TOMMY.getDipartimento());
        System.out.println(JACOPO.setDipartimento(Dipartimento.PRODUZIONE));
        System.out.println(GIOVA.setDipartimento(Dipartimento.AMMINISTRAZIONE));
        System.out.println(TOMMY.setDipartimento(Dipartimento.VENDITE));
        Dipendenti[] dipendenti = {TOMMY,JACOPO,GIOVA};
        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println(dipendenti[i].getMatricola());
        }





}

    }
