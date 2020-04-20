
public class namedtagText {
    public static void main(String args[])
    {
        namedtagText nt = new namedtagText();
        String name = "Tintin";
        String output = nt.namedtagtext(name);
        System.out.println(output);
    }
    public String namedtagtext(String name)
    {
        return "My name is "+name;
    }

}