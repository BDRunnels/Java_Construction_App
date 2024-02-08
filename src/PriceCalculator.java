import java.math.BigDecimal;

public class PriceCalculator {
    private final PriceDefinition priceDefinition;
    private final AreaCalculator areaCalculator;

    public PriceCalculator(AreaCalculator areaC, PriceDefinition priceD) {
        this.areaCalculator = areaC;
        this.priceDefinition = priceD;
    }

    public BigDecimal getFloorPrice() {
        var area = BigDecimal.valueOf(areaCalculator.getFloorArea());
        return area.multiply(priceDefinition.getFloorPrice());
    }

    public BigDecimal getWallPrice() {
        var area = BigDecimal.valueOf(areaCalculator.getWallArea());
        return area.multiply(priceDefinition.getWallPrice());
    }

    public BigDecimal getCarportPrice() {
        var area = BigDecimal.valueOf(areaCalculator.getCarportFloorArea());
        return area.multiply(priceDefinition.getCarportPrice());
    }

    public BigDecimal getTotalPrice() {
        return getFloorPrice().add(getWallPrice()).add(getCarportPrice());
    }
}
