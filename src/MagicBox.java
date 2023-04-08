import java.util.Random;

public class MagicBox<T> {
    int nullSize = 0;
    T[] items;

    public MagicBox(int sizeBox) {
        items = (T[]) new Object[sizeBox];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }


    public T pick() {
        for (int i = 0; i < items.length; i++) {
       //     System.out.println(i + " " + items[i]);
            if (items[i] == null) {
                nullSize = items.length - i;
                throw new RuntimeException("осталось " + nullSize);
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}
