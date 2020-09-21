package human;

public class Leg {
    private int size;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "size=" + size +
                '}';
    }
}
