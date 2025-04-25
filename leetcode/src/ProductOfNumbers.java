import java.util.ArrayList;
import java.util.List;

class ProductOfNumbers {
    private List<Integer> stream;

    public ProductOfNumbers() {
        stream = new ArrayList<>();
        stream.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            stream.clear();
            stream.add(1);
        } else {
            int size = stream.size();
            int product = stream.get(size - 1) * num;
            stream.add(product);
        }

    }

    public int getProduct(int k) {
        int size = stream.size();
        if (k >= size)
            return 0;
        return stream.get(size - 1) / stream.get(size - 1 - k);
    }
}
