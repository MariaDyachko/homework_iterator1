import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private int ai;
    private int bi;
    Random random = new Random();

    public Randoms(int a, int b) {
        ai = a;
        bi = b;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(ai, bi + 1);
            }
        };
    }
}