import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

/**
 * Created by anna on 12/10/15.
 */


public class NucleotideSequence {
    private List<Nucleotide> sequence;
    public static int SEQUENCESNUMBER = 0;

   /*
    * I am allowing empty sequences to be created
    */

    public NucleotideSequence(String sequenceString) {
        this.sequence = new ArrayList<Nucleotide>();
        for (Character nucleotideName: sequenceString.toCharArray()){
            try {
                this.sequence.add(new Nucleotide(nucleotideName));
            } catch (DataFormatException e) {
                System.out.println(e.getMessage() + ":" + nucleotideName);
            } finally {
                continue;
            }
        }
        SEQUENCESNUMBER += 1;
    }

    public List<Nucleotide> getSequence() {
        return sequence;
    }

    public void replaceNucleotideOnPosition(int position, Nucleotide nuc){
        this.sequence.set(position, nuc);
    }

    public int getSequenceLength() {
        return this.sequence.size();
    }

    @Override
    public String toString() {
        String sequenceString = "";
        for (Nucleotide nuc: this.sequence){
            sequenceString += nuc.getNucleotideType();
        }
        return sequenceString.toString();
    }



    public static void main(String[] args) {
        System.out.println("Hello, World!");
        NucleotideSequence RNAsequence = new NucleotideSequence("auuguuagua");
        System.out.println(RNAsequence.toString());

    }


}
