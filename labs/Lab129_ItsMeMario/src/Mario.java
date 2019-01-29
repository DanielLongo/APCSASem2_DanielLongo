public class Mario extends Character {
    public Mario(String catchphrase, int speed) {
        setCatchphrase (catchphrase);
        setSpeed (speed);
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed (speed * 2);
    }
}
