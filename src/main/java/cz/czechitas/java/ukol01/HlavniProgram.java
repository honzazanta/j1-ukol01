package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        //pohyb Žofky do do pravé strany plátna
        Turtle zofka = new Turtle();

        //nakreslení těla a hlavy prásatka
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(45);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnLeft(135);
        zofka.move(100);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(90);

        // nohy prasátka
        zofka.move(150);
        zofka.turnRight(45);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(135);
        zofka.move(150);
        zofka.turnLeft(135);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(400);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
