package recap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import polymorphism.Animal;

public class Main {

  public static void main(String[] args) {
    Set<Integer> ids = new HashSet<Integer>();

    ids.add(5);
    ids.add(5);
    ids.add(4);
   // System.out.println(ids.contains(3));

    Book b1 = new Book("java", "Safwan", 55);
    Book b2 = new Book("php", "Ahmad", 15);
    Book b4 = new Book("c#", "Kamal", 102.85);
    Book b3 = new Book("python", "Nour", 102.85);

    HashSet<Book> bookSet = new HashSet<>();

    bookSet.add(b1);
    bookSet.add(b1);
    bookSet.add(b2);
    bookSet.add(b2);
    bookSet.add(b3);
    bookSet.add(b3);
    bookSet.add(b1);

    //System.out.println(bookSet);
  /*  for (Book book:bookSet) {
      System.out.println(book.getTitle());
    }
*/
    TreeSet<Book> booTreeSet = new TreeSet<>();

    booTreeSet.add(b1);
    booTreeSet.add(b2);
    booTreeSet.add(b3);
    booTreeSet.add(b4);
 /* for (Book book:booTreeSet) {
      System.out.println(book.toString());
    }
    */
   Book object = new Book();
   object.setTitle(null);
   object.setAuthor("Candy");
   object.setPrice(0);
   // System.out.println(object.getTitle());

    HashMap<String, Book> bookMapByTitle = new HashMap<>();
    bookMapByTitle.put(b1.getTitle(), b1);
    bookMapByTitle.put(b2.getTitle(), b2);
    bookMapByTitle.put(b3.getTitle(), b3);
    bookMapByTitle.put(object.getTitle(), object);
  //   bookMapByTitle.put(null, b4); can not add two values with same key
    bookMapByTitle.put("Chocolate", object);

    // make sure we have a unique key
    String input = "php";
    for (String key: bookMapByTitle.keySet()) {
      if(key.equalsIgnoreCase(input)){
        System.out.println("The book with title: "+ input+" already exists !!!");
      }else{
        bookMapByTitle.put(b4.getTitle(), b4);
      }



    }



  }
}
