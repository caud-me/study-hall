public class whyeron_java_party_manager {

    public static void main(String[] args) {

        // the vip rooms are jagged because some are bigger than others.
        // '?' means the guest hasn't arrived.
        // 'P' means the guest "timothy" is here but not checked in.
        char[][] vipRooms = {
                {'?', '?'},           // room 0: 2 seats
                {'?', 'T', '?'},      // room 1: 3 seats
                {'?'}                 // room 2: 1 seat
        };

        // goal: find 'P' (Peter) and check him in by changing 'P' to '✅'.

        for (int i = 0; i < vipRooms.length; i++) {
            for (int j = 0; j < vipRooms[i].length; j++) {

                // if we find Peter...
                if (vipRooms[i][j] == 'T') {
                    // we use the current coordinates i and j to update the array!
                    vipRooms[i][j] = '✅';
                    System.out.println(":3 timothy is now checked in, timothy says thank you.");
                }
            }
        }

        // --- in detail! the practical check-in trace ---

        //      STEP 1: whyeron checks room 0
        //              >>> i = 0. room 0 has 2 seats.
        //                      >>> seat 0 is '?'.
        //                      >>> seat 1 is '?'.
        //                      >>> ✅ no one to check in here.

        //      STEP 2: whyeron checks room 1
        //              >>> i = 1. room 1 has 3 seats.

        //                      STEP 2.1: check seat 0
        //                              >>> value is '?'. skip.

        //                      STEP 2.2: check seat 1
        //                              >>> value is 'P'. MATCH!
        //                              >>> logic: vipRooms[1][1] = '✅'.
        //                              >>> the 'P' is deleted and replaced by '✅'.
        //                              >>> ✅ peter is now checked in!

        //                      STEP 2.3: check seat 2
        //                              >>> value is '?'. skip.

        //      STEP 3: whyeron checks room 2
        //              >>> i = 2. room 2 has 1 seat.
        //                      >>> seat 0 is '?'. skip.
        //                      >>> ✅ all rooms checked.

        // result check:
        // vipRooms[1][1] is now '✅'.
    }
}