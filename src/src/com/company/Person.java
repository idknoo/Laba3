package src.com.company;

abstract class Person implements ThingName {

    void tell(String text, VoiceType voiceType) {
        System.out.println(getName() + " " + voiceType.text() + ": " + "\"" + text + "\"");
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
}