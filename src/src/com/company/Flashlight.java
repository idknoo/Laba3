package src.com.company;

import java.util.Objects;

class Flashlight implements MayShine, ThingName {

    private ShineState state = ShineState.OFF;

    @Override
    public String getName() {
        return "Фонарик";
    }

    @Override
    public void setState(ShineState state) throws MayShineException {
        if (this.state.equals(state)) {
            throw new MayShineException("Фонарик уже в этом состоянии");
        }
        this.state = state;
        switch (state) {
            case ON:
                System.out.println("Фонарик включен");
                break;
            case OFF:
                System.out.println("Фонарик выключен");
                break;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Flashlight) {
            return state.equals(((Flashlight) obj).state);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(state) + getName().hashCode();
    }

    @Override
    public String toString() {
        return getName();
    }
}