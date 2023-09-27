public abstract class Animal {
    private String name;
    private int maxSpeed;
    private int maxJump;
    private boolean next;

    public Animal(String name, int maxSpeed, int maxJump) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxJump = maxJump;
        next = true;
    }

    public void run(Obstruction obstruction) {
        if (next) {
            if (obstruction.obstruct(maxSpeed)) {
                System.out.println("Ура, " + name + " пробежал");
            }else {
                next = false;
                System.out.println("Увы, " + name + " не смог пробежать");
            }
        }
    }

    public void run(Obstruction obstruction, String language) {
        if (next) {
            if (language.equals("Русский")) {
                if (obstruction.obstruct(maxSpeed)) {
                    System.out.println("Ура, " + name + " пробежал");
                }else {
                    next = false;
                    System.out.println("Увы, " + name + " не смог пробежать");
                }
            } else {
                if (obstruction.obstruct(maxSpeed)) {
                    System.out.println("WOW, " + name + " ran");
                }else {
                    next = false;
                    System.out.println("OMG, " + name + " couldn't run");
                }
            }
        }
    }

    public void jump(Obstruction obstruction) {
        if (next) {
            if (obstruction.obstruct(maxJump)) {
                System.out.println("Ура, " + name + " преодолел стену");
            } else {
                next = false;
                System.out.println("Увы, " + name + " не смог преодолеть стену");
            }
        }
    }

    public void jump(Obstruction obstruction, String language) {
        if (next) {
            if (language.equals("Русский")) {
                if (obstruction.obstruct(maxJump)) {
                    System.out.println("Ура, " + name + " преодолел стену");
                } else {
                    next = false;
                    System.out.println("Увы, " + name + " не смог преодолеть стену");
                }
            } else {
                if (obstruction.obstruct(maxJump)) {
                    System.out.println("Wow, " + name + " overcame the wall");
                } else {
                    next = false;
                    System.out.println("OMG, " + name + " couldn't get over the wall");
                }
            }
        }
    }

    public boolean getNext() {
        return next;
    }

}
