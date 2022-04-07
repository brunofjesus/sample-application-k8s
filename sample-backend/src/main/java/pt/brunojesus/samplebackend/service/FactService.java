package pt.brunojesus.samplebackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.brunojesus.samplebackend.model.Fact;
import pt.brunojesus.samplebackend.repository.FactRepository;

import java.util.Random;

@Service
public class FactService {

    private final FactRepository factRepository;

    @Autowired
    public FactService(FactRepository factRepository) {
        this.factRepository = factRepository;
    }

    public Fact randomFact() {
        int count = factRepository.count();

        return factRepository.findById(
                randomNumber(0, count)
        );
    }


    /**
     * Returns a random number
     *
     * @param low  Lower boundary (inclusive)
     * @param high Higher boundary (exclusive)
     * @return A random number
     */
    private int randomNumber(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low) + low;
    }

}
