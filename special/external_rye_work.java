import java.util.Scanner;

public class external_rye_work {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numberOfItems; // initialization of item count, by default its 0.

        System.out.print("How many items: "); // ask the user how many items are we gonna calculate
        numberOfItems = scanner.nextInt(); // if i enter the value 4, numberOfItems becomes 4 as well
     // numberOfItems = 4

     // you created array with a size of what the user has inputted.
     // ✅ this is correct!
        double [] itemPrices = new double[numberOfItems]; // this uses the value from numberOfItems, which is 4.
     // double [] itemPrices  = new double[4]
     // double [] itemPrices = {0, 0, 0, 0}, the itemPrices[] would look like this.

        // here, you set up the variables needed to be display for later.
        double totalAmounts = 0; // the sum of all prices inside itemPrices[]
        double discounted = 0; // the sum of all prices inside itemPrices[] but with discount included
        double mostExpensive = 0; // identify the most expensive item inside itemPrices[]
        double leastExpensive = 0; // identify the lease expensive item inside itemPrices[]


        // you used a for loop, which iterates four times. from 0, 1, 2, 3

        // ✅ this is correct! it matches the numberOfItems value which is four.
        // so it's really expected for the loop to only iterate four times.

        // if the code iterated five times, you end up with 0, 1, 2, 3, 4. you'll end up with out of bounds error.

        // now that i know this for loop runs four times, i am going to check what's happening inside.
        for( int i = 0; i < numberOfItems ; i++){
            // you created a discount variable inside a for loop,
            // this is helpful so you remember that items priced below 100 get discounts.
            double discount = 100;

            // i think this part actually fills up the itemPrices[] array.
            System.out.print("Enter the item price: ");
            // since i is currently at 0 in for loop, it means were currently focused to the first index of itemPrices[] array.
            // which is itemPrices[0]
            // if i were to type 99, the array would look like:
            // itemPrices[] = {99, 0, 0, 0}

            itemPrices[i] = scanner.nextDouble();

            // this part simply checks if the inputted price is greater than discount
            // since i typed 99, the if condition would look like:
            // if (99 > 100), this is FALSE.
            // so i should not get a 10% discount.
            if(itemPrices[i] > discount){
                System.out.println(" - 10% discount - ");
            }

            // once we successfully iterated, `i` becomes 1.
            // same thing appears but were dealing with the second index of itemPrices[] array.
            // which is itemPrices[1]
            // now that i've entered 99 for the first index.
            // i will put 299 for the second index, the array would look like:
            // itemPrices[] = {99, 299, 0, 0}

            // then the if statement will check if ill get a discount or not, the if condition would look like:
            // if (299 > 100), this is TRUE.
            // so i should get a 10% discount.

            // this will loop for four times, given that numberOfItems is 4.

            // this is why numberOfItems is such a powerful variable.
            // ✅ it lets you create an array with expected size.
            //          by using: double [] itemPrices = new double[numberOfItems];
            // ✅ it controls when the for loop will stop.
            //          by using: for( int i = 0; i < numberOfItems ; i++){




            // in detail! assuming my itemPrices[] is {0, 0, 0, 0}
            //      STEP 1: the for loop
            //              >>> we make it only run FOUR TIMES, because numberOfItems is 4.
            //              >>> in a zero indexed perspective, the counting goes from 0, 1, 2, 3.
            //              >>> now, we know that the for loop will run four times, we don't have to worry about outOfBounds error.

            //      STEP 2: entering the item price
            //              >>> we are currently at `i = 0` in a for loop.
            //                      >>> we are asked to type a number, i typed 99.
            //                      >>> itemPrices[i] means itemPrices[0], we are updating the first index of the array.
            //                      >>> in itemPrices[] perspective, it looks like {99, 0, 0, 0}.
            //                      >>> IS 99 > 100? FALSE.
            //                      >>> i should not get a `- 10% discount -` text.
            //                      >>> i++, means were leveling up to `i = 1`.

            //              >>> we are currently at `i = 1` in a for loop.
            //                      >>> we are asked to type a number, i typed 299.
            //                      >>> itemPrices[i] means itemPrices[1], we are updating the second index of the array.
            //                      >>> in itemPrices[] perspective, it looks like {99, 299, 0, 0}.
            //                      >>> IS 299 > 100? TRUE.
            //                      >>> i should get a `- 10% discount -` text.
            //                      >>> i++, means were leveling up to `i = 1`.

            //              >>> we are currently at `i = 2` in a for loop.
            //                      >>> we are asked to type a number, i typed 599.
            //                      >>> itemPrices[i] means itemPrices[2], we are updating the third index of the array.
            //                      >>> in itemPrices[] perspective, it looks like {99, 299, 599, 0}.
            //                      >>> IS 599 > 100? TRUE.
            //                      >>> i should get a `- 10% discount -` text.
            //                      >>> i++, means were leveling up to `i = 3`.

            //              >>> we are currently at `i = 3` (last) in a for loop.
            //                      >>> we are asked to type a number, i typed 2599.
            //                      >>> itemPrices[i] means itemPrices[3], we are updating the last index of the array.
            //                      >>> in itemPrices[] perspective, it looks like {99, 299, 599, 2599}.
            //                      >>> IS 2599 > 100? TRUE.
            //                      >>> i should get a `- 10% discount -` text.
            //                      >>> i++, means were leveling up to `i = 4`.

            //              >>> the for loop can no longer run because it fails the condition (i > numberOfItems) being (4 > 4), which is FALSE.
            //              >>> ✅ the itemPrices[] array is complete.
            //              >>> ✅ itemPrices[] = {99, 299, 599, 1499}
            //              >>> ✅ your itemPrices[] array is ready to be processed by the methods you've made.
        }

