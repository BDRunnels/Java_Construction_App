* House Building App *
  - Task:
   Even though we are still a couple of months from launch, our clients want us to add more features to the House Builder Application. First, the users want to see the price and area displayed on the user interface. Second, I need you to build the core part of the area and cost calculation features. Third, we need those features so users don't lose interest.
   When users open the application, we want to see the price and total house area displayed. So I need you to create the base structure for house dimensions. The dimensions are the following width, length, and height. Every measurement has some limitations, in other words, maximum and minimum. So the width has a minimum of 2.4 meters maximum of 10.8 meters. The length has a minimum of 2.4 meters maximum of 26.4 meters. The height has a minimum of 2.2 meters and a maximum of 4.7 meters.

    class HouseDimension:
        private final double min;
        private final double max;
        
        private double current;

        public HouseDimension (double min, double max) {
            this.min = min;
            this.max = max;

            current = min;
        }

        public double getCurrent() {
            return current;
        }

        public void setCurrent(double c) {
            if (c > max) {
                c = max;
            }
            if (c < min) {
                c = min;
            }

            this.current = c;
        }

    Define the House Model : 
    Write a class representing a house with the following dimensions, width, length, and height. A house needs to have constant minimum and maximum values for all measurements. These might change later, but for now they need to be constant values.

    The class also needs to have the ability to get and set all dimensions as decimal values. You can name the class HouseModel or any name you like, but it needs to represent a house.

    public class House {
        private final double MIN_WIDTH = 2.4;
        private final double MIN_LENGTH = 2.4;
        private final double MIN_HEIGHT = 2.2;

        private final double MAX_WIDTH = 2.4;
        private final double MAX_LENGTH = 26.4;
        private final double MAX_HEIGHT = 4.7;

        private final HouseDimension width = new HouseDimension(MIN_WIDTH, MAX_WIDTH);
        private final HouseDimension length = new HouseDimension(MIN_LENGTH, MAX_LENGTH);
        private final HouseDimension height = new HouseDimension(MIN_HEIGHT, MAX_HEIGHT);

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
    }

    Define Area calculator (length * width) ?
    public class AreaCalculator {
        private final HouseModel houseModel;

        public AreaCalculator(HouseModel houseModel) {
            this.houseModel = houseModel;
        }

        public double getFloorArea() {
            return  houseModel.getCurrentLength() *
                    houseModel.getCurrentWidth();
        }
    }

    You need to create a price calculator class. Calculate the price by multiplying the floor area by the floor price. For pricing, you need to write a class named PricingDefinition to hold the values of different prices. First, you need the floor price. The floor price cannot change once the class gets instantiated. After creating the PricingDefinition class, use it in the PriceCalculator class with the AreaCalculator class to calculate the floor price. The price needs to be of type BigDecimal, for maximum precision.

    public class PriceCalculator {
        private PriceDefinition priceDefinition;
        private AreaCalculator areaCalculator;

        public PriceCalculator(AreaCalc, PriceDef) {
            this.areaC = areaC;
            this.priceD = priceD;
        }

        public BigDecimal getFloorPrice() {
            var area = BigDecimal.valueOf(areaC.getFloorArea());
            return area.multiply(priceD.getFloorPrice());
        }
    }

    public class PriceDefinition {
        private final BigDecimal floorPrice;

        public PriceDefinition(BigDecimal floorPrice) {
            this.floorPrice = floorPrice;
        }

        public BigDecimal getFloorPrice() {
            return floorPrice;
        }
    }

    Improving Pricing and Area Calculation
    We need you to improve the pricing and area calculation to include walls. Follow the improvement steps below.

    PriceDefinition needs to contain the wall price.

    AreaCalculator needs a method to calculate the wall area (using four walls).

    The price calculator needs a method to calculate the wall price.


    Add Carport Functionality
    You need to improve the current code by adding a carport feature. A carport has a width and a length. The initial width is zero, the minimum is zero, and the maximum is 7.2 meters. The same goes for carport length. The price definition also needs another field for carport price per square meter.

    Improving Area and Price calculation with Carport
    You need to improve the area and price calculation for carports. Please complete the improvement steps below.

    The area calculator needs to calculate the carport floor area. A carport does not have walls.

    The area calculator needs to calculate the total area. Total is the sum of floor area and carport floor area.

    The price calculator needs to calculate carport price and total price. The total is the sum of carport, wall and floor price.
        