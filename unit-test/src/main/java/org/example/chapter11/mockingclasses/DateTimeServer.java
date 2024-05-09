package org.example.chapter11.mockingclasses;

import java.time.LocalDateTime;

public class DateTimeServer implements IDateTimeServer{
    @Override
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
