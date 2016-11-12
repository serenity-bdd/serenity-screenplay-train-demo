package serenitylabs.tutorials.trains.navigation;

public enum Section {
    BuyTickets("https://buytickets.southwesttrains.co.uk/journey"),

    BuySeasonTickets("https://buytickets.southwesttrains.co.uk/season"),

    LiveTravelUpdates("https://www.journeycheck.southwesttrains.co.uk");

    private final String url;

    Section(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
    }
