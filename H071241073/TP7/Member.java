import java.util.ArrayList;
import java.util.List;

public class Member {
    public String name;
    public int memberId;
    private List<LibraryItem> borrowedItems;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedItems = new ArrayList<>();
    }

    public String borrow(LibraryItem item, int days) {
        if (item == null || item.isBorrowed) {
            throw new IllegalStateException("Item tidak tersedia untuk dipinjam.");
        }

        String borrowResult = item.borrowItem(days);
        borrowedItems.add(item);
        return borrowResult;
    }

    public String returnItem(LibraryItem item, int daysLate) {
        if (!borrowedItems.contains(item)) {
            return "Item tidak ditemukan dalam daftar pinjaman.";
        }

        item.returnItem();
        borrowedItems.remove(item);
        double fine = item.calculateFine(daysLate);
        return String.format("Item %s berhasil dikembalikan dengan denda: Rp %,d", item.title, (int) fine);
    }

    public void getBorrowedItems() {
        if (borrowedItems.isEmpty()) {
            System.out.println("Tidak ada item yang dipinjam.");
        } else {
            System.out.println("+------+----------------+");
            System.out.println("| ID   | Judul          |");
            System.out.println("+------+----------------+");
            for (LibraryItem item : borrowedItems) {
                System.out.printf("| %-4d | %-14s |\n", item.itemId, item.title);
            }
            System.out.println("+------+----------------+");
        }
    }
}
