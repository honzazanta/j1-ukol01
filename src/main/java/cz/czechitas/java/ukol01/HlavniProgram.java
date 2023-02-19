package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    private Turtle zofka = new Turtle();

    public void start() {
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnRight(180);

        this.nakresliCtverec();
        this.nakresliNohy();
        zofka.turnLeft(135);
        this.nakresliTrojúhelník();

        zofka.turnRight(45);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(90);

        this.nakresliCtverec();
        zofka.turnRight(270);
        zofka.move(100);
        this.nakresliTrojúhelník();

        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(100);

        zofka.turnRight(90);
        this.nakresliCtverec();
        zofka.turnRight(270);
        zofka.move(100);
        this.nakresliTrojúhelník();

        for (int i = 0; i < 4; i++) {
            zofka.turnRight(45);
            zofka.move(100);
            zofka.turnRight(90);
            zofka.move(250);
            zofka.turnRight(180);
            this.nakresliCtverec();
            zofka.turnRight(270);
            zofka.move(100);
            this.nakresliTrojúhelník();
        }
        zofka.turnRight(45);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(180);

        this.nakresliCtverec();
        zofka.turnRight(270);
        zofka.move(100);
        this.nakresliTrojúhelník();

        zofka.turnRight(180);
        zofka.move(400);

        this.drawSun();
        zofka.turnLeft(135);
        zofka.move(650);
        zofka.turnRight(180);
        zofka.penDown();

        this.nakresliH();
        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(100);
        this.drawCircle();
        zofka.penUp();
        zofka.move(80);
        zofka.turnLeft(90);
        zofka.penDown();
        this.nakresliN();
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.penDown();
        this.nakresliZ();
        zofka.penUp();
        zofka.move(50);
        zofka.penDown();
        zofka.turnLeft(90);
        this.nakresliA();


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
        zofka.turnRight(45);
        zofka.move(70);
        zofka.turnRight(90);
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
    public void nakresliH() {
        zofka.move(100);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(65);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnRight(180);
    }

    public void nakresliN() {
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(140);
        zofka.turnLeft(135);
        zofka.move(100);
    }

    public void nakresliZ() {
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(150);
        zofka.turnLeft(135);
        zofka.move(100);
    }

    public void nakresliA() {
        zofka.turnRight(30);
        zofka.move(125);
        zofka.turnRight(120);
        zofka.move(125);
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnLeft(60);
        zofka.move(60);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }
}


