public class whyeron_java_jagged_2d_arrays {

    public static void main(String[] args) {

        // --- the structure ---
        // notice the rows are different lengths!
        char[][] building = {
                {'a', 'b', 'c'}, // floor 0: 3 rooms
                {'d'},           // floor 1: 1 room
                {'e', 'f'}        // floor 2: 2 rooms
        };

        // --- the trace ---

        for (int i = 0; i < building.length; i++) {
            for (int j = 0; j < building[i].length; j++) {
                System.out.print(building[i][j] + " ");
            }
        }

        // in detail! let's see why building[i].length saves us.

        //      STEP 1: outer loop floor 0
        //              >>> i = 0.
        //              >>> building[0].length is 3.

        //                      STEP 1.1: inner loop starts
        //                              >>> j = 0, 1, 2.
        //                              >>> we access 'a', 'b', and 'c'.
        //                              >>> ✅ floor 0 is clear.

        //      STEP 2: outer loop floor 1
        //              >>> i = 1.
        //              >>> building[1].length is 1. (java checks the specific floor!)

        //                      STEP 2.1: inner loop starts
        //                              >>> j = 0.
        //                              >>> building[1][0] is 'd'.
        //                              >>> j++, j becomes 1.
        //                              >>> is 1 < 1? FALSE.
        //                              >>> ✅ the loop stops early! no crash occurs.

        //      STEP 3: outer loop floor 2
        //              >>> i = 2.
        //              >>> building[2].length is 2.

        //                      STEP 3.1: inner loop starts
        //                              >>> j = 0, 1.
        //                              >>> building[2][0] is 'e', [2][1] is 'f'.
        //                              >>> ✅ floor 2 is clear.

        //      STEP 4: termination
        //              >>> i = 3. is 3 < 3? FALSE.
        //              >>> ✅ entire building scanned.
    }
}