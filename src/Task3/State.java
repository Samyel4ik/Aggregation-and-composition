package Task3;

public class State {
    Region[] region;
    String capital;
    int square;

    public State(Region[] region, String capital, int square) {
        this.region = region;
        this.capital = capital;
        this.square = square;
    }

    public void printCapital() {
        System.out.println(this.capital);
    }

    public void printRegion() {
        System.out.println(this.region.length);
    }

    public void printSquare() {
        System.out.println(this.square);
    }

    public void printCapitalRegion() {
        for (int i = 0; i < this.region.length; i++) {
            System.out.println(this.region[i].getRegionCapital());
        }
    }

}
