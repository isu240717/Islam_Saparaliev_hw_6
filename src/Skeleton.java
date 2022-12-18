public class Skeleton extends Boss{

    private int NumberOfArrows;

    public int getNumberOfArrows() {
        return NumberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        NumberOfArrows = numberOfArrows;
    }
    public String PrintInfo() {
        return super.PrintInfo() + "\nArrows: " + NumberOfArrows;
    }
}
