package org.example.chapter02;

public class FlowController {

    // 필드 생략
    private String fileName;

    public void process() {
        FileDataReader reader = new FileDataReader(fileName);
        byte[] plainBytes = reader.read();

        ByteEncryptor encryptor = new ByteEncryptor();
        byte[] encryptedBytes = encryptor.encrypt(plainBytes);

        FileDataWriter writer = new FileDataWriter();
        writer.write(encryptedBytes);
    }
}
