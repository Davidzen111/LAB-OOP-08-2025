public class Book extends LibraryItem {
    private String author;
    private static final int MAX_BORROW_DAYS = 14;
    private static final int DAILY_FINE = 10000;

    public Book(String title, int itemId, String author) {
        super(title, itemId);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return String.format("Buku: %s oleh %s, ID: %d", title, author, itemId);
    }

    @Override
    public String borrowItem(int days) {
        if (isBorrowed) {
            throw new IllegalArgumentException("Item sudah dipinjam dan belum dikembalikan.");
        }

        if (days > MAX_BORROW_DAYS) {
            throw new IllegalArgumentException("Maksimal peminjaman adalah 14 hari.");
        }

        isBorrowed = true;
        return String.format("Item %s berhasil dipinjam selama %d hari", title, days);
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * DAILY_FINE;
    }

    public void printBooks() {
        System.out.println(getDescription());
    }
}
