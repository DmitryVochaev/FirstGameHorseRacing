package HorseRacingGame;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {

      static Hippodrome game;

      private List<Horse> horses;

      public List<Horse> getHorses() {
          return horses;
      }

public Hippodrome(List<Horse> horses) {
          this.horses = horses;
}

    void run() throws InterruptedException {
        for (int i = 0; i < 100 ; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    void move() {
          for(Horse horse : horses) {
              horse.move();
          }
    }
    void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();

        }
    }

    public Horse getWinner() {
        Horse result = horses.get(0);
        for (Horse horse : horses) {
            if (horse.getDistance() > result.getDistance())
                result = horse;
        }
        return result;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }


    public static void main(String[] args) throws InterruptedException {

          ArrayList<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Pupsen",3,0));
        horses.add(new Horse("Vupsen",3,0));
        horses.add(new Horse("Luntic",3,0));

        game = new Hippodrome(horses);

        game.run();

       game.printWinner();
    }


    }

