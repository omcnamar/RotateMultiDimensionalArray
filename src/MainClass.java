import java.util.ArrayList;

public class MainClass {

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>() {
        {
            add( new ArrayList<>() {
                {
                    add(1);
                    add(2);
                    add(3);
                    add(4);
                }
            });
            add( new ArrayList<>() {
                {
                    add(5);
                    add(6);
                    add(7);
                    add(8);
                }
            });
            add( new ArrayList<>() {
                {
                    add(9);
                    add(10);
                    add(11);
                    add(12);
                }
            });
            add( new ArrayList<>() {
                {
                    add(13);
                    add(14);
                    add(15);
                    add(16);
                }
            });
        }
    };

    static ArrayList<ArrayList<String>> listOfStrings = new ArrayList<>() {
        {
            add( new ArrayList<>() {
                {
                    add("one");
                    add("two");
                    add("three");
                }
            });
            add( new ArrayList<>() {
                {
                    add("four");
                    add("five");
                    add("six");
                }
            });
            add( new ArrayList<>() {
                {
                    add("seven");
                    add("eight");
                    add("nine");
                }
            });
        }
    };

    public static void main(String[] args) {

        RotableArray<Integer> rotableArray = new RotableArray(list);
        rotateAndPrint(rotableArray);

        RotableArray<String> rotableArrayOfStrings = new RotableArray(listOfStrings);
        rotateAndPrint(rotableArrayOfStrings);
    }

    public static <T> void rotateAndPrint(RotableArray<T> rotableArray) {
        System.out.println("!!!!!!!!!!Original Array!!!!!!!!!!");
        rotableArray.print();

        rotableArray.rotate(RotationDegree.OneHundredEighty);

        System.out.println();
        System.out.println("!!!!!!!!!!Rotated Array!!!!!!!!!!");
        rotableArray.print();
        System.out.println();
    }


}
