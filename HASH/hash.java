package HASH;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class hash
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("aaa", 1);
        map.put("bbb", 2);
        map.put("ccc", 3);
        map.put("ddd", 4);

        System.out.println(map);
        for(Map.Entry<String, Integer> abc : map.entrySet())
        {
            System.out.println(abc);
        }
        System.out.println();

        Set<String> a= map.keySet();
        for(String b : a)
        {
            System.out.println(b + " " + map.get(b));
        }
    }
}