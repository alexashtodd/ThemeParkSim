public class Main {

    public static void main(String[] args) {

        ThemeParkTracker tracker = new ThemeParkTracker();

        Ride ride1 = new Ride("Thunder Mountain", 45, 8, "open");
        Ride ride2 = new Ride("Splash Falls", 20, 5, "closed");
        Ride ride3 = new Ride("Dragon Coaster", 60, 10, "open");

        tracker.addRide(ride1);
        tracker.addRide(ride2);
        tracker.addRide(ride3);

        System.out.println("All Rides:");
        tracker.printAllRides();

        System.out.println("\nSearching for Dragon Coaster:");
        System.out.println(tracker.findRideStatus("Dragon Coaster"));

        System.out.println("\nSorting rides by wait time:");
        tracker.sortByWaitTime();
        tracker.printAllRides();

        System.out.println("\nRemoving closed rides:");
        tracker.removeClosedRides();
        tracker.printAllRides();

        System.out.println("\nRide at index 1:");
        System.out.println(tracker.getRide(1));
    }
}