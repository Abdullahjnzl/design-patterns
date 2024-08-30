package creational.builder_pattern;

import lombok.Builder;

@Builder
public class House {
    private String foundation;
    private String walls;
    private String roof;
    private int floors;

    // Private constructor to enforce the use of Builder
    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.floors = builder.floors;
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", walls=" + walls + ", roof=" + roof + ", floors=" + floors + "]";
    }

    // Static nested Builder class
    public static class HouseBuilder {
        private String foundation;
        private String walls;
        private String roof;
        private int floors;

        public HouseBuilder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public HouseBuilder setWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
