package lapsession6;

public class News {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;

    public News(){

    }

    public News(int ID,String Title, String PublishDate, String Author,String Content, float AverageRate){
        this.ID= ID;
        this.Title = Title;
        this.PublishDate = PublishDate;
        this.Author=Author;
        this.Content = Content;
        this.AverageRate = AverageRate;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void Display(){
        System.out.println("Title: "+getTitle());
        System.out.println("PublishDate: " +getPublishDate());
        System.out.println("Author:" +getAuthor());
        System.out.println("Content: " +getContent());
        System.out.println("AverageRate:" +getAverageRate());
    }

    public int[] RateList = new int[3];

    public double Calculate(){
        return (RateList[0] + RateList[1] +RateList[2])/3;

    }

}
