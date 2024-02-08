public class HouseDimension {
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

        public void setCurrent(double current) {
            if (current < min) {
                current = min;
            }
            if (current > max) {
                current = max;
            }

            this.current = current;
        }

}
