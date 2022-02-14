import java.util.Iterator;
import java.util.NoSuchElementException;

    public class ArrayImpl implements Array {
        private Object[] array;

        private IteratorImpl iterator = new IteratorImpl();

        public ArrayImpl() {
            array = new Object[5];
        }

        private class IteratorImpl implements Iterator<Object> {
            private int count = 0;
            public boolean hasNext() {
                return count < array.length;
            }
            public Object next() {
                if (count >= array.length)
                    throw new NoSuchElementException();
                count++;
                return array[count - 1];
            }

            public void remove() {
                Object[] newArr;
                newArr = new Object[array.length - 1];
                for (int j = 0; j < (count - 1); j++) {
                    newArr[j] = array[j];
                }
                for (int j = (count - 1); j < array.length - 1; j++) {
                    newArr[j] = array[j + 1];
                }
                count = 0;
                array = newArr;
            }
        }

        public void add(Object element) {
            while (true) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == null) {
                        array[i] = element;
                        return;
                    }
                }
            }
        }

        public void set(int index, Object element) {
            array[index] = element;
        }
        public Object get(int index) {
            return array[index];
        }
        public int indexOf(Object element) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(element))
                    return i;
            }
            return -1;
        }

        public void remove(int index) {
            Object[] newArr;
            newArr = new Object[array.length - 1];
            for (int j = 0; j < index; j++) {
                newArr[j] = array[j];
            }
            for (int j = index; j < array.length - 1; j++) {
                newArr[j] = array[j + 1];
            }
            array = newArr;
        }

        public void clear() {
            array = null;
        }

        public int size() {
            return array.length;
        }

        public Iterator<Object> iterator() {
            return iterator;
        }

        public String toString() {
            return Array.toString(array);
        }

 }
