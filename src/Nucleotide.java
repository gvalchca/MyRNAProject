import java.util.zip.DataFormatException;

/**
 * Created by anna on 12/10/15.
 * Class containing
 */

public class Nucleotide {
    private String nucleotidePurineOrPyrimidine;
    private Character nucleotideType;           // nucleotide can be N, then it is unknown.

    public Nucleotide(Character nucleotideType) throws DataFormatException {
        nucleotideType = Character.toUpperCase(nucleotideType);
        if ((nucleotideType != 'A') && (nucleotideType != 'G') && (nucleotideType != 'C') && (nucleotideType != 'U') &&
                (nucleotideType != 'N')) {
            throw new DataFormatException("Unknown nucleotide");
        }

        this.nucleotideType = nucleotideType;

        switch (nucleotideType) {
            case 'N':
                this.nucleotidePurineOrPyrimidine = "NotKnown";
                break;
            case ('A'|'G') :
                this.nucleotidePurineOrPyrimidine = "Purine";
                break;
            default:
                this.nucleotidePurineOrPyrimidine = "Pyrimidine";
                break;
        }

    }


    public Character getNucleotideType() {
        return nucleotideType;
    }

    public String getNucleotidePurineOrPyrimidine() {
        return nucleotidePurineOrPyrimidine;
    }

    public void setNucleotideType(Character nucleotideType) {
        this.nucleotideType = nucleotideType;
    }

}




