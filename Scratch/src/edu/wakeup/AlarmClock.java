package edu.wakeup;

/*
 * Class definition to model the workings of an Alarm Clock
 * sometimes this is called a "business" class, "application" class, or "system" class
 * It has no Main Method - classes like these don't
 */
class AlarmClock {
    //properties or attributes - called "fields" or "instance variables"
    // private fields are sensitive like me :)
    // static = "shared", all AlarmClocks have this shared private attribute (rule)
    // final = "fixed", it's a constant
    public static final int MIN_INTERVAL = 1;   // static methods up here, "not" in a specific instance
    public static final int MAX_INTERVAL = 20;  // they cannot use instance variables or regular instance methods (because those live in the specific instances)

    // snoozeInterval is minutes between snooze
    private int snoozeInterval = 5;

    // constructors - like "methods" that get called when clients say "new"
    public AlarmClock() {
        //no-op
    }

    public AlarmClock(int snoozeInterval){
        setSnoozeInterval(snoozeInterval); // delegate to setter for validation/conversion
    }

    // functions or behaviors - called "methods" in Java
    public void snooze() {
        System.out.println("Snoozing "+ getSnoozeInterval() + " minutes ");
    }

    //"accessor" methods - provide "controlled access" to the object's fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }
    /*
     * implement a business data constraints - must be between 1-20 (inclusive)
    */
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) { // valid
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snoozeInterval: " + snoozeInterval
                    + ". Please set the value between" + MIN_INTERVAL + "and" + MAX_INTERVAL + ".");
        }
    }

    /*
     * Returns a string representation of the edu.wakeup.AlarmClock object. describing it in a sentence.
     * Generally includes a name of the class (its type) and the values of its field.
     */
    public String toString(){
        return "edu.wakeup.AlarmClock: snoozeInterval = " + getSnoozeInterval();
    }
}

//do we have a Java style guide?
// do we have a Java naming convention?