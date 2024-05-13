package com.guessTheFlag.GuessTheFlag;

import com.guessTheFlag.GuessTheFlag.models.Flag;
import com.guessTheFlag.GuessTheFlag.repos.FlagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private FlagRepository flagRepository;
    @Autowired
    public DataLoader(FlagRepository flagRepository) {
        this.flagRepository = flagRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        boolean time_to_load = false;
        if (time_to_load) {
            addFlagsForAsia();
            addFlagsForAfrica();
            addFlagsForEurope();
        }

    }
    private void addFlagsForAsia() {
        flagRepository.save(new Flag("China", "asia", "CN"));
        flagRepository.save(new Flag("India", "asia", "IN"));
        flagRepository.save(new Flag("Japan", "asia", "JP"));
        flagRepository.save(new Flag("South Korea", "asia", "KR"));
        flagRepository.save(new Flag("Indonesia", "asia", "ID"));
    }

    private void addFlagsForAfrica() {
        flagRepository.save(new Flag("Nigeria", "africa", "NG"));
        flagRepository.save(new Flag("Egypt", "africa", "EG"));
        flagRepository.save(new Flag("South Africa", "africa", "ZA"));
        flagRepository.save(new Flag("Kenya", "africa", "KE"));
        flagRepository.save(new Flag("Ethiopia", "africa", "ET"));
    }

    private void addFlagsForEurope() {
        flagRepository.save(new Flag("Germany", "europe", "DE"));
        flagRepository.save(new Flag("France", "europe", "FR"));
        flagRepository.save(new Flag("United Kingdom", "europe", "GB"));
        flagRepository.save(new Flag("Italy", "europe", "IT"));
        flagRepository.save(new Flag("Spain", "europe", "ES"));
    }
}
