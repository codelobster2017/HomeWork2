public class Bot {
    private String name;
    private int maxSpeed;
    private boolean next;

    public Bot(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        next = true;
    }
    public void run(Obstruction obstruction) {
        if (next) {
            if (obstruction.obstruct(maxSpeed)) {
                System.out.println("Ура, " + name + " смог пробежать");
            } else {
                next = false;
                System.out.println("Увы, " + name + " не смог пробежать");
            }
        }
    }
    public void jump(Obstruction obstruction){
        if (next) {
            System.out.println("Робот не умеет прыгать");
            next = false;
        }
    }

    public boolean getNext() {
        return next;
    }
}
