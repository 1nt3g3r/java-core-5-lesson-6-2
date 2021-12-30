import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IterableTests {
    public static void main(String[] args) {
        MyOwnIterable iterable = new MyOwnIterable(new String[] {
                "a", "b", "c"
        });

        for (String item : iterable) {
            System.out.println("item = " + item);
        }
    }

    private static class MyOwnIterable implements Iterable<String> {
        private String[] items;

        public MyOwnIterable(String[] items) {
            this.items = Arrays.copyOf(items, items.length);
        }

        @Override
        public Iterator<String> iterator() {
            return new Iterator<String>() {
                private int index;

                @Override
                public boolean hasNext() {
                    return index < items.length;
                }

                @Override
                public String next() {
                    return items[index++];
                }
            };
        }

        @Override
        public void forEach(Consumer<? super String> action) {
            Iterable.super.forEach(action);
        }

        @Override
        public Spliterator<String> spliterator() {
            return Iterable.super.spliterator();
        }
    }
}
