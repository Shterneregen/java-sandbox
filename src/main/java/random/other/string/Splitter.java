package random.other.string;

public class Splitter {
    public static void main(String[] args) {

        String longString = "The aim of this proposal is to make suggestions about an organizing of a new Anarchy Zone.\n" +
                "\n" +
                "The layout of the space\n" +
                "I recommend to create a big open-space zone divided into smaller ones based on each zone purpose.\n" +
                "It could be game, music, relax, gym and chatting zones. \n" +
                "The biggest advantage of using big open-space zone is that people can get to know with each other.\n" +
                "There were several surveys that showed out employees have awkward feelings meeting new people in a working zone.\n" +
                "And the open-space layout could be useful to help with this issue, they will be able to meet a new people outside the working area.\n" +
                "\n" +
                "The items to have\n" +
                "I would recommend to have a range of musical instruments because many of our employees can play the instruments.\n" +
                "For game zone could be provided several PlayStations and XBoxes. A relax zone could contain many bean bags, carpets to lie and sofas.\n" +
                "\n" +
                "\n" +
                "The items not to have\n" +
                "All kitchen staff and food should be prohibited  is an Anarchy Zone (except coffee and drinks). \n" +
                "\n" +
                "Summary\n" +
                "Considering that our budget is limited, I would recommend make a game and gym zones more preferable.\n";

        String[] splittedString = longString.split(" ");
        System.out.println("String length is: " + splittedString.length);

        String[] email = {"user", "@", "gmail", ".com"};
        String str = String.join("", email);
        System.out.println("Email: " + str);
    }
}
