
/**
 * Enumeration class ThisMidTermIs - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */


public enum MidTermDifficulty
{
    DIABOLICAL(10), DIFFICULT(8), ANNOYING(6), EASY(4), TRIVIAL(2);
    
    private int difficulty;
    
    private MidTermDifficulty(int d){
        difficulty = d;
    }
    
    public int getDifficulty(){
        return difficulty;
    }
}
