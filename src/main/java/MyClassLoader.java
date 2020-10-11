import java.io.*;

public class MyClassLoader extends ClassLoader {

    @Override
    public Class findClass(String name) throws ClassNotFoundException {
        byte[] b = new byte[0];
        try {
            b = loadClassFromFile(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassFromFile(String fileName) throws IOException {
        InputStream inputStream = new FileInputStream(fileName+".class");
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        int nextValue = 0;
        while ( (nextValue = inputStream.read()) != -1 ) {
            byteStream.write(nextValue);
        }
        return byteStream.toByteArray();
    }
}