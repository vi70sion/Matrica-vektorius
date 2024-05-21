public class Main {
    public static void main(String[] args) {

//        Užduotis: Sukurkite programą, kuri atliks šias operacijas su matrica ir vektoriais:
//        Sukurkite klasę Matrica, kuri turės dvimatį masyvą ir metodus:
//        IsvestiMatrica - išvesti matricą į konsolę.
//                Transponuoti - grąžina transponuotą matricą.
//        Sudeti - sudeda dvi matricas.
//        Dauginti - daugina matricą iš vektoriaus.
//                Sukurkite klasę Vektorius, kuri turės vienmatį masyvą ir metodą:
//        IsvestiVektorius - išvesti vektorių į konsolę.


        Matrica matrica1 = new Matrica(new int[][]{
                {56, 21, 13, 74},
                {18, 106, 7, 81},
                {91, 10, 10, 12},
                {15, 39, 41, 75}
        });
        Matrica matrica2 = new Matrica(new int[][]{
                {16, 12, 73, 24},
                {48, 26, 17, 18},
                {15, 19, 49, 64},
                {78, 25, 68, 15}
        });

        Matrica.isvestiMatrica(matrica1, "Pirmą matrica: ");
        Matrica.isvestiMatrica(matrica2, "Antrą matrica: ");

        Matrica.transponuoti(matrica1);
        Matrica.isvestiMatrica(matrica1, "Transponuota pirma matrica:");

        Matrica.transponuoti(matrica2);
        Matrica.isvestiMatrica(matrica2, "Transponuota antra matrica:");

        Matrica matrica3 = new Matrica(Matrica.sudeti(matrica1, matrica2));
        if (matrica3.getArray() != null) Matrica.isvestiMatrica(matrica3, "Transponuotų matricų suma:");

        Vektorius vektorius = new Vektorius(new int[] {5, 14, 75, 39});
        Matrica.transponuoti(matrica1); //atverčiame matrica1 į pradinę (buvo transponuota)
        Matrica.isvestiMatrica(matrica1, "Pirma matrica: ");
        Vektorius.isvestiVektorius(vektorius, "Pradinis vektorius: ");
        Vektorius.dauginti(matrica1, vektorius);
        Vektorius.isvestiVektorius(vektorius, "Pirmos matricos ir vektoriaus sandauga: ");
    }

}