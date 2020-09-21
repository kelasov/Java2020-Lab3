package human;

public class Human {
    private Hand rightHand;
    private Hand leftHand;
    private Leg leftLeg;
    private Leg rightLeg;
    private Head head;

    public Human() {
        rightHand=new Hand();
        leftHand=new Hand();
        leftLeg=new Leg();
        rightLeg=new Leg();
        head=new Head();
    }

    @Override
    public String toString() {
        return "Human{" +
                "rightHand=" + rightHand +
                ", leftHand=" + leftHand +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                ", head=" + head +
                '}';
    }
}
