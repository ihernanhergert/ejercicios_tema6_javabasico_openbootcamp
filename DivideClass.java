public class DivideClass {

    public static void main(String[] args) {
        try{
           int resultado = DividePorCero(4,2);
           System.out.println(resultado);
        } catch (Exception e){
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo Del Codigo" + DividePorCero(4,2));
        }
    }
    static int DividePorCero(int numero1, int numero2) throws ArithmeticException{

        int resultado = 0;

        try {
            resultado = numero1 / numero2;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }

        return resultado;
    }
}
