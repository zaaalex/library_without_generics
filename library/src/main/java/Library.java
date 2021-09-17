import java.util.ArrayList;

public class Library {
    public void add (Object i){
        if (i instanceof Item)
        list.add((Item)i);
        System.out.println("[INFO] "+((Item)i).type +" add");
    }
    public void give(String author){
        System.out.println("[INFO] Search object with author " + author + " is started");
        boolean is_find=false;
       for (Object el:list){
            if (el instanceof Item) {
                if (((Item)el).author == author) {
                    is_find = true;
                    System.out.println("[INFO] Object with author " + author + " find!");
                    ((Item)el).print_info();
                }
            }
        }
        if (!is_find) System.out.println("The library doesn't have materials from author "+author);
        System.out.println("[INFO] Search object with author " + author + " is completed");
    }

    private ArrayList list = new ArrayList();
}
