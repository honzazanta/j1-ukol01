package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    private Turtle zofka = new Turtle();

    public void start() {
        //this.nakresliCtverec();
        //this.nakresliNohy();
        //this.nakresliTrojúhelník();
        //zofka.turnRight(180);
        //zofka.move(150);
        //this.drawCircle();
        //this.drawSun();
        //this.drawOctagon();
    }

    private void nakresliCtverec() {
        //nakreslení těla a hlavy prásatka
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
        zofka.penUp();
    }

    public void nakresliNohy() {
        zofka.penDown();
        zofka.turnLeft(180);
        zofka.turnLeft(45);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);

        //přesunutí mezi nohami
        zofka.turnLeft(135);
        zofka.move(100);

        zofka.turnLeft(135);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.penUp();
    }

    public void nakresliTrojúhelník() {
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnRight(135);
        zofka.move(70);
        zofka.penUp();
    }

    public void drawCircle() {
        zofka.penDown();
        for (int j = 0; j < 360; j++) {
                zofka.turnLeft(1);
                zofka.move(1);
            }
        zofka.penUp();
    }

    public void drawSun() {
        zofka.penDown();
        for (int j = 0; j < 18; j++) {
            zofka.turnLeft(20);
            zofka.move(20);
            zofka.turnRight(90);
            zofka.move(20);
            zofka.turnRight(180);
            zofka.move(20);
            zofka.turnRight(90);
        }
        zofka.penUp();
    }
    public void drawOctagon() {
        zofka.penDown();
        for (int j = 0; j < 8; j++) {
            zofka.turnLeft(45);
            zofka.move(45);
        }
        zofka.penUp();
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }
}


