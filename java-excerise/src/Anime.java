import java.util.Arrays;

public class Anime {
  private String[] name;
  private String author;
  private int memberNo;

  private static int counter = 1;

  public Anime(String[] name, String author) {
    this.name = name;
    this.author = author;
    this.memberNo = counter++;
  }

  public String[] getName() {
    return this.name;
  }

  public String getAuthor() {
    return this.author;
  }

  public int getMemberNo() {
    return this.memberNo;
  }

  public void setName(String[] name) {
    this.name = name;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  // public void setMemberNo(int barcode){
  // this.memberNo = memberNo;
  // }

  public String toString() {
    return "Anime: " + Arrays.toString(this.name) //
        + ", Author: " + this.author //
        + ", Member ID: " + memberNo;
  }

  public boolean searchAnime(String n) {
    boolean result = false;
    for (int i = 0; i < this.name.length; i++) {
      if ((this.name[i]).equals(n)) {
        return true;
      }
    }
    return result;
  }



  public static void main(String[] args) {
    String[] name = new String[] {"One Piece", "My Hero Academia", "Gintama",
        "ONE PUNCH MAN"};

    Anime a = new Anime(name, "a");
    Anime b = new Anime(name, "b");
    System.out.println(a); //Anime: [One Piece, My Hero Academia, Gintama, ONE PUNCH MAN], Author: a, Member ID: 1
    System.out.println(b); //Anime: [One Piece, My Hero Academia, Gintama, ONE PUNCH MAN], Author: b, Member ID: 2
    System.out.println(a.searchAnime("One Piece")); //true

    b.setName(new String[] {"Hunter X Hunter", "One Piece", "Gintama"});     
    System.out.println(Arrays.toString(b.getName())); ////[Hunter X Hunter, One Piece, Gintama]
    System.out.println("Author : " + b.getAuthor()); //Author : b
    
    b.setAuthor("XYZ");
    System.out.println(b); //Anime: [Hunter X Hunter, One Piece, Gintama], Author: XYZ, Member ID: 2
    System.out.println(b.searchAnime("My Hero Academia")); //false

  }
}

