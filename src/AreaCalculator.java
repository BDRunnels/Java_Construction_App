public class AreaCalculator {
    private final HouseModel houseModel;

    public AreaCalculator(HouseModel houseModel) {
        this.houseModel = houseModel;
    }

    public double getFloorArea() {
        return  houseModel.getCurrentLength() *
                houseModel.getCurrentWidth();
    }

    public double getWallArea() {
        var width = houseModel.getCurrentWidth();
        var length = houseModel.getCurrentLength();
        var height = houseModel.getCurrentHeight();

        // x2 since we have 2 walls
        var northSouthWall = width * height * 2;
        var eastWestWall = length * height * 2;

        return northSouthWall + eastWestWall;
    }

    public double getCarportFloorArea() {
        return  houseModel.getCurrentCarportLength() * 
                houseModel.getCurrentCarportWidth();
    }

    public double getTotalArea() {
        return getFloorArea() + getCarportFloorArea();
    }
}
