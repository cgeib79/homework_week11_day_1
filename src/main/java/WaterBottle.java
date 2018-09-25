public class WaterBottle {
    private int initialVolume;
    private int currentVolume;
    private int sip;
    private int drink;
    private int fill;
    private int empty;

    public WaterBottle(int initialVolume, int sip, int drink, int currentVolume, int empty){
        this.initialVolume = initialVolume;
        this.currentVolume = currentVolume;
        this.sip = sip;
        this.drink = drink;
        this.fill = fill;
        this.empty = empty;
    }

    public int drink() {
        return initialVolume - sip;
    }

    public int getCurrentVolume() {
        return initialVolume - sip;
    }

    public int empty() {
        return currentVolume - currentVolume;
    }

    public int fill(){
        return currentVolume + (initialVolume - currentVolume);
    }
}


