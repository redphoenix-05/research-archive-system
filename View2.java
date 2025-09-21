public class View2 implements Researchpaper {
    private String title;
    private String author;

    public View2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void view() {
        System.out.println("Loading research paper when view is called:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
