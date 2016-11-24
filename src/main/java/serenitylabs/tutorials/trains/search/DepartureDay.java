package serenitylabs.tutorials.trains.search;

public enum DepartureDay {
    today(0), tomorrow(1);

    private final int daysFromToday;

    DepartureDay(int daysFromToday) {
        this.daysFromToday = daysFromToday;
    }

    public int daysFromToday() {
        return daysFromToday;
    }
}