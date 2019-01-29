public class Character {
    private String catchphrase;
    private int speed;
    public Character(String catchphrase, int speed) {
        this.catchphrase = catchphrase;
        this.speed = speed;
    }
    public Character() {
        this.catchphrase = "I don't have a catchphrase";
        this.speed = 0;
    }

    public String getCatchphrase() {
        return catchphrase;
    }

    public void setCatchphrase(String catchphrase) {
        this.catchphrase = catchphrase;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
