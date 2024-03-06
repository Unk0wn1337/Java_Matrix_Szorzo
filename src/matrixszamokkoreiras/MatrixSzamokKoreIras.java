package matrixszamokkoreiras;

public class MatrixSzamokKoreIras {

    public static void main(String[] args) {
        final int MERET = 5;
        /* létrehozás: */
        int[][] tabla = new int[MERET + 1][MERET + 1];

        /* feltöltés: */
        for (int sor = 0; sor <= MERET; sor++) {
            for (int oszl = 0; oszl <= MERET; oszl++) {
                if (sor == oszl) {
                    tabla[sor][oszl] = sor + 1; 
                } else {
                    tabla[sor][oszl] = (sor + 1) * (oszl + 1); 
                }
            }
        }

        /* megjelenítés: */
        for (int i = 0; i <= MERET; i++) {
            for (int j = 0; j <= MERET; j++) {
                System.out.printf("%4d", tabla[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
