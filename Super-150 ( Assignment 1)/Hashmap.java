import java.util.HashMap;
public class Hashmap{
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        //1). put method.
        hm.put(0,"Rishi1");
        hm.put(1,"Rishi2");
        hm.put(2,"Rishi3");
        hm.put(3,"Rishi4");
        hm.put(4,"Rishi5");

        //2). printing hashmap.
        System.out.println("HashMap = "+hm);

        //3). printing values of hashmap.
        System.out.println("HashMap Values " +hm.values());

        //4). printing keys of hashmap.
        System.out.println("HashMap Keys "+hm.keySet());

        //5). removing a key,value pair.
        hm.remove(0);
        System.out.println("HashMap After remover 0 key = "+hm);

        //6). getting a value . 
        System.out.println("Value of key 2 = "+hm.get(2));

        //7). size of hashmap
        System.out.println("Size of HashMap = "+hm.size());

        //8). check whether hashmap is empty or not.
        System.out.println("Checking hashmap empty or not =  "+hm.isEmpty());

        //9). making clone of hashmap.
        Object newhm = hm.clone();
        System.out.println("newhm clone of hashmap hm = " +newhm);

        //10).EntrySet give a view of key value pair in hashmap.
        System.out.println("view of new hashmap = "+hm.entrySet());

        //11).replace a value of a particular key .
        hm.replace(1,"rishi11");
        System.out.println("replacing rishi1 to rishi11 in hm = "+hm);

        //12). return true if key present in hm otherwise false.
        System.out.println("is key-3 in hm = "+hm.containsKey(3) + " ,is key-5 in hm = "+
        hm.containsKey(5));

        //13). return true if value present in hm otehrwise false.
        System.out.println("is rishi11 present in hm = "+hm.containsValue("rishi11")+
        " ,is rishi5 present in hm = "+hm.containsValue(newhm));

        //14).for each loop for key 
        System.out.print("key by for each loop of hm --> ");
        for(Integer i : hm.keySet())System.out.print(i+" ");

        //15).for each loop for values.
        System.out.print("\nvalues by for each loop of hm --> ");
        for(String i : hm.values()) System.out.print(i + " ");

    }
}