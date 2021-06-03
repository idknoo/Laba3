package src.com.company;

public enum PersonNames {
    KID("Малыш"),
    CARLSON("Карлосон"),
    MUMMY("Мумия");


    private String name;

    PersonNames(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
