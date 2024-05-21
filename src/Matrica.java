public class Matrica {

    private int[][] array;

    public Matrica(int[][] array) {
        this.array = array;
    }

    public int[][] getArray() { return array; }
    public void setArray(int[][] array) { this.array = array; }

    public static void isvestiMatrica(Matrica matrica, String antraste){
        System.out.println(antraste);
        for(int i = 0; i < matrica.array.length; i++){
            for(int j = 0; j < matrica.array[i].length; j++){
                System.out.print(matrica.array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void transponuoti(Matrica matrica){
        int[][] temp = new int[matrica.array.length][matrica.array[0].length];
        for(int i = 0; i < matrica.array.length; i++){
            for(int j = 0; j < matrica.array[i].length; j++){
                temp[j][i] = matrica.array[i][j];
            }
        }
        matrica.setArray(temp);
    }

    public static int[][] sudeti(Matrica matrica1, Matrica matrica2){
        if(matrica1.array.length != matrica2.array.length || matrica1.array[0].length != matrica2.array[0].length) return null;
        int[][] temp = new int[matrica1.array.length][matrica1.array[0].length];
        for(int i = 0; i < matrica1.array.length; i++){
            for(int j = 0; j < matrica1.array[i].length; j++){
                temp[i][j] = matrica1.array[i][j] + matrica2.array[i][j];
            }
        }
        return temp;
    }

}
