public class DVD extends LibraryItem {
    private int duration; // dalam menit
    private static final int MAX_BORROW_DAYS = 7;
    private static final int DAILY_FINE = 25000;

    // Constructor
    public DVD(String title, int itemId, int duration) {
        super(title, itemId);
        this.duration = duration;
    }

    // Implementasi method abstract getDescription
    @Override
    public String getDescription() {
        return String.format("DVD: \"%s\", durasi %d menit, ID: %d", title, duration, itemId);
    }

    // Implementasi method abstract borrowItem
    @Override
    public String borrowItem(int days) {
        if (isBorrowed) {
            throw new IllegalArgumentException("Item sudah dipinjam dan belum dikembalikan.");
        }

        if (days > MAX_BORROW_DAYS) {
            throw new IllegalArgumentException("Maksimal peminjaman untuk DVD adalah 7 hari.");
        }

        isBorrowed = true;
        return String.format("Item \"%s\" berhasil dipinjam selama %d hari", title, days);
    }

    // Implementasi method abstract calculateFine
    @Override
    public double calculateFine(int daysLate) {
        return daysLate * DAILY_FINE;
    }
}
