package org.example.chapter07.factory;

public class Stage {
    private EnemyFactory enemyFactory;
    public Stage(int level) {
        enemyFactory = EnemyFactory.getFactory(level);
    }


}
