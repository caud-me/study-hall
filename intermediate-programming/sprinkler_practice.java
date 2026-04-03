public class sprinkler_practice {
    public static void main(String[] args) {
        int[] moisture = {60, 30, 40, 45, 35, 50, 55, 25};

        int threshold = 40;

        int minutes = 0;

        int warns = 0;

        boolean isSprinklerOn = false;

        for (int current : moisture) {
            System.out.print(current + ": ");

            if (current > threshold) {

                if (!isSprinklerOn) {
                    System.out.print("Above threshold. ");
                    System.out.print("Sprinkler is " + checkSprinkler(isSprinklerOn));
                    System.out.print(" (minutes: " + minutes + ")");
                }
                if (isSprinklerOn) {
                    warns++;

                    if (warns == 1) {
                        System.out.print("Strictly greater than threshold, (Potential shut-off...) ");
                        System.out.print("Sprinkler stays " + checkSprinkler(isSprinklerOn));
                        System.out.print(" (minutes: " + ++minutes + ")");
                    }
                    if (warns == 2) {
                        System.out.print("Strictly greater than threshold, Second in a row. ");

                        warns = 0;
                        isSprinklerOn = false;

                        System.out.print("Sprinkler is " + checkSprinkler(isSprinklerOn));
                        System.out.print(" (minutes: " + minutes + ")");
                    }
                }
            }

            if (current == threshold) {
                System.out.print("Equal threshold. ");
                System.out.print("Sprinkler stays " + checkSprinkler(isSprinklerOn));
                System.out.print(" (minutes: " + ++minutes + ")");
            }

            if (current < threshold) {
                if (!isSprinklerOn) isSprinklerOn = true;

                if (warns == 0) System.out.print("Below threshold. ");
                if (warns == 1) System.out.print("Below threshold again. Shut-off sequence reset. ");

                warns = 0;
                System.out.print("Sprinkler stays " + checkSprinkler(isSprinklerOn));
                System.out.print(" (minutes: " + ++minutes + ")");
            }

            System.out.println();
        }
    }

    static String checkSprinkler(boolean value) {
        if (value) return "ON";
        else return "OFF";
    }
}

/*
        for (int i = 0; i < moisture.length; i++) {
            int current = moisture[i];

            if (current > threshold) {

                warns++;

                if (!sprinkerState) {
                    System.out.print(current + " >>> above threshold. sprinkler is OFF. min >>> " + minutes);
                    minutes++;
                } else {
                    switch (warns) {
                        case 1:
                            System.out.print(current + " >>> strictly greater than threshold. potential shut-off... sprinkler stays ON min >>> " + minutes);
                            minutes++;
                            break;
                        case 2:
                            System.out.print(current + " >>> strictly greater than threshold. second in a row... sprinkler turns OFF min >>> " + minutes);
                            break;
                    }
                }

                if (warns >= 2) {
                    sprinkerState = false;
                }


            } else if (current == threshold) {

                System.out.print(current + " >>> equal threshold. sprinkler stays ON. (recovery mode). min >>> " + minutes);
                minutes++;
            } else {

                if (warns != 0 ) warns--;

                if (!sprinkerState) {
                    System.out.print(current + " >>> below threshold. sprinkler turns ON. min >>> " + minutes);
                    minutes++;
                } else {
                    switch (warns) {
                        case 0:
                            System.out.print(current + " >>> below threshold again. shut-off sequence reset. sprinkler stays ON min >>> " + minutes);
                            break;
                        case 1:
                            System.out.print(current + " >>> below threshold. min >>> " + minutes);
                            break;
                    }
                    minutes++;
                }

                sprinkerState = true;
            }

            System.out.println();
        }

 */

/*
        for (int i = 0; i < moisture.length; i++) {
            int current = moisture[i];

            if (current > threshold) {
                warns++;

                switch (warns) {
                    case 1:
                        System.out.println(current + " above threshold min: " + minutes);
                        break;
                    case 2:
                        System.out.println(current + " strictly greater than threshold, potential shut-off... min: " + minutes);
                        break;
                    case 3:
                        System.out.println(current + " strictly greater than threshold, second in a row... min: " + minutes);
                        break;
                }

                if (warns >= 2) {
                    System.out.println("now false");
                    sprinkerState = false;
                } else {
                    minutes++;
                }
            } else if (current == threshold) {
                System.out.println(current + " equal to threshold min: " + minutes);
                minutes++;
            } else if (current < threshold) {
                System.out.println(current + " below threshold min: " + minutes);
                sprinkerState = true;
                if (warns != 0 ) warns--;
                minutes++;
            }

            System.out.println(warns);
        }
 */
