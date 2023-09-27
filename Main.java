import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Bot bot = new Bot("Робот", 15);
        Bot bot2 = new Bot("X Æ A-12", 20);
        Animal cat = new Cat("Барсик", 5, 2);
        Animal cat1 = new Cat("Рыжик", 10, 3);
        Animal human = new Human("Человек", 15, 2, "Русский");
        Animal human2 = new Human("Human", 15, 1, "English");


        Treadmill treadmill1 = new Treadmill(5);
        Treadmill treadmill2 = new Treadmill(10);
        Treadmill treadmill3 = new Treadmill(15);

        Wall wall1 = new Wall(1);
        Wall wall2 = new Wall(2);

        ArrayList<Obstruction> obstructions = new ArrayList<>();
        obstructions.add(treadmill1);
        obstructions.add(treadmill2);
        obstructions.add(treadmill3);
        obstructions.add(wall1);
        obstructions.add(wall2);

        for (Obstruction obstruction : obstructions) {
            if (obstruction instanceof Treadmill) {
                System.out.println("Преграда - беговая дорожка, скорость - " + obstruction.getInfo());
                bot.run(obstruction);
                bot2.run(obstruction);
                cat.run(obstruction);
                cat1.run(obstruction);
                human.run(obstruction);
                human2.run(obstruction);
                System.out.println();
            }else {
                System.out.println("Преграда - стена, высота - " + obstruction.getInfo());
                bot.jump(obstruction);
                bot2.jump(obstruction);
                cat.jump(obstruction);
                cat1.jump(obstruction);
                human.jump(obstruction);
                human2.jump(obstruction);
                System.out.println();
            }
        }

    }
}