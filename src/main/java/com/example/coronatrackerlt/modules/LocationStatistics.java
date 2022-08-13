package com.example.coronatrackerlt.modules;

public class LocationStatistics {
    private String state;
    private String country;
    private int totalCases;
    private int firstCases;

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }

    public void setFirstCases(int firstCases) {
        this.firstCases = firstCases;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "LocationStatistics{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestCases=" + (totalCases - firstCases) +
                ", totalCases=" + totalCases +
                '}';
    }

}
