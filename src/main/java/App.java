public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        customClassLoader.findClass("D:\\Git_projects\\myClassLoader\\src\\main\\java\\ProductList");
    }
}
