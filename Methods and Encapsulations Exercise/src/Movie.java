public class Movie {
   private String title;
   private String MovieGenre;
   private int price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMovieGenre(String movieGenre) {
        MovieGenre = movieGenre;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getMovieGenre() {
        return MovieGenre;
    }

    public int getPrice() {
        return price;
    }
    public void printMovieDetails(){
        System.out.println("Here are the details of the movie : ");
        System.out.println("Title : " + title);
        System.out.println("Author : " +MovieGenre);
        System.out.println("Price : " + price);
    }
}
