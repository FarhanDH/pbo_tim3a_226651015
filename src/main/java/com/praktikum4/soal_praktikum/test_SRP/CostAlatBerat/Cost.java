package com.praktikum4.soal_praktikum.test_SRP.CostAlatBerat;

public class Cost {
    private static String location = UserInput.getLocation();
    private static String unitType = UserInput.getUnitType();
    private static int hours = UserInput.getHours();
    private static int totalDays = UserInput.getTotalDays();
    private static int rentalCosts = 0;
    private static int foodWages = 0;
    private static int transportWages = 0;
    private static int bill = 0;

    /**
     * Retrieves the total number of days.
     *
     * @return the total number of days
     */
    public static int getTotalDays() {
        return totalDays;
    }

    /**
     * Retrieves the total number of hours.
     *
     * @return the total number of hours
     */
    public static int getTotalHours() {
        return hours;
    }

    /**
     * Retrieves the value of the rentalCosts attribute.
     *
     * @return the value of the rentalCosts attribute
     */
    public static int getRentalCosts() {
        return rentalCosts;
    }

    /**
     * Retrieves the value of the foodWages attribute.
     *
     * @return the value of the foodWages attribute
     */
    public static int getFoodWages() {
        return foodWages;
    }

    /**
     * Retrieves the value of the transportWages attribute.
     *
     * @return the value of the transportWages attribute
     */
    public static int getTransportWages() {
        return transportWages;
    }

    /**
     * Calculates the total bill for a Rental based on the location, unit type,
     * hours, and total days.
     *
     * @return the total bill for the Rental
     */
    public static int getTotalBill() {
        if (location.equals("samarinda")) {
            foodWages += 50000;
            transportWages += 25000;
            if (unitType.equals("excavator")) {
                rentalCosts += 235000;
            } else if (unitType.equals("vibro")) {
                rentalCosts += 215000;
            } else if (unitType.equals("dozer")) {
                rentalCosts += 275000;
            }
        } else if (location.equals("tenggarong")) {
            foodWages += 70000;
            transportWages += 50000;
            if (unitType.equals("excavator")) {
                rentalCosts += 255000;
            } else if (unitType.equals("vibro")) {
                rentalCosts += 235000;
            } else if (unitType.equals("dozer")) {
                rentalCosts += 295000;
            }
        } else {
            foodWages += 100000;
            transportWages += 70000;
            if (unitType.equals("excavator")) {
                rentalCosts += 285000;
            } else if (unitType.equals("vibro")) {
                rentalCosts += 265000;
            } else if (unitType.equals("dozer")) {
                rentalCosts += 345000;
            }
        }

        if (hours <= 200) {
            hours = 200;
        }

        bill = ((hours * rentalCosts) + (totalDays * (foodWages + transportWages)));
        return bill;
    }
}
