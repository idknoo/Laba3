package src.com.company;

class Kid extends Person implements Scare {

    @Override
    public String getName() {
        return "Малыш";
    }

    @Override
    public void getScared() {
        System.out.println(getName() + " испугался");
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
        return getName().hashCode();
    }

    @Override
    public String toString() {
        return getName();
    }
}