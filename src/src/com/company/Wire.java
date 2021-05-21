package src.com.company;

class Wire implements MayCreak, ThingName {

    @Override
    public String getName() {
        return "Проволока";
    }

    @Override
    public void creak() {
        System.out.println(getName() + " заскрежетала");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Wire wire = (Wire) obj;
        return getName().equals(wire.getName());
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}