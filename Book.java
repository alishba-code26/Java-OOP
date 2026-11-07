class Book1{
    String title;
    String author;
    double price;
    
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
    public class Book{
        public static void main(String[] args){
            Book1 b1 = new Book1();
            Book1 b2 = new Book1();
            Book1 b3 = new Book1();
            
            b1.title = "Computer Science";
            b1.author = "john";
            b1.price = 1000;
            
            b2.title = "Calculus";
            b2.price = 2000;
            b2.author="xubair";
            
            b3.title = "DLD";
            b3.author = "waheed";
            b3.price = 2200;
            b1.display();
            b2.display();
            b3.display();
        }
    }

