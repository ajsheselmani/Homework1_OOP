import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Fakulteti fk = new Fakulteti(1,"FIEK", new String[]{"Kompjuterik", "Automatike","Elektro"});

        System.out.println(Arrays.toString(fk.drejtimetNeFakultet("FIEK")));
        fk.shtypDetajet();
        System.out.println(fk.gjetFakultetinNeBazeDrejtimit("Kompjuterik"));
    }
}