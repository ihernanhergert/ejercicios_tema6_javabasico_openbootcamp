import java.util.LinkedList;

public class linkedListINT {
    public static void main(String[] args) {
        /* ArrayList de INT */
        LinkedList<Integer> linkedListINT = new LinkedList<Integer>();

        for(int i = 0; i < 10; i++){
            linkedListINT.add(i + 1);
        }

        for(int i = 0; i < linkedListINT.size(); i++){
            boolean isOdd = linkedListINT.get(i) % 2 == 0;
            if ( isOdd ){
                linkedListINT.remove(i);
            }
        }

        for(int i = 0; i < linkedListINT.size(); i++){
            System.out.println(linkedListINT.get(i));
        }
    }
}
