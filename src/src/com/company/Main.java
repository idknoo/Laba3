package src.com.company;

public class Main {

    public static void main(String[] args) {
        Table table = new Table("Стол");
        // MayCreak wire = new Wire();
        MayCreak mayCreak = new MayCreak() {
            @Override
            public void creak() {
                System.out.println("Что-то скрежет");
            }
        };
        MayShine flashlight = new Flashlight();
        Carlson carlson = new Carlson(PersonNames.CARLSON.toString(), 29, mayCreak, flashlight);
        carlson.setAction("сидит");
        Kid kid = new Kid(PersonNames.KID.toString(), 5);
        kid.setAction("сидит");
        kid.setAction("теперь спит под " + table.getChangeName());
        table.setChangeName("стола");
        kid.setAction("вылезает из-под " + table.getChangeName());
        kid.setAction("бодрствует");
        carlson.makeSomeNoise();
        carlson.tell("Не бойся, малыш, все будет хорошо!", Person.VoiceType.NORMAL);

        Mummy mummy = new Mummy(PersonNames.MUMMY.toString(), 300);
        mummy.setAction("двигается");
        kid.setAction("испугался");
        mummy.tell("шшшш", Person.VoiceType.WHISPER);
        mummy.makeSomeNoise();
        mummy.tell("ААА", Person.VoiceType.SCREAM);
        mummy.tell("ААА", Person.VoiceType.SCREAM);

        carlson.turnOnLight();
        carlson.turnOnLight();
        carlson.turnOffLight();
        try {
            mummy.tell("Говорит", Person.VoiceType.NORMAL);
        } catch (Mummy.MummyVoiceException e) {
            System.out.println(e.getMessage());
        }
        mummy.tell("ААА", Person.VoiceType.SCREAM);
    }
}