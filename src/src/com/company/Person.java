package src.com.company;

abstract class Person implements ThingName {
    enum VoiceType {
        WHISPER,
        NORMAL,
        SCREAM;

        String text() {
            switch (this) {
                case WHISPER:
                    return "говорит шепотом";
                case NORMAL:
                    return "говорит";
                case SCREAM:
                    return "кричит";
            }
            return null;
        }
    }

    private String name;
    private int age;
    private String action;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void tell(String text, VoiceType voiceType) {
        System.out.println(getName() + " " + voiceType.text() + ": " + "\"" + text + "\"");
    }

    @Override
    public String getName() {
        return name;
    }

    void fallAsleep() {
        System.out.println(getName() + " теперь спит");
    }

    void wakeUp() {
        System.out.println(getName() + " теперь бодрствует");
    }

    void move() {
        System.out.println(getName() + " двигается");
    }

    void seat() {
        System.out.println(getName() + " сидит");
    }

    public void setAction(String action) {
        this.action = action;
        System.out.println(getName() + " " + action);
    }
}