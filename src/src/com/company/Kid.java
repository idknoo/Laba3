package src.com.company;

import java.util.Objects;

class Kid extends Person {

    Kid(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Kid kid = (Kid) obj;
        return getName().equals(kid.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }

    @Override
    public String toString() {
        return getName();
    }
}