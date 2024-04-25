package org.example.item9;

import java.io.*;

public class Main {
    static final int BUFFER_SIZE = 4;
//    static String firstLineOfFile(String path) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader(path));
//        try {
//            return br.readLine();
//        }finally {
//            br.close();
//        }
//    }

    static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }

    }

    static String firstLineOfFile(String path, String defaultVal) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }

//    static void copy(String src, String dst) throws IOException {
//        InputStream in = new FileInputStream(src);
//        try {
//            OutputStream out = new FileOutputStream(dst);
//            try {
//
//                byte[] buf = new byte[BUFFER_SIZE];
//                int n;
//                while ((n = in.read(buf)) >= 0) {
//                    out.write(buf, 0, n);
//                }
//            } finally {
//                out.close();
//            }
//        } finally {
//            in.close();
//        }
//    }

    static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }

    }

}
