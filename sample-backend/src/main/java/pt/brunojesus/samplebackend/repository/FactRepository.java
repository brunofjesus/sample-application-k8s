package pt.brunojesus.samplebackend.repository;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import pt.brunojesus.samplebackend.model.Fact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class FactRepository {

    private final List<String> facts;

    public FactRepository() throws IOException {

        InputStream resource = new ClassPathResource("facts.txt").getInputStream();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(resource))) {
            facts = reader.lines().collect(Collectors.toList());
        }
    }

    public Fact findById(int id) {
        return Fact.of(id, facts.get(id));
    }

    public int count() {
        return facts.size();
    }
}
