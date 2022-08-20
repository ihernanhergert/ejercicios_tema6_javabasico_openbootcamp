import java.util.LinkedList;

public class ArrayList {
    public static void main(String[] args) {
        /************* ArrayList  ***************/
        java.util.ArrayList<String> arraylist = new java.util.ArrayList<String>(4);

        arraylist.add("elemento1");
        arraylist.add("elemento2");
        arraylist.add("elemento3");
        arraylist.add("elemento4");

        /* Copiar ArrayList A LinkedList*/
        LinkedList<String> linkedList = new LinkedList<String>(arraylist);
        for (String elemento : linkedList){
            System.out.println(elemento);
        }
    }
}
