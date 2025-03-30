public class BarkingDog {
 
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // If the hourOfDay is less than 0 or greater than 23, return false
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        // Wake up if the dog is barking before 8am or after 10pm
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(shouldWakeUp(true, 1));     // Output: true (Barking at 1 AM)
        System.out.println(shouldWakeUp(false, 2));    // Output: false (Not barking)
        System.out.println(shouldWakeUp(true, 8));     // Output: false (Barking at 8 AM)
        System.out.println(shouldWakeUp(true, -1));    // Output: false (Invalid hour)
        System.out.println(shouldWakeUp(true, 23));    // Output: true (Barking at 11 PM)
    }
}
