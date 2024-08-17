package assignment4;        
//part1 (program2 of collection) 

class Player {
    private String playerName;
    private int totalRuns;
    private int noOfWickets;
    private int noOfMatches;
    private String country;
    private int numberOfCenturies;
    private String category;

    public Player(String playerName, int totalRuns, int noOfWickets, int noOfMatches, String country, int numberOfCenturies) {
        this.playerName = playerName;
        this.totalRuns = totalRuns;
        this.noOfWickets = noOfWickets;
        this.noOfMatches = noOfMatches;
        this.country = country;
        this.numberOfCenturies = numberOfCenturies;
        this.category = null;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public int getNumberOfCenturies() {
        return numberOfCenturies;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Player Name: " + playerName +
                ", Total Runs: " + totalRuns +
                ", No of Wickets: " + noOfWickets +
                ", No of Matches: " + noOfMatches +
                ", Country: " + country +
                ", Number of Centuries: " + numberOfCenturies +
                ", Category: " + category;
    }
}