        // here, you start filling values to the variables you've set up earlier,
        // and its nice that you are using a method to organize it.
        // ✅ its very clean.
        // ✅ good naming of methods too.
        discounted = discountedItem(itemPrices);
        totalAmounts = totalAmount(itemPrices);
        mostExpensive = expensiveItem(itemPrices);
        leastExpensive = leastExpensiveItem(itemPrices);

        // ✅ good formatting!
        System.out.println("\n--------------------------");
        System.out.print("\nTotal amount: " + totalAmounts);
        System.out.print("\nWith discounted items: " + discounted);
        System.out.print("\nMost expensive item: " + mostExpensive);
        System.out.print("\nLeast expensive item: " + leastExpensive);

        // ✅ good programming practice
        scanner.close();

    }

    // from what i am understanding, these methods asks for itemPrices[] array, and returns a double value.
    // this should only run after the for loop is done, meaning our itemPrices[] has complete values.

    // ✅ so putting `discounted = discountedItem(itemPrices);` (and the other methods) AFTER the for loop is a great intuition.

    // lets assume that the my itemPrices[] is now...
    // itemPrices[] = {99, 299, 599, 2599}
    static double discountedItem(double [] itemPrices){

        // you created a discountedPrice variable inside a for loop,
        // this is helpful so you remember that items priced below 100 get discounts.
        // this is similar to the discount variable you had in for loop.
        double discountedPrice = 100;

        // this i assume subtracts 10% of the price, if the price is eligible for discount.
        double percentageDiscount = .10;

        // this is your accumulator variable, it adds all the values inside the itemPrices[] with discount.
        // ✅ setting your accumulator variable to zero by default is good idea.
        double discount = 0;

        // you used an enhanced for loop, this is similar to
        //      for (int i = 0; i < itemPrices.length; i++)
        // OR   for (int i = 0; i < numberOfItems; i++)
        for(double itemPrice : itemPrices) {
            // you have if condition inside that:
            //      - checks first if the item is eligible for discount
            //      - subtracts 10% of it.
            //      - then store to the discount accumulator variable
            //      - if not, no subtraction happens and the item price is stored to the accumulator variable.
            if (itemPrice > discountedPrice) {
                discount += itemPrice - (itemPrice * percentageDiscount);
                // ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐
                // ⭐ shortcut trick in case you want...                     ⭐
                // ⭐ discount += (itemPrice * 0.9)                          ⭐
                // ⭐                                                        ⭐
                // ⭐ no need for a percentageDiscount variable on this one  ⭐
                // ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐
            }
            else{
                // ✅ else block only triggers if prices are 99 below
                // they do not need discount, so the original item price gets added to the discount accumulator directly.
                discount += itemPrice;
            }
        }
        // in detail! assuming my itemPrices[] is {99, 299, 599, 2599}
        //      STEP 1: the for loop
        //              >>> we make it only run FOUR TIMES, because itemPrices[] length is 4.
        //              >>> now, we know that the for loop will run four times, we don't have to worry about outOfBounds error.

        //      STEP 2: the if condition
        //              >>> we first check the first index of itemPrices[], 99.
        //                      >>> IS 99 > 100? FALSE. no discount.
        //                      >>> discount is currently 0, plus 99 = 99

        //              >>> second index of itemPrices[], 299.
        //                      >>> IS 299 > 100? TRUE.
        //                              >>> your formula is `itemPrice - (itemPrice * percentageDiscount);` and we follow that...
        //                              >>> 299 - (299 * 0.1)
        //                              >>> 299 - 29.9 [follow pemdas rule]
        //                              >>> 269.1
        //                      >>> discount is currently 99, plus 269.1 = 368.1

        //              >>> third index of itemPrices[], 599.
        //                      >>> IS 599 > 100? TRUE.
        //                              >>> 599 - (599 * 0.1)
        //                              >>> 599 - 59.9
        //                              >>> 539.1
        //                      >>> discount is currently 368.1, plus 539.1 = 907.2

        //              >>> fourth and last index of itemPrices[], 2599.
        //                      >>> IS 2599 > 100? ABSOLUTELY.
        //                              >>> 2599 - (2599 * 0.1)
        //                              >>> 2599 - 259.9
        //                              >>> 2339.1
        //                      >>> discount is currently 907.2, plus 2339.1 = 3,246.3
        return discount;
        // your discount should return 3,246.3!
        // you used this method for discounted = discountedItem(itemPrices);
        // so discounted variable should be 3,246.3 as well
    }

    // this is the simpler version of the discountedItem method, the difference is that theres no need for if checking inside a for loop.
    // we get the total NOT DISCOUNTED price.
    static double totalAmount(double [] itemPrices){
        // this is your accumulator variable, it adds all the values inside the itemPrices[] with discount.
        // ✅ setting your accumulator variable to zero by default is good idea.
        double sum = 0;

        // you used an enhanced for loop, this is similar to
        //      for (int i = 0; i < itemPrices.length; i++)
        // OR   for (int i = 0; i < numberOfItems; i++)
        for( double itemPrice : itemPrices){
            // original item price gets added to the discount accumulator directly.
            sum += itemPrice;
        }

        // in detail! assuming my itemPrices[] is {99, 299, 599, 2599}
        //      STEP 1: the for loop
        //              >>> we make it only run FOUR TIMES, because itemPrices[] length is 4.
        //              >>> now, we know that the for loop will run four times, we don't have to worry about outOfBounds error.

        //      STEP 2: the sum (accumulator)
        //              >>> we first check the first index of itemPrices[], 99.
        //                      >>> sum is currently 0, plus 99 = 99

        //              >>> second index of itemPrices[], 299.
        //                      >>> sum is currently 99, plus 299 = 398

        //              >>> third index of itemPrices[], 599.
        //                      >>> sum is currently 398, plus 599 = 997

        //              >>> fourth and last index of itemPrices[], 2599.
        //                      >>> sum is currently 997, plus 2599 = 3,596

        return sum;
        // your discount should return 3,596!
        // you used this method for totalAmounts = totalAmount(itemPrices);
        // so totalAmounts variable should be 3,596 as well

    }

    // here, we find the most expensive item in itemPrices[]
    // we know that for itemPrices[] = {99, 299, 599, 2599}, 2599 is the most expensive.
    // but how would the code now?, by comparing.

    static double expensiveItem(double []itemPrices){
        // ✅ this is correct, and great work for not confusing this to highest = 0;
        double highest = itemPrices[0];
        // wait, why not highest = 0?
        // although the code may result just as fine, this would cause problems if you're finding the LEAST EXPENSIVE item.
        // because in itemPrices[] = {99, 299, 599, 2599}, the least expensive item is 99, not 0.
        // and the code will always return 0, which is not what we want.

        // ℹ️ since highest = itemPrices[0] means first index of itemPrices[] = {99, 299, 599, 2599}, it grabs the 99.
        // so highest = 99 by default.

        // you used an enhanced for loop, this is similar to
        //      for (int i = 0; i < itemPrices.length; i++)
        // OR   for (int i = 0; i < numberOfItems; i++)
        for(double itemPrice : itemPrices){
            // you have if condition inside that:
            //      - checks first if the item IS GREATER THAN value in highest
            //      - if yes, it updates the highest variable to the price of the item. (copy/paste in other words)
            //      - if not, no update happens and proceeds to check the second item until the for loop is done.
            if(itemPrice > highest){
                highest = itemPrice;
            }
        }

        // in detail! assuming my itemPrices[] is {99, 299, 599, 2599}

        // ℹ️ remember, highest variable is currently 99.
        // since highest = itemPrices[0] means first index of itemPrices[] = {99, 299, 599, 2599}, it grabs the 99.
        // so highest = 99 by default.

        //      STEP 1: the for loop
        //              >>> we make it only run FOUR TIMES, because itemPrices[] length is 4.
        //              >>> now, we know that the for loop will run four times, we don't have to worry about outOfBounds error.

        //      STEP 2: the if condition (itemPrice > highest)
        //              >>> we first check the first index of itemPrices[], 99.
        //                      >>> IS 99 > 99? FALSE. they're the same value.
        //                      >>> highest does not get updated. it remains at 99 (the default).

        //              >>> second index of itemPrices[], 299.
        //                      >>> IS 299 > 99? TRUE.
        //                      >>> highest get updated. it becomes 299. (because `highest = itemPrice` we copy/paste the value)

        //              >>> third index of itemPrices[], 599.
        //                      >>> IS 599 > 299? TRUE.
        //                      >>> highest get updated again. it becomes 599. we copy/paste again.

        //              >>> fourth and last index of itemPrices[], 2599.
        //                      >>> IS 2599 > 599? TRUE.
        //                      >>> highest get updated again. it becomes 2599. copy/paste.

        return highest;
        // your highest should return 2,599!
        // you used this method for mostExpensive = expensiveItem(itemPrices);
        // so mostExpensive variable should be 2,599 as well
    }

    static double leastExpensiveItem(double []itemPrices){
        // ✅✅✅✅✅✅✅✅✅✅✅ GREAT WORK for doing this! ! ! ! ! ! ! !
        // you avoided yourself to get stuck on a problem wondering why leastExpensiveItem method always returns 0.
        double lowest = itemPrices[0];
        // a lot of people usually get stuck in this part, they get the expensive correctly, but not the least.
        // because in itemPrices[] = {99, 299, 599, 2599}, the least expensive item is 99, not 0.
        // and the code will always return 0, which is not what we want.

        // ℹ️ since lowest = itemPrices[0] means first index of itemPrices[] = {99, 299, 599, 2599}, it grabs the 99.
        // so lowest = 99 by default.

        // you used an enhanced for loop, this is similar to
        //      for (int i = 0; i < itemPrices.length; i++)
        // OR   for (int i = 0; i < numberOfItems; i++)
        for(double itemPrice : itemPrices){
            // you have if condition inside that:
            //      - checks first if the item IS LESS THAN value in lowest
            //      - if yes, it updates the highest variable to the price of the item. (copy/paste in other words)
            //      - if not, no update happens and proceeds to check the second item until the for loop is done.
            if(itemPrice < lowest){
                lowest = itemPrice;
            }
        }

        // in detail! assuming my itemPrices[] is {99, 299, 599, 2599}

        // ℹ️ remember, lowest variable is currently 99.
        // since lowest = itemPrices[0] means first index of itemPrices[] = {99, 299, 599, 2599}, it grabs the 99.
        // so lowest = 99 by default.

        //      STEP 1: the for loop
        //              >>> we make it only run FOUR TIMES, because itemPrices[] length is 4.
        //              >>> now, we know that the for loop will run four times, we don't have to worry about outOfBounds error.

        //      STEP 2: the if condition (itemPrice < lowest)
        //              >>> we first check the first index of itemPrices[], 99.
        //                      >>> IS 99 < 99? FALSE. they're the same value.
        //                      >>> lowest does not get updated. it remains at 99 (the default).

        //              >>> second index of itemPrices[], 299.
        //                      >>> IS 299 < 99? FALSE.
        //                      >>> lowest still does not get updated. it still remains at 99 (the default).

        //              >>> third index of itemPrices[], 599.
        //                      >>> IS 599 < 299? FALSE.
        //                      >>> lowest still does not get updated. it still remains at 99 (the default).

        //              >>> fourth and last index of itemPrices[], 2599.
        //                      >>> IS 2599 < 599? FALSE.
        //                      >>> lowest still does not get updated. it still remains at 99 (the default).

        return lowest;
        // your lowest should return 99!
        // you used this method for leastExpensive = leastExpensiveItem(itemPrices);
        // so leastExpensive variable should be 99 as well
    }

    // this is the most detailed analysis that i've done
    // i hope in anyway makatulong!

}
