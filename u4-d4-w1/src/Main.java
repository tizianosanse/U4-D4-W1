import esercizio.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DipendentiPartTime JENNY = new DipendentiPartTime(132434,1000,Dipartimento.PRODUZIONE,80);
        DipendenteFullTime BRUNO = new DipendenteFullTime(222564,1500,Dipartimento.VENDITE);
        Dirigente JERRY = new Dirigente(342434,2000,Dipartimento.AMMINISTRAZIONE);
        DipendentiPartTime TOM = new DipendentiPartTime(672436,1000,Dipartimento.PRODUZIONE,85);
        DipendenteFullTime JHON = new DipendenteFullTime(232537,1500,Dipartimento.VENDITE);
        JENNY.calculateSalary();
        int stipendi = 0;
        Dipendenti[] arrDipen = {JHON,JENNY,JERRY,BRUNO,TOM};
        for (int i = 0; i < arrDipen.length ; i++) {

             stipendi = stipendi + arrDipen[i].getStipendio();
            System.out.println(stipendi);



        }


//        Dipendenti JACOPO = new Dipendenti(123213,2000, Dipartimento.AMMINISTRAZIONE);
//        Dipendenti GIOVA = new Dipendenti(753753,1600, Dipartimento.VENDITE);
//        Dipendenti TOMMY = new Dipendenti(56780,1300, Dipartimento.PRODUZIONE);
//
//        System.out.println(JACOPO.getMatricola());
//        System.out.println(GIOVA.getMatricola());
//        System.out.println(TOMMY.getMatricola());
//        System.out.println(JACOPO.getStipendio());
//        System.out.println(GIOVA.getStipendio());
//        System.out.println(TOMMY.getStipendio());
//        System.out.println(JACOPO.getDipartimento());
//        System.out.println(GIOVA.getDipartimento());
//        System.out.println(TOMMY.getDipartimento());
//        System.out.println(JACOPO.setDipartimento(Dipartimento.PRODUZIONE));
//        System.out.println(GIOVA.setDipartimento(Dipartimento.AMMINISTRAZIONE));
//        System.out.println(TOMMY.setDipartimento(Dipartimento.VENDITE));
//        Dipendenti[] dipendenti = {TOMMY,JACOPO,GIOVA};
//        for (int i = 0; i < dipendenti.length; i++) {
//            System.out.println(dipendenti[i].getMatricola());
//        }





}

    }
