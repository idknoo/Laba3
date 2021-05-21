package src.com.company;

public class Main {

    public static void main(String[] args) {
        MayCreak wire = new Wire();
        MayCreak mayCreak = new MayCreak() {
            @Override
            public void creak() {
                System.out.println("Что-то скрежет");
            }
        };
        MayShine flashlight = new Flashlight();
        Carlson carlson = new Carlson(mayCreak, flashlight);
        carlson.seat();
        // Kid kid = new Kid();
        class LocalKid extends Person implements Scare {

            @Override
            public String getName() {
                return "Малыш";
            }

            @Override
            public void getScared() {
                System.out.println(getName() + " испугался");
            }
        }
        LocalKid kid = new LocalKid();
        kid.seat();

        kid.fallAsleep();
        carlson.makeSomeNoise();
        kid.wakeUp();
        kid.getScared();
        carlson.tell("Не бойся, малыш, все будет хорошо!", VoiceType.NORMAL);

        Mummy mummy = new Mummy();
        mummy.move();
        kid.getScared();
        mummy.tell("шшшш", VoiceType.WHISPER);
        mummy.makeSomeNoise();
        mummy.tell("ААА", VoiceType.SCREAM);
        mummy.tell("ААА", VoiceType.SCREAM);

        carlson.turnOnLight();
        carlson.turnOnLight();
        carlson.turnOffLight();
        try {
            mummy.tell("Говорит", VoiceType.NORMAL);
        } catch(Mummy.MummyVoiceException e) {
            System.out.println(e.getMessage());
        }
        mummy.tell("ААА", VoiceType.SCREAM);
    }
}