package edu.wakeup;

/*
 * Main-Class focused on testing setter validation logic
 *
 * Do thorough BVT (Boundary Value Testing) on setSnoozeInterval
 * that is, we check the value on the edges of the valid range, and just outside it.
 * 0,1 and 20,21
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1); // should "stick," i.e., the value should be stored
        System.out.println(clock); // should show a 1 for snoozeInterval

        clock.setSnoozeInterval(17); // should "stick"
        System.out.println(clock); // should show a 17

        clock.setSnoozeInterval(0);  // error message, and value not set
        System.out.println(clock);     // should show a 17 , from before, last valid snooze interval

        clock.setSnoozeInterval(21);  // error message, and value not set
        System.out.println(clock);  // should show a 17 , from before, last valid snooze interval
    }

}