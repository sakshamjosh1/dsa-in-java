class Details{

    String title;
    String author;
    float price;

    Details(String title, String author, float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void DisplayInfo() {
        System.out.println("The Book is : "+ title);
        System.out.println("It is written by : "+ author);
        System.out.println("Price is : "+ price);
        System.out.println();
    }
}


public class Books{
    public static void main(String[] args){
        Details book1 = new Details("Art of War", "Sun Tzu", 4.99f);
        Details book2 = new Details("Can't Hurt Me", "David Goggins", 6.99f);
        
        book1.DisplayInfo();
        book2.DisplayInfo();
    }
}