package QueuePalindromes;

public class QueuePalindromeMain {
    public static void main (String[] args) {
        PalinList pl =  new PalinList ("one two three two one");
        System.out.println(pl + " is " + pl.isPalin());

        PalinList pl2 = new PalinList("one two three three two one");
        System.out.println(pl2 + " is " + pl2.isPalin());

        PalinList pl3 = new PalinList("one two three two one");
        System.out.println(pl3 + " is " + pl3.isPalin());

        PalinList pl4 = new PalinList("one two three four five");
        System.out.println(pl4 + " is " + pl4.isPalin());

        PalinList pl5 = new PalinList("one two three tuo one");
        System.out.println(pl5 + " is " + pl5.isPalin());
    }
}
