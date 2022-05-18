package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Timer {

    private AnimalsCage animalsCage;

    public Timer() {
    }

    private final Long nanoTime = System.nanoTime();

//    @Autowired
    public Timer(AnimalsCage animalsCage) {
        this.animalsCage = animalsCage;
    }

    public Long getTime() {
        return nanoTime;
    }

    @Override
    public String toString() {
        return "Timer: " +
                "nanoTime: " + nanoTime;
    }
}
