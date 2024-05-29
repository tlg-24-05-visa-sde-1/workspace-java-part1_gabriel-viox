/*
 * Main-class to create few instances of Television and give them a test drive.
 */
class TelevisionClient {
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances created");
        System.out.println();

        //create a Television object and set its properties
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(-10);
        tv1.setDisplay(DisplayType.LED);
//        System.out.println(Television.getInstanceCount() + " instances created");
        System.out.println(tv1);

        // create a 2 instance of an object and set its properties
        Television tv2 = new Television("Sony",Television.MIN_VOLUME);
        tv2.setBrand("Sony");
        tv2.setVolume(10);
        tv2.setDisplay(DisplayType.OLED);
//        System.out.println(Television.getInstanceCount() + " instances created");

        // create a 3rd instance, but do not set its properties
        Television tv3 = new Television("LG",Television.MAX_VOLUME);
        tv3.setBrand("LG");
        tv3.setVolume(100);
        tv3.setDisplay(DisplayType.PLASMA);
//        System.out.println(Television.getInstanceCount() + " instances created");

        //create a 4th instance, but do not set its properties
        Television tv4 = new Television();
        tv4.setBrand("Toshiba");
//        System.out.println(Television.getInstanceCount() + " instances created");

        Television tv5 = new Television("Toshiba",Television.MIN_VOLUME, DisplayType.PLASMA);
        System.out.println(tv5);

        // call some business methods on them
//        tv1.turnOn();
//        tv2.turnOn();
//        tv3.turnOn();
//        tv2.turnOff();
//        tv1.turnOff();
//        tv3.turnOff();
//        System.out.println(tv1);
//        System.out.println(tv2);
//        System.out.println(tv3);
//        System.out.println(Television.getInstanceCount() + " instances created");
    }
}