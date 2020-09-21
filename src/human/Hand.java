package human;

public class Hand {
    private int length;
    private int wide;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "lenght=" + length +
                ", wide=" + wide +
                '}';
    }
}
