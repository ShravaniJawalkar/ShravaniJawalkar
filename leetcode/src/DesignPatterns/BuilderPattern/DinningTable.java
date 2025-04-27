public class DinningTable {

    private final String material;
    private final int legs;
    private final String shape;
    private final String color;
    private final boolean extendable;
    private final boolean hasUmbrellaHole;
    private final String style;
    private final String size;
    private final int height;
    private final int width;
    private final int numberOfSeats;

    private DinningTable(Builder builder) {
        this.material = builder.material;
        this.legs = builder.legs;
        this.shape = builder.shape;
        this.color = builder.color;
        this.extendable = builder.extendable;
        this.hasUmbrellaHole = builder.hasUmbrellaHole;
        this.style = builder.style;
        this.size = builder.size;
        this.height = builder.height;
        this.width = builder.width;
        this.numberOfSeats = builder.numberOfSeats;
    }

    public String getMaterial() {
        return material;
    }

    public int getLegs() {
        return legs;
    }

    public String getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }

    public boolean isExtendable() {
        return extendable;
    }

    public boolean isHasUmbrellaHole() {
        return hasUmbrellaHole;
    }

    public String getStyle() {
        return style;
    }

    public String getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public static class Builder {
        private String material;
        private int legs;
        private String shape;
        private String color;
        private boolean extendable;
        private boolean hasUmbrellaHole;
        private String style;
        private String size;
        private int height;
        private int width;
        private int numberOfSeats;

        public Builder material(String material) {
            this.material = material;
            return this;
        }

        public Builder legs(int legs) {
            this.legs = legs;
            return this;
        }

        public Builder shape(String shape) {
            this.shape = shape;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder extendable(boolean extendable) {
            this.extendable = extendable;
            return this;
        }

        public Builder hasUmbrellaHole(boolean hasUmbrellaHole) {
            this.hasUmbrellaHole = hasUmbrellaHole;
            return this;
        }

        public Builder style(String style) {
            this.style = style;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder width(int width) {
            this.width = width;
            return this;
        }

        public Builder numberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public DinningTable build() {
            return new DinningTable(this);
        }
    }
}