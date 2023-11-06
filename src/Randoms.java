import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private int a;
    private int b;
    private List<Integer> numbers = new ArrayList<>();

    public Randoms(int a, int b) {
        //int randomNum = (int)(Math.random() * 11) + 90;

        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(a, b + 1);
            numbers.add(randomNumber);
            if (randomNumber == 100) {
                break;
            }
        }
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int next = 0;

            @Override
            public boolean hasNext() {
                if (next < numbers.size()) {
                    return true;
                }
                return false;
            }


            @Override
            public Integer next() {
                int num = numbers.get(next);
                next++;
                return num;
            }
        };
    }
}


//    protected Random random;
//
//    public Randoms(int min, int max) {
//        //...
//    }
//
//    @Override
//    public Iterator<Integer> iterator() {
//        return null;
//    }
//
//    @Override
//    public void forEach(Consumer<? super Integer> action) {
//        Iterable.super.forEach(action);
//    }
//
//    @Override
//    public Spliterator<Integer> spliterator() {
//        return Iterable.super.spliterator();
//    }
//
//    //...
