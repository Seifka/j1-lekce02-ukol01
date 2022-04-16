package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import javax.swing.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.setLocation(450,350);

        //prasátko//


        nakresliPrasatko(zofka);
           }

    private void nakresliPrasatko(Turtle zofka) {
        zofka.turnLeft(135);
        zofka.move(71);
        zofka.turnLeft(90);
        zofka.move(71);

        zofka.turnLeft(45);
        zofka.move(180);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(180);
        zofka.turnLeft(90);
        zofka.move(100);

        //nozicky//
        zofka.turnRight(45);
        zofka.move(40);
        zofka.penUp();
        zofka.move(-40);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(40);

        zofka.penUp();
        zofka.move(-40);
        zofka.turnLeft(45);
        zofka.move(180);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(40);
        zofka.penUp();
        zofka.move(-40);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(40);






    }
















}




