package org.example.chapter07.factory;

public class HardEnemyFactory extends EnemyFactory {
    @Override
    public Boss createBoss() {
        return new CloningAttackBoss();
    }

    @Override
    public SmallFlight createSmallFlight() {
        return new MissileSmallFlight();
    }

    @Override
    public Obstacle createObstacle() {
        return new BombObstacle();
    }
}
