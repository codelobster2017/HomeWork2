public class Human extends Animal {
    private String language;
    public Human(String name, int maxSpeed, int maxJump, String language) {
        super(name, maxSpeed, maxJump);
        this.language = language;
    }
    public void jump(Obstruction obstruction) {
       super.jump(obstruction, language);
    }
    public void run(Obstruction obstruction) {
        super.run(obstruction, language);
    }

}
