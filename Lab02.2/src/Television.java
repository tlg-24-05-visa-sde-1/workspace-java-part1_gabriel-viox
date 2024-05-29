/*
 * application class to model the workings of a television set. No main() method
 */
class Television {
    //properties or attributes - called "instance  variables" or "fields"
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"SAMSUNG", "LG", "SONY", "TOSHIBA"};
    private String brand;
    private int volume;
    private DisplayType display;
    private static int instanceCount = 0;
    private boolean isMuted;
//    private int oldVolume;

    //instanceCount
    public static int getInstanceCount(){
//        boolean isConnected = verifyInternetConnection();
        return instanceCount;
    }

    //constructors
    public Television() {
        instanceCount++; // instanceCount = instanceCount + 1
    }

    public Television(String brand){
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    //functions or behaviors
//    public void turnOn(){
////        boolean isConnected = verifyInternetConnection();
//        System.out.println("Turning on your " + brand + " Television to volume " + volume );
//    }
//    public void turnOff(){
//        System.out.println("See you soon my friend!");
//    }

    public String getBrand() {
        return brand;
    }
    // "SAMSUNG", "LG", "SONY", "TOSHIBA"
    public void setBrand(String brand) {
        if(brand.equals("Samsung") || brand.equals("LG") || brand.equals("Sony") || brand.equals("Toshiba")){
            this.brand = brand;
        }
        else{
            System.out.println("Error: Invalid brand, supported values are Samsung, LG, Sony, and Toshiba");
        }
    }

    public int getVolume() {
        return volume;
    }


    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        }
        else{
            System.out.printf("Invalid volume: %s. Must be between %s and %s.", volume, MIN_VOLUME, MAX_VOLUME);
//            System.out.println("Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
        }
    }

//    private boolean verifyInternetConnection(){
//        return true;
//    }


    public static void setInstanceCount(int instanceCount) {
        Television.instanceCount = instanceCount;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted() {
        return isMuted;
    }

    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return String.format("Television : brand= %s, volume= %s, display=%s,",
                getBrand(),getVolume(),getDisplay());
//        return "brand: " + getBrand() + ", volume: " + getVolume() + ", display: " + getDisplay();
    }
}