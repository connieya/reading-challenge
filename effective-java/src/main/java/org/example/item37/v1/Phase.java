package org.example.item37.v1;

public enum Phase {

    SOLID , LIQUID , GAS;

    public enum Transition {
        MELT , FREEZE, BOIL , CONDENSE, SUBLIME , DEPOSIT;

        private static final Transition[][] TRANSITIONS = {
                {null, MELT , SUBLIME},
                {FREEZE , null , BOIL},
                {DEPOSIT , CONDENSE ,null}
        };

        // 한 상태에서 다른 상태로의 전이를 반환한다.
        public static Transition from(Phase from ,Phase to) {
            return TRANSITIONS[from.ordinal()][to.ordinal()];
        }
    }
}
