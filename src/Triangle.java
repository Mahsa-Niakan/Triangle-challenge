public class Triangle {
    private final long firstSide, secondSide, thirdSide;
    private static final String EQUILATERAL = "EQUILATERAL";
    private static final String ISOSCELES = "ISOSCELES";
    private static final String SCALENE = "SCALENE";
    private static final String RIGHT = "RIGHT";

    //  Set Triangle Sides
    public Triangle(int sideA, int sideB, int sideC) {
        firstSide = sideA;
        secondSide = sideB;
        thirdSide = sideC;
    }

    // Sides Validation
    public static boolean sideValueIsValid(int sideValue) {
        return (sideValue > 0);
    }

    // Show Triangle Type
    public String printTriangleType() {
        String result = "";
        if (!canBuildTriangleWithGivenSides()) {
            return "You Can't Build A Triangle With Given Number!!!";
        }
        if (allSidesAreEqual()) {
            return EQUILATERAL;
        } else if (twoSidesAreEqual()) {
            if (isRight()) {
                return ISOSCELES + " And " + RIGHT;
            }
            return ISOSCELES;
        } else {
            if (isRight()) {
                return SCALENE + " And " + RIGHT;
            }
            return SCALENE;
        }
    }

    // Check Triangle Drawable
    public boolean canBuildTriangleWithGivenSides() {
        return (firstSide < (secondSide + thirdSide)) &&
                (secondSide < (firstSide + thirdSide)) &&
                (thirdSide < (firstSide + secondSide));
    }

    // AllSidesEqual Triangle Type Check
    public boolean allSidesAreEqual() {
        return (firstSide == secondSide) && (secondSide == thirdSide);
    }

    // TwoSidesEqual Triangle Type
    public boolean twoSidesAreEqual() {
        return (firstSide == secondSide) ||
                (secondSide == thirdSide) ||
                (thirdSide == firstSide);
    }

    // Right Triangle Type
    public boolean isRight() {
        Double ad = (double) firstSide;
        Double bd = (double) secondSide;
        Double cd = (double) thirdSide;

        double a2 = Math.pow(ad, 2);
        double b2 = Math.pow(bd, 2);
        double c2 = Math.pow(cd, 2);
        return (a2 + b2) == c2 ||
                (b2 + c2) == a2 ||
                (a2 + c2) == b2;
    }
}
