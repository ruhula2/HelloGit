public class ReplaceSpaceRunner {
    private String name;

    ReplaceSpaceRunner(){
        name = "I Am Ruhul";
    }

    public String spaceRemover(){
        return name.replace(" ", "");
    }
}
