public class MusiciansHell {
    /*The party is coming to an end, and the last musicians are leaving the venue when the staff
    calls them to help clean up the place. No one wants to do it, so a plan takes form:
    they will all line up, and a staff member will think of a random number between 10 and 15
    to give each artist. If the musician's name has more letters than the picked number,
    that musician gets chosen to help. The others are free to go. */

    public static void main(String[] args){
        String[] musicians = {"Steven Tyler", "Erykah Badu", "Mick Jagger", "Paul McCartney", "Brandon Flowers", "Alex Turner"};

        String musician = pickMusician(musicians);

        System.out.println(musician); // should return the musician's name, or "No one will stay to help."
    }

    public static String pickMusician(String[] musicians){

        for (int i = 0; i < musicians.length ; i++) {

            int[] musicianRandom = new int [musicians.length] ;
            int randomNum = (int) (( Math.random() * 6) + 10 ) ;
            musicianRandom[i] = randomNum ;
            System.out.print( musicianRandom[i] + ", " ) ;

            if ( musicians[i].length() >  musicianRandom[i] ) {
                return (musicians[i] + " is picked.") ;
            }
        } return ("No one will stay to help.") ;
    }
}