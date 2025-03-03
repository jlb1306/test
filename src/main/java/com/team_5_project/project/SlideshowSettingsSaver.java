package com.team_5_project.project;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SlideshowSettingsSaver {

    public static void saveSettingsToJson(String filePath, String slideshowName, List<Slide> slides, String audioPath, boolean loop) {
        JSONObject slideshowJson = new JSONObject();

        slideshowJson.put("name", slideshowName);
        slideshowJson.put("loop", loop);

        if (audioPath != null && !audioPath.isEmpty()) {
            slideshowJson.put("audio", audioPath);
        }

        int duration = 0;
        int interval = 0;
        String transition = "fade";

        if (!slides.isEmpty()) {
            duration = slides.get(0).getDuration();
            interval = slides.get(0).getInterval();
            transition = slides.get(0).getTransition();
        }

        slideshowJson.put("duration", duration);
        slideshowJson.put("interval", interval);
        slideshowJson.put("transition", transition);

        JSONArray slidesArray = new JSONArray();
        for (Slide slide : slides) {
            slidesArray.put(slide.getImagePath());
        }
        slideshowJson.put("slides", slidesArray);

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(slideshowJson.toString(4));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}