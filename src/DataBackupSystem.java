import java.util.*;

public class DataBackupSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> backups = new ArrayList<>();
    static int version = 1;

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n=== DATA BACKUP SYSTEM ===");
            System.out.println("1. Create New Backup");
            System.out.println("2. Restore from Binary");
            System.out.println("3. Restore from Compressed");
            System.out.println("4. Import from CSV");
            System.out.println("5. List All Versions");
            System.out.println("6. Cleanup Old Backups");
            System.out.println("7. Backup Statistics");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    createBackup();
                    break;

                case 2:
                    System.out.println("Restoring backup from binary file...");
                    break;

                case 3:
                    System.out.println("Restoring backup from compressed file...");
                    break;

                case 4:
                    System.out.println("Importing backup data from CSV...");
                    break;

                case 5:
                    listBackups();
                    break;

                case 6:
                    backups.clear();
                    System.out.println("Old backups cleaned successfully!");
                    break;

                case 7:
                    System.out.println("Total Backups: " + backups.size());
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void createBackup() {

        System.out.println("\n=== CREATE NEW BACKUP ===");

        System.out.print("Enter backup description: ");
        String desc = sc.nextLine();

        System.out.print("Enter key: ");
        String key = sc.nextLine();

        System.out.print("Enter value: ");
        String value = sc.nextLine();

        String backup = "Version " + version + " | " + desc + " | " + key + " | " + value;
        backups.add(backup);

        System.out.println("\nBackup created successfully!");
        System.out.println("Backup Version: " + version);

        version++;
    }

    static void listBackups() {

        System.out.println("\n=== BACKUP VERSIONS ===");

        if (backups.isEmpty()) {
            System.out.println("No backups found.");
        } else {
            for (String b : backups) {
                System.out.println(b);
            }
        }
    }
}