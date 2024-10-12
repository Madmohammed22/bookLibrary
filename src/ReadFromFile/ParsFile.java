package ReadFromFile;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

interface Inter {

    public LinkedList <String> ISBN(String data);
    public LinkedList <String> Title(String data);
    public LinkedList <String> Author(String data);
    public LinkedList <String> Year(String data);
    public LinkedList <String> Genre(String data);
}

public class ParsFile extends ReadFromFile{

    public LinkedList<Map <String, Holder>> dataMap(){
        LinkedList<String> node = (LinkedList<String>) GrepData();
        LinkedList<Map<String, Holder>> buffer = new LinkedList<>();
        node = node.stream().skip(1).collect(Collectors.toCollection(LinkedList::new));
        for (String node1 : node) {
            splitEachNode(node1, buffer);
        }
        return buffer;
    }

    void splitEachNode(String data, LinkedList <Map <String, Holder>> buffer){
        // System.out.println("-> [ " + data + "]");
        String[] substr = data.split(",");
        // System.out.println(substr[0]);
        Holder hold = new Holder();
        LinkedList <String> ISBN = hold.ISBN(substr[0]);
        LinkedList <String> Title = hold.Title(substr[1]);
        LinkedList <String> Author = hold.Author(substr[2]);
        LinkedList <String> Year = hold.Year(substr[3]);
        LinkedList <String> Genre = hold.Genre(substr[4]);
        Map<String, Holder> map = new HashMap<>();
        System.out.println(Title);
        map.put("ISBN", hold);
        map.put("Title", hold);
        map.put("Author", hold);
        map.put("Year", hold);
        map.put("Genre", hold);
        // boolean check = map.containsKey("ISBN");
        // if (check)
        // {
        //     System.out.println(map.get("ISBN").ISBN(data));
        //     // System.out.println(hold.ISBN(data));
        // }
        // else
        //     System.out.println("NULL");
        buffer.add(map);
    }
}