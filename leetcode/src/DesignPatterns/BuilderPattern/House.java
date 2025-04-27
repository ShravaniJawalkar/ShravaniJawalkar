public class House {

    private final int windows;
    private final int doors;
    private final boolean hasGarage;
    private final boolean hasGarden;
    private final int floors;
    private final String color;
    private final String roofType;
    private final String foundationType;
    private final boolean hasSwimmingPool;

    private House(Builder builder) {
        this.floors = builder.floors;
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.color = builder.color;
        this.roofType = builder.roofType;
        this.foundationType = builder.foundationType;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    public int getFloors() {
        return floors;
    }

    public String getColor() {
        return color;
    }

    public String getRoofType() {
        return roofType;
    }

    public String getFoundationType() {
        return foundationType;
    }

    public boolean hasSwimmingPool() {
        return hasSwimmingPool;
    }

    public static class Builder {

        private int windows;
        private int doors;
        private boolean hasGarage;
        private boolean hasGarden;
        private int floors;
        private String color;
        private String roofType;
        private String foundationType;
        private boolean hasSwimmingPool;

        public Builder windows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder doors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder roofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public Builder foundationType(String foundationType) {
            this.foundationType = foundationType;
            return this;
        }

        public Builder hasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}