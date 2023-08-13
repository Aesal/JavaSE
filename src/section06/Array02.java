package section06;

public class Array02 {

    public static void main(String[] args) {

        String[] pokemon = new String[10];

        pokemon[0] = "피카츄";
        pokemon[1] = "라이츄";
        pokemon[2] = "파이리";
        pokemon[3] = "꼬북이";
        pokemon[4] = "버터플";
        pokemon[5] = "야도란";

        for (String str : pokemon) {
            System.out.println(str);
        }


    }

}
