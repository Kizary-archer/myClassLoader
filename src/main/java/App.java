public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClassLoader myClassLoader = new MyClassLoader();
        myClassLoader.loadClass("ProductList");
    }
}
