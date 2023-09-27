public class Wall implements Obstruction{
    private int height;


    public Wall(int max) {
        this.height = max;
    }

    @Override
    public boolean obstruct(int max) {
        if (height <= max){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int getInfo() {
        return height;
    }
}