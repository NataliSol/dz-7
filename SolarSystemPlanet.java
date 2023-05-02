public enum SolarSystemPlanet {
    MERCURY(1, 0, 57.91, 2439.7, null, "VENUS"),
    VENUS(2, 108.2, 108.2 + 57.91, 6051.8, MERCURY, "EARTH"),
    EARTH(3, 149.6 - 108.2, 149.6, 6371.0, VENUS, "MARS"),
    MARS(4, 227.9 - 149.6, 227.9, 3389.5, EARTH, "JUPITER"),
    JUPITER(5, 778.3 - 227.9, 778.3, 69911, MARS, "SATURN"),
    SATURN(6, 1429.4 - 778.3, 1429.4, 58232, JUPITER, "URANUS"),
    URANUS(7, 2870.9 - 1429.4, 2870.9, 25362, SATURN, "NEPTUNE"),
    NEPTUNE(8, 4498.3 - 2870.9, 4498.3, 24622, URANUS, null);

    private final int positionFromSun;
    private final double distanceFromPreviousPlanet;
    private final double distanceFromSun;
    private final double radius;
    private final SolarSystemPlanet previousPlanet;
    private final String nextPlanet;

    SolarSystemPlanet(int positionFromSun, double distanceFromPreviousPlanet,
                      double distanceFromSun, double radius, SolarSystemPlanet previousPlanet,
                      String nextPlanet) {
        this.positionFromSun = positionFromSun;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.distanceFromSun = distanceFromSun;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;
    }

    public int getPositionFromSun() {
        return positionFromSun;
    }

    public double getDistanceFromPreviousPlanet() {
        return distanceFromPreviousPlanet;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getRadius() {
        return radius;
    }

    public SolarSystemPlanet getPreviousPlanet() {
        return previousPlanet;
    }

    public String getNextPlanet() {
        return nextPlanet;
    }
}
