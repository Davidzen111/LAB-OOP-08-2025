import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Library {
    private List<LibraryItem> items;
    private List<Member> members;
    private LibraryLogger logger;

    public Library() {
        items = new ArrayList<>();
        members = new ArrayList<>();
        logger = new LibraryLogger();
    }

    public String addItem(LibraryItem item) {
        items.add(item);
        logger.logActivity(String.format("Item \"%s\" berhasil ditambahkan", item.title));
        return String.format("\"%s\" berhasil ditambahkan", item.title);
    }


    public LibraryItem findItemById(int itemId) {
        return items.stream()
                .filter(item -> item.itemId == itemId)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Item dengan ID tersebut tidak ditemukan."));
    }

    public String getLibraryStatus() {
    StringBuilder sb = new StringBuilder();

        sb.append("+------+----------------------------------------------------+-----------+\n");
        sb.append("| ID   | Judul                                              | Status    |\n");
        sb.append("+------+----------------------------------------------------+-----------+\n");

        if (items == null || items.isEmpty()) {
            sb.append("|      Tidak ada data tersedia                              |\n");
        } else {
            for (LibraryItem item : items) {
                String status = item.isBorrowed ? "Dipinjam" : "Tersedia";

                String judul = item.title;
                if (judul.length() > 50) {
                    judul = judul.substring(0, 47) + "...";
                }

                sb.append(String.format("| %-4d | %-50s | %-9s |\n", item.itemId, judul, status));
            }
        }

        sb.append("+------+----------------------------------------------------+-----------+");

        return sb.toString();
    }



    public String getAllLogs() {
        String logs = logger.getLogs();
        return logs.isEmpty() ? "Tidak ada log aktivitas." : logs;
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public LibraryLogger getLogger() {
        return logger;
    }

    public List<Member> getMembers() {
        return members;
    }
}
