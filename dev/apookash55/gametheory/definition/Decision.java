package dev.apookash55.gametheory.definition;

/**
 * Decision.COOPERATE = 'C'<br>
 * Decision.DEFECT = 'D'
 */
public enum Decision {
    COOPERATE('C'),
    DEFECT('D');

    private final char value;

    Decision(char value) {
        this.value = value;
    }

    public char toChar() {
        return value;
    }
}
