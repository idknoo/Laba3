package src.com.company;

interface MayShine {

    static enum ShineState {
        ON,
        OFF
    }
    
    void setState(ShineState state) throws MayShineException;
}
