package src.com.company;

import java.sql.SQLOutput;
import java.util.Objects;

class Carlson extends Person implements Noise {

    private MayCreak mayCreak;
    private MayShine mayShine;

    public Carlson(MayCreak mayCreak,
                   MayShine mayShine) {
        this.mayCreak = mayCreak;
        this.mayShine = mayShine;
    }

    void turnOnLight() {
        try {
            mayShine.setState(MayShine.ShineState.ON);
            System.out.println(getName() + " светит чем-то");
        } catch (MayShineException e) {
            System.out.println(e.getMessage());
        }
    }

    void turnOffLight() {
        try {
            mayShine.setState(MayShine.ShineState.OFF);
            System.out.println(getName() + " перестал светить");
        } catch (MayShineException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getName() {
        return "Карлсон";
    }

    @Override
    public void makeSomeNoise() {
        mayCreak.creak();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carlson carlson = (Carlson) o;
        return Objects.equals(mayCreak, carlson.mayCreak) && Objects.equals(mayShine, carlson.mayShine);
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public String toString() {
        return getName();
    }
}