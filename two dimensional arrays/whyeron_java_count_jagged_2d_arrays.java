public class whyeron_java_count_jagged_2d_arrays {

    public static void main(String[] args) {

        // --- the mansion structure (jagged array) ---
        // floor 0 has 3 rooms, floor 1 has 1 room, floor 2 has 2 rooms.
        char[][] mansion = {
                {'r', 'o', 'o'}, // floor 0
                {'m'},           // floor 1
                {'s', '!'}       // floor 2
        };

        // this is our "clicker" (the accumulator).
        // it is declared outside the loops so it doesn't reset.
        int totalRooms = 0;

        // --- the master trace ---

        for (int i = 0; i < mansion.length; i++) {

            // ✅ STEP 1: select a floor
            //      >>> i = 0.
            //      >>> mansion[0].length is 3.

            for (int j = 0; j < mansion[i].length; j++) {

                //      STEP 1.1: enter a room and "click"
                //              >>> we are at mansion[0][0].
                //              >>> totalRooms = totalRooms + 1. (now 1)

                //      STEP 1.2: next room
                //              >>> we are at mansion[0][1].
                //              >>> totalRooms = totalRooms + 1. (now 2)

                //      STEP 1.3: next room
                //              >>> we are at mansion[0][2].
                //              >>> totalRooms = totalRooms + 1. (now 3)

                //              >>> j becomes 3. 3 < 3 is FALSE. inner loop dies.

                totalRooms++; // this is the clicker!
            }

            // ✅ STEP 2: move to floor 1
            //      >>> i = 1.
            //      >>> mansion[1].length is 1.

            for (int j = 0; j < mansion[i].length; j++) {

                //      STEP 2.1: enter the only room
                //              >>> we are at mansion[1][0].
                //              >>> totalRooms = totalRooms + 1. (now 4)

                //              >>> j becomes 1. 1 < 1 is FALSE. inner loop dies.

                totalRooms++;
            }

            // ✅ STEP 3: move to floor 2
            //      >>> i = 2.
            //      >>> mansion[2].length is 2.

            for (int j = 0; j < mansion[i].length; j++) {

                //      STEP 3.1: scan rooms
                //              >>> at mansion[2][0], totalRooms becomes 5.
                //              >>> at mansion[2][1], totalRooms becomes 6.

                //              >>> j becomes 2. 2 < 2 is FALSE. inner loop dies.

                totalRooms++;
            }

            // ✅ STEP 4: mansion search complete
            //      >>> i = 3. 3 < 3 is FALSE. outer loop dies.
        }

        System.out.println("total rooms in whyeron's mansion: " + totalRooms);
    }
}