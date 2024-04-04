
    import java.util.HashMap;

    public class Third_Que {
        public static void main(String[] args) {
            String str = "Hello world! This is a sample string. It contains some words.";


            String[] words = str.split("\\s+");


            HashMap<String, Integer> wordCountMap = new HashMap<>();


            for (String word : words) {

                word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

                if (!word.isEmpty()) {
                    if (wordCountMap.containsKey(word)) {
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    } else {
                        wordCountMap.put(word, 1);
                    }
                }
            }


            System.out.println("Word count:");
            for (String word : wordCountMap.keySet()) {
                System.out.println(word + ": " + wordCountMap.get(word));
            }
        }
    }

