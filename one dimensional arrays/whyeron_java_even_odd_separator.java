public class whyeron_java_even_odd_separator {
    public static void main(String[] args) {

        // whyeron's original 1d array of crystals
        int[] crystals = {10, 15, 22, 33, 40};

        int evenCount = 0;
        int oddCount = 0;

        // --- step 1: counting sizes ---
        // we need to know how big to make our new arrays.
        for (int crystal : crystals) {
            if (crystal % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // --- step 2: initialization ---
        // we use the counts we just found to set the sizes.
        int[] evenCrystals = new int[evenCount]; // size will be 3
        int[] oddCrystals = new int[oddCount];   // size will be 2

        // we need "trackers" to remember which slot we are filling in the new arrays.
        int evenIndex = 0;
        int oddIndex = 0;

        // --- step 3: the separation loop ---
        // i is the "global master". it visits every single slot in the crystals array.
        for (int i = 0; i < crystals.length; i++) {

            // we look at the current crystal at index i and check its remainder.
            if (crystals[i] % 2 == 0) {

                // if it's even, we copy the value into the evenCrystals array.
                // notice we use 'evenIndex' here, NOT 'i'.
                // this is because if i = 1 (an odd number), evenCrystals[1] would be a skip.
                evenCrystals[evenIndex] = crystals[i];

                // we "click" the even counter forward so the next even number
                // doesn't overwrite the one we just placed.
                evenIndex++;

            } else {
                // if the remainder was not 0, it must be odd.
                // we use 'oddIndex' to target the next available slot in the odd array.
                oddCrystals[oddIndex] = crystals[i];

                // we increment the odd tracker only. the even tracker stays still.
                oddIndex++;
            }
        }
        
        // ⚠️ PLEASE: stop using enhanced for loop if you're still unsure about how the traditional for loop works
        // it'll be confusing long term, kills readability.

        // in detail! let's trace whyeron's crystal sorting.

        //      STEP 1: preparation
        //              >>> whyeron counts 3 evens (10, 22, 40) and 2 odds (15, 33).
        //              >>> evenCrystals is created with 3 slots {0, 0, 0}.
        //              >>> oddCrystals is created with 2 slots {0, 0}.
        //              >>> evenIndex and oddIndex both start at 0.

        //      STEP 2: first crystal (i = 0, value = 10)
        //              >>> 10 % 2 is 0. it is even.
        //              >>> evenCrystals[evenIndex] means evenCrystals[0] = 10.
        //              >>> evenIndex increments to 1.
        //              >>> ✅ even array: {10, 0, 0}.

        //      STEP 3: second crystal (i = 1, value = 15)
        //              >>> 15 % 2 is 1. it is odd.
        //              >>> oddCrystals[oddIndex] means oddCrystals[0] = 15.
        //              >>> oddIndex increments to 1.
        //              >>> ✅ odd array: {15, 0}.

        //      STEP 4: third crystal (i = 2, value = 22)
        //              >>> 22 % 2 is 0. it is even.
        //              >>> evenCrystals[evenIndex] means evenCrystals[1] = 22.
        //              >>> evenIndex increments to 2.
        //              >>> ✅ even array: {10, 22, 0}.

        //      STEP 5: fourth crystal (i = 3, value = 33)
        //              >>> 33 % 2 is 1. it is odd.
        //              >>> oddCrystals[oddIndex] means oddCrystals[1] = 33.
        //              >>> oddIndex increments to 2.
        //              >>> ✅ odd array: {15, 33}.

        //      STEP 6: fifth crystal (i = 4, value = 40)
        //              >>> 40 % 2 is 0. it is even.
        //              >>> evenCrystals[evenIndex] means evenCrystals[2] = 40.
        //              >>> evenIndex increments to 3.
        //              >>> ✅ even array: {10, 22, 40}.

        //      STEP 7: termination
        //              >>> i becomes 5. 5 < 5 is FALSE.
        //              >>> ✅ whyeron has successfully separated the crystals!
    }
}
