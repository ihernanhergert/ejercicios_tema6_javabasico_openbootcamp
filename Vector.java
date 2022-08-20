public class Vector {

    public static void main(String[] args) {
        /************* Vector ***************/
        java.util.Vector<String> vector = new java.util.Vector();

        //Agregar datos del vector
        vector.add("Hola");
        vector.add("Mundo");
        vector.add("Soy");
        vector.add("Hernán");
        vector.add("xd");
        //Borrar 2do y 3er elemento.
        vector.remove(1);
        vector.remove(2);

        /* Problema De Utilizar Un Vector Con
        Capacidad Por Defecto(10) Es Que Cuendo
        Se "desborda" Se Copia El Array Y Se Vuelve
        A Crear Un Nuevo Array Con El Doble De Capacidad*/

        vector.add("Hola");

    }
}
