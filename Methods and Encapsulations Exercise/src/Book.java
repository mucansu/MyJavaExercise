public class Book {
       private String title;
       private String author;
       private int price;

        public void setTitle(String title) {
                this.title = title;
        }

        public void setAuthor(String author) {
                this.author = author;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        public String getTitle() {
                return title;
        }

        public String getAuthor() {
                return author;
        }

        public int getPrice() {
                return price;
        }
        public void printBookDetails(){
                System.out.println("Here are the details of the book : ");
                System.out.println("Title : " + title);
                System.out.println("Author : " + author);
                System.out.println("Price : " + price);
        }
}
