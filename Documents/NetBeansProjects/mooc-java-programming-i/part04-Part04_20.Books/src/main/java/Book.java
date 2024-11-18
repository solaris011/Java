public class Book {
    private String title;
    private int pages;
    private int year;
    
    Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }
    
//    public String getTitle() {
//        return title;
//    }
//    
//    public int getPages() {
//        return pages;
//    }
//    
//    public int getYear() {
//        return year;
//    }
//    
//     @Override
//    public String toString() {
//        return this.title + ", " + this.pages + " pages, " + this.year;
//    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the pages
     */
    public int getPages() {
        return pages;
    }

    /**
     * @param pages the pages to set
     */
    public void setPages(int pages) {
        this.pages = pages;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    
}
