package recap;

public class Book  implements Comparable<Book>{

  // Attributes
  private String title;
  private String author;
  private double price;


  public Book(String t, String a, double p) {
    this.title = t;
    this.author = a;
    this.price = p;
  }

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public Book() {}



  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * Returns:
   * a negative integer, zero, or a positive integer
   * as this object is less than, equal to, or greater
   * than the specified object.
   * */

  @Override
  public int compareTo(Book otherBook) {

    // return this.title.compareTo(otherBook.title);

    /*   if(this.title.compareTo(otherBook.title) > 0 ){
      return 1;
    }else if(this.title.equals(otherBook.title)){
      return 0;
    }else{
      return -1;
    }*/

   if(this.price < otherBook.price){
     return -1;
   }else if(this.price == otherBook.price){
     // return 0;
     return this.title.compareTo(otherBook.title);
   }else{
     return 1;
   }
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", price=" + price +
        '}';
  }
}
