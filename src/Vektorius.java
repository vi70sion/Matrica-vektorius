public class Vektorius {

    private int[] array;

    public Vektorius(int[] array) {
        this.array = array;
    }

    public int[] getArray() { return array; }
    public void setArray(int[] array) { this.array = array; }

    public static void dauginti(Matrica matrica, Vektorius vektorius){
        int[] temp = new int[matrica.getArray().length];
        for(int i = 0; i < matrica.getArray().length; i++){
            for(int j = 0; j < matrica.getArray()[0].length; j++){
                temp[i] += matrica.getArray()[j][i] * vektorius.array[i];
            }
        }
        vektorius.array = temp;
    }
    public static void isvestiVektorius(Vektorius vektorius, String antraste){
        System.out.println(antraste);
        for(int i = 0; i < vektorius.array.length; i++){
            System.out.print(vektorius.array[i] + " ");
        }
        System.out.println();
    }

}
