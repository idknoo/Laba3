package src.com.company;

class Mummy extends Person implements Noise {

    class MummyVoiceException extends RuntimeException {
        public MummyVoiceException(String message) {
            super(message);
        }
    }

    @Override
    public String getName() {
        return "Мумия";
    }

    @Override
    public void makeSomeNoise() {
        System.out.println(getName() + " горохочет");
    }

    @Override
    void tell(String text, VoiceType voiceType) throws MummyVoiceException {
        if (voiceType.equals(VoiceType.NORMAL)){
            throw new MummyVoiceException("Мумия не может говорить нормальным голосом");
        }
        super.tell(text, voiceType);
    }
}
