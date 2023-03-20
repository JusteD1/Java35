package OOP;

public class Book {

    //Fields
    public String title;
    public String author;
    private int numberOfPages;

    //Setter method for number of pages
    public void setNumberOfPages(int numberOfPages){
        if (isNumberOfPagesCorrect(numberOfPages)){
            this.numberOfPages = numberOfPages;
        }else {
            System.out.println("The provided number of pages is incorrect " + numberOfPages);
        }
    }

    //Check if there are more than 10 pages in the book
    private boolean isNumberOfPagesCorrect(int numberOfPages){
        return numberOfPages >= 10;
    }

    public void printBookInfo(){
        if(isNumberOfPagesCorrect(numberOfPages)){
            System.out.printf("The book %s with author %s has %d pages\n", title, author, numberOfPages);
        }else {
            System.out.println("Cannot print book info because number of pages are invalid");
        }

    }
}
