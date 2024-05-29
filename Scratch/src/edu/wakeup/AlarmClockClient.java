package edu.wakeup;

/*
 * Client-side "main class"(class definition with the main() method)
 * It will create a few instances of edu.wakeup.AlarmClock, and give them a basic test-drive
 */
class AlarmClockClient {
    public static void main(String[] args) {
        //create an edu.wakeup.AlarmClock object and set its properties - must use public setters now
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        // create a second instance and set its properties
        AlarmClock clock2 = new AlarmClock();
        clock2.setSnoozeInterval(10);

        // create a third instance, but don't set its properties
        AlarmClock clock3 = new AlarmClock();

        //make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        //see their toString() methods in action
        System.out.println(clock1.toString());
        System.out.println(clock2);
        System.out.println(clock3.toString());
    }



}