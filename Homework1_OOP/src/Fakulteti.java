import java.util.Arrays;

public class Fakulteti {
    int ID;
    String Emri;
    String[] Drejtimet;
    public Fakulteti(int ID, String Emri, String[] Drejtimet){
         this.ID = ID;
         this.Emri = Emri;
         this.Drejtimet = Drejtimet;
    }

    String[] drejtimetNeFakultet(String fakulteti){
            if(this.Emri.equals(fakulteti)){
                return this.Drejtimet;
            }
            return  null;
    }

    void shtypDetajet(){
        System.out.printf("%s-%s-%s%n", this.ID,this.Emri,Arrays.toString(this.Drejtimet));
    }

    String gjetFakultetinNeBazeDrejtimit(String drejtimi){
       if(Arrays.stream(this.Drejtimet).anyMatch(drejtimi::contains)){
           return this.Emri;
       }
        return null;
    }
}
