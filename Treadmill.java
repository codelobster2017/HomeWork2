public class Treadmill implements Obstruction{
    private int speed;

    public Treadmill(int speed) {
        this.speed = speed;
    }

    @Override
    public int getInfo() {
        return speed;
    }

    @Override
    public boolean obstruct(int max) {
        if (speed <= max){
           return true;
        }else {
            return false;
        }
    }


}
