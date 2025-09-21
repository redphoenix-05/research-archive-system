public class FullResearchPaper implements Researchpaper {
    private String title;
    private String author;

    public FullResearchPaper(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void view() {
        System.out.println("Viewing full research paper:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
