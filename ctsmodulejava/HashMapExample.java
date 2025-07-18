import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID and Name (type 'done' to stop):");
        while (true) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("done")) break;
            String[] parts = line.split(" ");
            if (parts.length==2)
                map.put(Integer.parseInt(parts[0]), parts[1]);
        }
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        System.out.println("Name: " + map.get(id));
        sc.close();
    }
}
