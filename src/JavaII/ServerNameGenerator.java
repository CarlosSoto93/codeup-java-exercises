package JavaII;

public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"Relieved", "Calm", "Maddening", "Bright", "Discreet", "Shy", "Salty", "Devilish", "Subdued", "Rapid"};

        String[] nouns = {"Armadillo", "Caterpillar", "Crab", "Ginseng", "Lilac", "Learning", "Mantle", "Megaliac", "Reminder", "Router"};


        System.out.println(randomElement(adjectives) + " " + randomElement(nouns));
    }

    public static String randomElement(String[] passedArray) {
        return passedArray[(int) (Math.random() * passedArray.length)];
    }


}
