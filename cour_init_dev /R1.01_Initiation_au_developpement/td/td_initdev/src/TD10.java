import java.util.HashMap;

public class TD10 {
    public static void main (String[] args){
        if (args.length !=0 ) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }
            HashMap<String, Boolean> option  = new HashMap<>();
            option.put("-o", true);
            option.put("-v", false);
            option.put("--user", true);
            option.put("--database", false);
            exercice_2(args , option);
        }
    }
    public static void test_opt (String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].length() > 0 && args[i].charAt(0) == '-') {
                System.out.println(args[i]);
            }
        }
    }
    public static void exercice_2(String[] args , HashMap<String, Boolean> option) {

        // 2. On parcourt chaque argument passé au programme
        for (int i = 0; i < args.length; i++) {
            if (args[i].length() > 0 && args[i].charAt(0) == '-') {



                // 3. Pour chaque argument, on vérifie s'il correspond à une option de opts
                for (String j  : option.keySet()) {

                    if (args[i].equals(j) ){
                        System.out.println("Option trouvée : " + args[i]);
                        System.out.println(option.get(j));
                    }
                }
            }
        }
    }
}
