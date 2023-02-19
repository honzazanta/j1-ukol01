 package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void nakresliPrasatko() {
        //nakreslení těla a hlavy prásatka
        Turtle zofka = new Turtle();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnLeft(45);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnLeft(135);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(120);
    }

    public void start() {
        Turtle zofka = new Turtle();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(120);
        zofka.turnLeft(45);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnLeft(135);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(120);

        //první noha prasátka
        zofka.turnRight(45);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);

        //přesunutí mezi nohami
        zofka.turnLeft(135);
        zofka.move(120);

        zofka.turnLeft(135);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
