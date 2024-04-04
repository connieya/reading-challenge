package org.example.chapter05.liskov;

public class Main {

    public void increaseHeight(Rectangle rec) throws CantSupportSquareException {
        if (rec instanceof Square){
            throw new CantSupportSquareException();
        }

        if (rec.getHeight() <= rec.getHeight()){
            rec.setHeight(rec.getHeight() +10) ;
        }
    }
}
