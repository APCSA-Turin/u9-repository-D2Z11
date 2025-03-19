public class Test {
    public static void main(String[] args) {
        Window w = new Window(250);
        w.setSize(500);
        System.out.println(w.getSize());
        CanvasWindow c = new CanvasWindow(500);
        c.addImage();
        c.drawLine();
        ApplicationWindow a = new ApplicationWindow(1000);
        a.addButton();
        a.addText();
        a.setSize(250);
        System.out.println(a.getSize());
    }
}
