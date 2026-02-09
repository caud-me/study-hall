public class whyeron_java_dungeon_search {

    public static void main(String[] args) {

        // whyeron is in a dungeon. 
        // each row is a room, each char is an item in that room.
        String[][] dungeon = {
                {"🛡️", "🧪", "🛡️"}, // room 0
                {"⚔️", "🛡️"},      // room 1 (jagged!)
                {"🛡️", "💰", "🧪"}  // room 2
        };

        String target = "🛡️"; // whyeron wants to count how many shields he has.
        int shieldCount = 0; // our accumulator for shields.

        for (int i = 0; i < dungeon.length; i++) {
            for (int j = 0; j < dungeon[i].length; j++) {

                // the if statement acts as a filter.
                if (dungeon[i][j] == target) {
                    shieldCount++;
                }
            }
        }

        System.out.println("whyeron found " + shieldCount + " shields!");

        // in detail! let"s trace whyeron"s path to find the shields.

        //      STEP 1: whyeron enters room 0 (outer loop i = 0)
        //              >>> the room has 3 items (dungeon[0].length).

        //                      STEP 1.1: whyeron checks slot 0.
        //                              >>> is "🛡️" == "🛡️"? TRUE. ✅
        //                              >>> shieldCount becomes 1.

        //                      STEP 1.2: whyeron checks slot 1.
        //                              >>> is "🧪" == "🛡️"? FALSE.
        //                              >>> shieldCount stays at 1.

        //                      STEP 1.3: whyeron checks slot 2.
        //                              >>> is "🛡️" == "🛡️"? TRUE. ✅
        //                              >>> shieldCount becomes 2.
        //                              >>> j becomes 3. inner loop dies.

        //      STEP 2: whyeron enters room 1 (outer loop i = 1)
        //              >>> the room has 2 items. j resets to 0.

        //                      STEP 2.1: whyeron checks slot 0.
        //                              >>> is "⚔️" == "🛡️"? FALSE.

        //                      STEP 2.2: whyeron checks slot 1.
        //                              >>> is "🛡️" == "🛡️"? TRUE. ✅
        //                              >>> shieldCount becomes 3.
        //                              >>> j becomes 2. inner loop dies.

        //      STEP 3: whyeron enters room 2 (outer loop i = 2)
        //              >>> the room has 3 items. j resets to 0.

        //                      STEP 3.1: whyeron checks slot 0.
        //                              >>> is "🛡️" == "🛡️"? TRUE. ✅
        //                              >>> shieldCount becomes 4.

        //                      STEP 3.2: whyeron checks slot 1.
        //                              >>> is "💰" == "🛡️"? FALSE.

        //                      STEP 3.3: whyeron checks slot 2.
        //                              >>> is "🧪" == "🛡️"? FALSE.
        //                              >>> j becomes 3. inner loop dies.

        //      STEP 4: final count
        //              >>> i becomes 3. outer loop dies.
        //              >>> ✅ the program prints: "whyeron found 4 shields!"
    }
}