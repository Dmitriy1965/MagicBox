public class Main {
    public static void main(String[] args) {
        MagicBox <String>  strMagicBox = new MagicBox(3);
        MagicBox <Integer> intMagicBox = new MagicBox(3);

        strMagicBox.add("1");
        strMagicBox.add("2");
        strMagicBox.add("3");

        strMagicBox.pick();

        intMagicBox.add(11);
        intMagicBox.add(222);
        intMagicBox.add(3333);

        intMagicBox.pick();

        System.out.println(intMagicBox.pick());
        System.out.println(strMagicBox.pick());

    }
}