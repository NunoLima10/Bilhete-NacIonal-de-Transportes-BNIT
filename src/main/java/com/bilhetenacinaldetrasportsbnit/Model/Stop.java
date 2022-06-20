package com.bilhetenacinaldetrasportsbnit.Model;

import java.time.LocalDate;

public class Stop {
    private final String localityName;
    private final String sense;
    private LocalDate estimatedTime;

    public Stop(String localityName, String sense, LocalDate estimatedTime) {
        this.localityName = localityName;
        this.sense = sense;
        this.estimatedTime = estimatedTime;
    }
}
