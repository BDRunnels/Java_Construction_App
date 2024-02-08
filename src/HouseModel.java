public class HouseModel {
    private final double MIN_WIDTH = 2.4;
    private final double MIN_LENGTH = 2.4;
    private final double MIN_HEIGHT = 2.2;

    private final double MAX_WIDTH = 10.8;
    private final double MAX_LENGTH = 26.4;
    private final double MAX_HEIGHT = 4.7;

    private static final double MIN_CARPORT_WIDTH = 0;
    private static final double MAX_CARPORT_WIDTH = 7.2;
    
    private static final double MIN_CARPORT_LENGTH = 0;
    private static final double MAX_CARPORT_LENGTH = 7.2;

    private final HouseDimension width = new HouseDimension(MIN_WIDTH, MAX_WIDTH);
    private final HouseDimension length = new HouseDimension(MIN_LENGTH, MAX_LENGTH);
    private final HouseDimension height = new HouseDimension(MIN_HEIGHT, MAX_HEIGHT);
    private final HouseDimension carportWidth = new HouseDimension(MIN_CARPORT_WIDTH, MAX_CARPORT_WIDTH);
    private final HouseDimension carportLength = new HouseDimension(MIN_CARPORT_LENGTH, MAX_CARPORT_LENGTH);

    public double getCurrentWidth() {
    return width.getCurrent();
    }

    public void setCurrentWidth(double current) {
        width.setCurrent(current);
    }

    public double getCurrentLength() {
        return length.getCurrent();
    }

    public void setCurrentLength(double current) {
        length.setCurrent(current);
    }

    public double getCurrentHeight() {
        return height.getCurrent();
    }

    public void setCurrentHeight(double current) {
        height.setCurrent(current);
    }

    public double getCurrentCarportWidth() {
        return carportWidth.getCurrent();
    }
     
    public void setCurrentCarportWidth(double current) {
        carportWidth.setCurrent(current);
    }
     
    public double getCurrentCarportLength() {
        return carportLength.getCurrent();
    }
     
    public void setCurrentCarportLength(double current) {
        carportLength.setCurrent(current);
    }
}
