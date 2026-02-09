public class whyeron_java_2d_arrays {

    public static void main(String[] args) {

        // --- the syntax & analogy ---

        // think of a 1d array like a single "bookshelf".
        // char[] shelf = {'book1', 'book2'};

        // a 2d array is like a "library" (a collection of bookshelves).
        // the first [] tells java how many shelves we have (rows).
        // the second [] tells java how many books fit on each shelf (columns).

        // why the double brackets?
        // the first [] gets you to the shelf. the second [] gets you to the book.
        // without both, you're just pointing at a piece of furniture, not the data!

        char[][] library = {
                {'a', 'b'}, // shelf 0
                {'c', 'd'}  // shelf 1
        };

        // grid.length looks at the "library" to see how many shelves there are.
        // ✅ it returns 2.

        // grid[i].length looks at the specific shelf "i" is holding.
        // ✅ it returns the number of books on that specific shelf.

        // --- the loop logic ---

        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++) {
                System.out.println(library[i][j]);
            }
        }

        // ⚠️ PLEASE: stop using enhanced for loop if you still don't get how the traditional for works
        // although pretty, it'll destroy the readability of your code.

        // in detail! assuming our library is { {'a', 'b'}, {'c', 'd'} }

        //      STEP 1: the outer loop starts (selecting the shelf)
        //              >>> i = 0.
        //              >>> is 0 < 2 (library.length)? TRUE.
        //              >>> we are now standing in front of shelf 0: {'a', 'b'}.

        //                      STEP 1.1: the inner loop starts (scanning the books)
        //                              >>> j = 0.
        //                              >>> library[i][j] becomes library[0][0].
        //                              >>> we grab the book 'a'.
        //                              >>> j++, j becomes 1.

        //                      STEP 1.2: continuing the shelf scan
        //                              >>> library[i][j] becomes library[0][1].
        //                              >>> we grab the book 'b'.
        //                              >>> j++, j becomes 2.

        //                      STEP 1.3: inner loop termination
        //                              >>> is 2 < 2 (library[0].length)? FALSE.
        //                              >>> ✅ shelf 0 is finished. the inner loop dies.

        //      STEP 2: moving to the next shelf
        //              >>> i++, i becomes 1.
        //              >>> is 1 < 2? TRUE.
        //              >>> we move our ladder to shelf 1: {'c', 'd'}.

        //                      STEP 2.1: the inner loop is reborn (scanning new books)
        //                              >>> j resets to 0. (this is crucial!)
        //                              >>> library[1][0] retrieves 'c'.
        //                              >>> j++, j becomes 1.

        //                      STEP 2.2: continuing the shelf scan
        //                              >>> library[1][1] retrieves 'd'.
        //                              >>> j++, j becomes 2.

        //                      STEP 2.3: inner loop termination
        //                              >>> is 2 < 2? FALSE.
        //                              >>> ✅ shelf 1 is finished. the inner loop dies.

        //      STEP 3: the final check
        //              >>> i++, i becomes 2.
        //              >>> is 2 < 2? FALSE.
        //              >>> ✅ the outer loop dies. we have exited the library.
    }
}
