class PasswordGenerator {
/* Each musician is given a password to get into the feast's venue.
Every password is generated the same way: a computer program takes the musician's last name
and replaces every 'a' with an '@', and every 'i' with an exclamation point. */

    public static void main(String[] args){
        System.out.println(generatePassword("Peter Gabriel")); // should print "G@br!el"
        System.out.println(generatePassword("Brian Adams")); // should print "@d@ms"
    }

    public static String generatePassword(String musicianName){
        return musicianName
                .split(" ") [1]
                .replaceAll("(?i)a", "@" )
                .replaceAll( "(?i)i" , "!");
    }
}

