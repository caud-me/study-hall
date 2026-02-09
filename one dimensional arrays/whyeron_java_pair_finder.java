public class whyeron_java_pair_finder {

    public static void main(String[] args) {

        // whyeron has 4 unique materials in his 1d array.
        // he wants to see every possible pair he can make.
        String[] materials = {"🔥", "❄️", "⚡", "🌿"};

        // --- the step-by-step combination trace ---

        for (int i = 0; i < materials.length; i++) {
            // j starts at i + 1 so we don't pair an item with itself.
            for (int j = i + 1; j < materials.length; j++) {
                System.out.println("pair: " + materials[i] + " + " + materials[j]);
            }
        }

        // in detail! let"s trace how whyeron finds the pairs.

        //      STEP 1: outer loop picks the first item (i = 0)
        //              >>> i = 0. material is "🔥".

        //                      STEP 1.1: inner loop starts at j = i + 1 (0 + 1 = 1)
        //                              >>> j = 1. material is "❄️".
        //                              >>> result: 🔥 + ❄️

        //                      STEP 1.2: j increments to 2
        //                              >>> j = 2. material is "⚡".
        //                              >>> result: 🔥 + ⚡

        //                      STEP 1.3: j increments to 3
        //                              >>> j = 3. material is "🌿".
        //                              >>> result: 🔥 + 🌿
        //                              >>> ✅ all pairs for 🔥 are found.

        //      STEP 2: outer loop moves to the next item (i = 1)
        //              >>> i = 1. material is "❄️".

        //                      STEP 2.1: inner loop starts at j = i + 1 (1 + 1 = 2)
        //                              >>> notice: we skip "🔥" because we already paired it!
        //                              >>> j = 2. material is "⚡".
        //                              >>> result: ❄️ + ⚡

        //                      STEP 2.2: j increments to 3
        //                              >>> j = 3. material is "🌿".
        //                              >>> result: ❄️ + 🌿
        //                              >>> ✅ all pairs for ❄️ are found.

        //      STEP 3: outer loop moves to the next item (i = 2)
        //              >>> i = 2. material is "⚡".

        //                      STEP 3.1: inner loop starts at j = i + 1 (2 + 1 = 3)
        //                              >>> j = 3. material is "🌿".
        //                              >>> result: ⚡ + 🌿
        //                              >>> ✅ all pairs for ⚡ are found.

        //      STEP 4: outer loop moves to the last item (i = 3)
        //              >>> i = 3. material is "🌿".
        //              >>> inner loop starts at j = i + 1 (3 + 1 = 4).
        //              >>> is 4 < 4? FALSE.
        //              >>> ✅ whyeron is done! no one left for 🌿 to pair with.
    }
}
