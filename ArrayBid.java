public class ArrayBid {

    public static void main(String[] args) {
        String texto = "texto de ejemplo";
        int arrayBid[][] = new int[texto.length()][texto.length()];
        //int arrayBid[][] = new int[args.length][args.length];

        for (int i = 0; i < arrayBid.length; i++){
            for (int j = 0; j < arrayBid[i].length; j++){
                arrayBid[i][j] = j;
                System.out.println("posición fila " + i + " posición columna " + j + " valor " + arrayBid[i][j]);
            }
        }
    }
    /************* Array Bidimensional  ***************/

}
