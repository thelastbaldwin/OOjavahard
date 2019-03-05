public class OldMacDriver {
    public static void main( String[] args){
        OldMacCow maudine = new OldMacCow();
        OldMacCow pauline = new OldMacCow();
        maudine.moo();
        pauline.moo();

        OldMacDuck ferdinand = new OldMacDuck();
        ferdinand.quack();
    }
}

/**
 * Modifying the "linked" files and then compiling this file
 * resulted in both of the updated files being compiled. Both files 
 * had previously been compiled, so I'm not sure how the compiler
 * knew the linked files were outdated.
 */