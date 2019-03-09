import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListAndMap {
  public static void main( String[] args) throws Exception {
    Map<String, Integer> wordCounts;
    if(Math.random() < 0.5)
      wordCounts = new TreeMap<>();
    else
      wordCounts = new HashMap<>();

    Scanner input = new Scanner(new java.io.File("datafiles/en-sample.txt"));
    buildMap(input, wordCounts);
    input.close();

    List<String> winners;
    if (Math.random() < 0.5)
      winners = new ArrayList<>();
    else
      winners = new LinkedList<>();

    buildList(wordCounts, winners, 1000);
    java.util.Collections.sort(winners);
    System.out.println(winners);

    System.out.print("By the by, the word with the highest count is: "
      + theVeryBest(wordCounts));

    List<String> rares = new ArrayList<>();
    longTail(wordCounts, rares);
    System.out.println();
    System.out.println("The rarest words are: " + rares);

    Scanner kb = new Scanner(System.in);
    String word;
    do {
      System.out.print("\nEnter a word or ENTER to quit: ");
      word = kb.nextLine().toLowerCase();
      if (word.length() == 0)
        break;
      int count = wordCounts.getOrDefault(word, 0);
      System.out.println(word + ": " + count);
    } while (true);
  }

  public static void buildMap(Scanner source, Map<String, Integer> map){
    while(source.hasNext()){
      String s = source.next().toLowerCase();
      if (!map.containsKey(s)){
        map.put(s, 1);
      }
      else {
        int current = map.get(s);
        map.replace(s, current + 1);
      }
    }
  }

  public static void buildList(Map<String, Integer> map,
    List<String> list, int cutoff) {
      for (String key : map.keySet())
        if (map.get(key) > cutoff)
          list.add(key);
  }

  public static String theVeryBest(Map<String, Integer> map){
    int max = Integer.MIN_VALUE;
    String best = "";
    for(String key: map.keySet()){
      if(map.get(key) > max){
        max = map.get(key);
        best = key;
      }
    }
    return best;
  }

  public static void longTail(Map<String, Integer> map, List <String> list){
    // also map.values() to just iterate over the values
    for(String key : map.keySet()){
      if(map.get(key) == 1)
        list.add(key);
    }
    // how to iterate over the map with both key and value
    // for(Map.Entry<String, Integer> entry: map.entrySet()){
    //   if(entry.getValue() == 1)
    //     list.add(entry.getKey());
    // }
  }
}