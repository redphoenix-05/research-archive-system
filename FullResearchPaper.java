public class FullResearchPaper implements Researchpaper{
    private String title;
    private String author;

    FullResearchPaper(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public void view(){
        System.out.println("Loading PDF of");
        System.out.println("Title :" + title);
        System.out.println("author :" + author);
    }

}
