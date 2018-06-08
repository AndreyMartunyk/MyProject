package ObjectClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList cat = new ArrayList();
        cat.add(new Cat("Kaban", "red", 3));
        cat.add(new Cat("Musya", "brown", 1));
        cat.add(new Cat("Mur", "black", 3));
        cat.add(new Cat("Musya", "brown", 1));

        for (Object o : cat) {
            System.out.println(o.hashCode());
        }

    }
}