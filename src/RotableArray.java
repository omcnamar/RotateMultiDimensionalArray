import java.util.ArrayList;
import java.util.Collections;

enum RotationDegree {
    Ninety, OneHundredEighty, TwoHundredSeventy
}

public class RotableArray<T> {

    private ArrayList<ArrayList<T>> list;

    public RotableArray(ArrayList<ArrayList<T>> list) {
        this.list = list;
    }

    public void rotate(RotationDegree degree) {
        switch (degree) {
            case Ninety:
                rotateNinety();
                break;
            case OneHundredEighty:
                rotateOneHundredEighty();
                break;
            case TwoHundredSeventy:
                rotateTwoHundredSeventy();
                break;
        }
    }

    private void rotateNinety() {
        if (list.size() == 0) {
            return;
        }
        ArrayList<ArrayList<T>> listTwo = new ArrayList<>();

        for (int i = 0; i < list.get(0).size(); i++) {
            ArrayList<T> inner = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                inner.add(null);
            }
            listTwo.add(inner);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {

                T item = list.get(i).get(j);
                int secondPosition = list.size() - 1 - i;

                listTwo.get(j).set(secondPosition, item);

            }
        }
        list = listTwo;
    }

    private void rotateOneHundredEighty() {
        rotateNinety();
        rotateNinety();
    }

    private void rotateTwoHundredSeventy() {
        rotateNinety();
        rotateNinety();
        rotateNinety();
    }

    public void print() {
        for (ArrayList<T> innerList : list){
            for (T item : innerList) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
