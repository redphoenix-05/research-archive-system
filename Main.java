public class Main {
    public static void main(String[] args) {
        Researchpaper paper1 = new FullResearchPaper("Title1", "Author1");
        Researchpaper paper2 = new View2("Title2", "Author2");

        paper1.view();
        paper2.view();
    }
}
