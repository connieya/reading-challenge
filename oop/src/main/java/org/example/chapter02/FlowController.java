package org.example.chapter02;

import org.example.chapter03.ByteSource;
import org.example.chapter03.ByteSourceFactory;

public class FlowController {

    private ByteSource byteSource;
    private boolean useFile;

    public FlowController() {
    }

    public FlowController(ByteSource byteSource) {
        this.byteSource = byteSource;
    }



    public FlowController(boolean useFile) {
        this.useFile = useFile;
    }

    // 필드 생략
    private String fileName;

    public void process() {
        ByteSource source = ByteSourceFactory.getInstance().create();

        byte[] data = source.read();

        FileDataReader reader = new FileDataReader(fileName);
        byte[] plainBytes = reader.read();

        ByteEncryptor encryptor = new ByteEncryptor();
        byte[] encryptedBytes = encryptor.encrypt(plainBytes);

        FileDataWriter writer = new FileDataWriter();
        writer.write(encryptedBytes);
    }
}
