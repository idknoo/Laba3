package src.com.company;

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