import java.util.Iterator;
import java.util.NoSuchElementException;
public interface Container extends Iterable<Object> {

        void clear();
        int size();
        String toString();
        Iterator<Object> iterator();
}
