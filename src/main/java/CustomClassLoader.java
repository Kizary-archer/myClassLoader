import java.io.*;

public class CustomClassLoader extends ClassLoader {

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
        InputStream inputStream = new FileInputStream("D:\\Git_projects\\myClassLoader\\src\\main\\java\\ProductList.class");
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        int nextValue = 0;
        while ( (nextValue = inputStream.read()) != -1 ) {
            byteStream.write(nextValue);
        }
        return byteStream.toByteArray();
    }
}