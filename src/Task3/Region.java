package Task3;

public class Region {
    Area [] area;
    String regionCapital;

    public Region(Area[] area,String regionCapital) {
        this.area = area;
        this.regionCapital = regionCapital;
    }

    public String getRegionCapital() {
        return regionCapital;
    }
}
