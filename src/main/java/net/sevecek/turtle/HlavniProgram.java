package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import javax.swing.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        zofka.setLocation(450,360);

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



    //2.část//
    //nakresli8Uhelnik//
  //     zofka.setLocation(100,100);

 //       nakresli8Uhelnik(zofka);
 //   }
 //   private void nakresli8Uhelnik(Turtle zofka) {
 //       zofka.turnRight(45);
 //       zofka.move(30);
  //      zofka.turnRight(-45);
  //      zofka.move(30);
 //      for(int i = 0; i < 6; i++)  {
 //           zofka.turnLeft(45);
//            zofka.move(30);
  //      }

 //  //nakresliKolecko//
  //     zofka.setLocation(250,100);

 //       nakresliKolecko(zofka);
  //  }
  //  private void nakresliKolecko(Turtle zofka) {
  //     zofka.turnRight(0);
  //      zofka.move(2);
 //       zofka.turnRight(-45);
  //      zofka.move(5);
  //     for(int i = 0; i < 43; i++)  {
  //         zofka.turnLeft(8);
 //           zofka.move(5);
 //       }



        //nakresliSlunicko//
        zofka.setLocation(100,80);
        zofka.turnRight(135);

        nakresliSlunicko(zofka);


    }
    private void nakresliSlunicko(Turtle zofka) {
        zofka.turnRight(90);
        zofka.move(20);
        zofka.penUp();
        zofka.move(-20);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(20);

        for (int i=0; i<11;i++) {
        zofka.turnRight(60);
        zofka.move(20);
        zofka.penUp();
        zofka.move(-20);
        zofka.penDown();
        zofka.turnLeft(90);
        zofka.move(20);
        }

        //3.část//
        //nakresliDomecek//

        zofka.setLocation(150,530);
        zofka.turnLeft(30);

        nakresliDomecek(zofka);

        zofka.setLocation(150,330);
        nakresliDomecek(zofka);

        zofka.setLocation(350,330);
        nakresliDomecek(zofka);

        zofka.setLocation(550,330);
        nakresliDomecek(zofka);

        zofka.setLocation(750,330);
        nakresliDomecek(zofka);

        zofka.setLocation(950,330);
        nakresliDomecek(zofka);

        zofka.setLocation(950,530);
        nakresliDomecek(zofka);

        //4.část//

        //pismenoK//
        zofka.setLocation(250,100);

        pismenoK(zofka);

        //pismenoA//

        zofka.setLocation(300,100);
        zofka.turnLeft(135);

        pismenoA(zofka);

        //pismenoT//

        zofka.setLocation(400,100);
        zofka.turnRight(90);

        pismenoT(zofka);

        zofka.setLocation(450,100);
        zofka.turnLeft(90);

        pismenoK(zofka);

        zofka.setLocation(500,100);
        zofka.turnLeft(135);

        pismenoA(zofka);

        zofka.setLocation(600,100);
        zofka.turnRight(90);






    }

    private void pismenoT(Turtle zofka) {
        zofka.move(80);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.move(-60);
    }

    private void pismenoA(Turtle zofka) {
        zofka.turnRight(20);
        zofka.move(85);
        zofka.turnRight(140);
        zofka.move(85);
        zofka.penUp();
        zofka.move(-50);
        zofka.penDown();
        zofka.turnRight(110);
        zofka.move(25);
    }

    private void pismenoK(Turtle zofka) {
        zofka.move(80);
        zofka.penUp();
        zofka.move(-40);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(55);
        zofka.penUp();
        zofka.move(-55);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(55);
    }

    private void nakresliDomecek(Turtle zofka) {
        zofka.move(120);
        zofka.turnLeft(45);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnLeft(135);
        zofka.move(85);
        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(120);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(85);
        zofka.turnRight(90);
        zofka.move(120);










    }


    }





















