public class whyeron_java_bag_analyzer {

    public static void main(String[] args) {
        // imagine whyeron has 3 different sized "adventure bags" (the rows).
        // he wants to write a "summary list" (the new 1D array) that just says how many items are in each bag,
        // so he doesn't have to open them up to check

        // whyeron has 3 bags.
        // bag 0 has 3 items. bag 1 has 7 items. bag 2 has 4 items.
        String[][] bags = {
                {"⚔️", "🛡️", "🧪"},                                     // row 0
                {"💰", "💰", "💰", "💰", "💰", "💰", "💰"},             // row 1
                {"🧪", "🧪", "🧪", "🧪"}                               // row 2
        };

        // we create a new 1d array to store the sizes.
        // we use bags.length (which is 3) to set the size of this new array.
        int[] bagSizes = new int[bags.length];
        // bagSizes currently looks like: {0, 0, 0}

        for (int i = 0; i < bags.length; i++) {
            // we grab the length of the current row and save it into our new array.
            bagSizes[i] = bags[i].length;
        }

        // --- in detail! the size-mapping trace ---

        //      STEP 1: identifying the "box" size
        //              >>> bags.length is 3.
        //              >>> we create int[] bagSizes with 3 slots.
        //              >>> ✅ bagSizes = {0, 0, 0}.

        //      STEP 2: the loop starts (mapping row 0)
        //              >>> i = 0.
        //              >>> bags[0].length is 3.
        //              >>> we execute: bagSizes[0] = 3.
        //              >>> ✅ bagSizes is now {3, 0, 0}.

        //      STEP 3: the loop continues (mapping row 1)
        //              >>> i = 1.
        //              >>> bags[1].length is 7.
        //              >>> we execute: bagSizes[1] = 7.
        //              >>> ✅ bagSizes is now {3, 7, 0}.

        //      STEP 4: the loop continues (mapping row 2)
        //              >>> i = 2.
        //              >>> bags[2].length is 4.
        //              >>> we execute: bagSizes[2] = 4.
        //              >>> ✅ bagSizes is now {3, 7, 4}.

        //      STEP 5: termination
        //              >>> i = 3. 3 < 3 is FALSE.
        //              >>> the loop ends. 
        //              >>> ✅ whyeron  now has a perfect 1d summary of his jagged bags!

        // printing the results to verify
        System.out.println("bag sizes summary:");
        for (int size : bagSizes) {
            System.out.println("size: " + size);
        }
    }
}
