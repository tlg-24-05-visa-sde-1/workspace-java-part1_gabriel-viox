// Create an "advanced" enum named VolumeLevel, with 5 volume presets: OFF, SOFT, MEDIUM, LOUD, MAX.
//  Each preset carries an int value which represents the actual volume value:
//   0, 25, 50, 75, 100, respectively
enum VolumePreset {
    OFF(0),
    SOFT(25),
    MEDIUM(50),
    LOUD(75),
    MAX(100);

    private Integer volume;

    VolumePreset(Integer volume) {
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }

    public String toString() {
        return volume.toString();
    }

}