package exercicio01;

class SeriesMatematicas {
    public static int ElevadoA(int x, int y) {
        int resultado = 1;
        for(int i = 0; i < y; i++) {
            resultado *= x;
        }
        return resultado;
    }

}
