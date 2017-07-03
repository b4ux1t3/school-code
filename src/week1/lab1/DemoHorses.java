package week1.lab1;

/**
 * Created by Chris Pilcher on 7/2/2017.
 */
public class DemoHorses {
    public static void main(String args[]){
        Horse ebony = new Horse();
        ebony.setName("Ebony");
        ebony.setColor("Black");
        ebony.setBirthYear(2010);

        RaceHorse rocket = new RaceHorse();
        rocket.setName("Rocket");
        rocket.setColor("Roan");
        rocket.setBirthYear(2014);
        rocket.setRaces((byte) 7);

        announce(ebony);
        announce(rocket);
    }

    // announce takes either a Horse or a RaceHorse and prints its information.
    static void announce(Horse horse){
        System.out.printf("Next up, we have %s. %s is %s, and was born in %d.\n",
                horse.getName(),
                horse.getName(),
                horse.getColor(),
                horse.getBirthYear());
    }

    // When passed a RaceHorse, announce will call itself with the RaceHorse
    // cast to a Horse, and then go on to say how many races the horse has
    // participated in.
    static void announce(RaceHorse horse){
        announce((Horse) horse);
        System.out.printf("This is %s's %dth race. He has raced %d races previously in his career.",
                horse.getName(),
                horse.getRaces() + 1,
                horse.getRaces());
    }
}
