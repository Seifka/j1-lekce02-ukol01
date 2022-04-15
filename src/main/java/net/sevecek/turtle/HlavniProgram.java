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


        //nakresli 8uhelník//

        zofka.setLocation(150,50);

        nakresli8Uhelnik(zofka);
            }

    private void nakresli8Uhelnik(Turtle zofka) {
        zofka.turnRight(45);
        zofka.move(30);
        zofka.turnRight(-45);
        zofka.move(30);
        for(int i = 0; i < 6; i++)  {
            zofka.turnLeft(45);
            zofka.move(30);
        }


        //nakresliKolecko//
        zofka.setLocation(250,50);

        nakresliKolecko(zofka);
    }

    private void nakresliKolecko(Turtle zofka) {
        zofka.turnRight(0);
        zofka.move(2);
        zofka.turnRight(-45);
        zofka.move(5);
        for(int i = 0; i < 43; i++)  {
            zofka.turnLeft(8);
            zofka.move(5);
        }

        //nakresliSlunicko//
        zofka.setLocation(400,50);

            zofka.turnRight(0);
            zofka.move(2);
            zofka.turnRight(-45);
            zofka.move(5);
            for(int i = 0; i < 43; i++)  {
                zofka.turnLeft(8);
                zofka.move(5);
            }
            zofka.turnRight(90);
            zofka.move(20);
            zofka.penUp();
            zofka.move(-20);
            zofka.penDown();
            zofka.turnLeft(8);
            zofka.move(30);
          //  zofka.turnRight(90);
          //  zofka.move(20);


    }







}




