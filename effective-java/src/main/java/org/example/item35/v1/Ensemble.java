package org.example.item35.v1;

public enum Ensemble {
    SOLO, DUET, TRIO, QUARTET,
    QUINTET, SEXTET, SEPTET, OCTET,
    NONET, DECTET;

    public int numberOfMusicians() {
        return ordinal() + 1;
    }
}
