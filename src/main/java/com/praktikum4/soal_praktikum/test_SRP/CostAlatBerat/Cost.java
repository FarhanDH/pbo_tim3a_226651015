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

    public static int getRentalCosts() {
        return rentalCosts;
    }

    public static int getFoodWages() {
        return foodWages;
    }

    public static int getTransportWages() {
        return transportWages;
    }

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
