package misc.test;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "29";
        int age = Integer.parseInt(ageInput); // takes "29" -> returns int 29
        Integer ageInteger = Integer.valueOf(ageInput); // returns an integer with 29 inside

        String populationInput = "8100000000";
        long population = Long.parseLong(populationInput); // returns primitive long
        Long populationLong = Long.valueOf(populationInput); // returns long object

        String sizeInput = "11.5";
        double size = Double.parseDouble(sizeInput); // returns primitive double
        Double sizeDouble = Double.valueOf(sizeInput); // returns double object

        String isSunnyInput = "true";
        boolean isSunny = Boolean.parseBoolean(isSunnyInput); // returns primitive boolean
        Boolean isSunnyBoolean = Boolean.valueOf(isSunnyInput); // returns boolean object
    }
}