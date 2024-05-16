package springbook.user.ch15.ch3_5;

import java.io.BufferedReader;
import java.io.IOException;

public interface BufferedReaderCallback {

    Integer doSomethingWithReader(BufferedReader br) throws IOException;
}
