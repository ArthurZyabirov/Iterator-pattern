import java.util.Iterator;
import java.util.Random;

public class RandomsIterator implements Iterator<Integer> {
    Randoms obj;
    Random r = new Random();

    public RandomsIterator(Randoms integers) {
        this.obj = integers;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return r.nextInt(obj.high - obj.low + 1) + obj.low;
    }
}
