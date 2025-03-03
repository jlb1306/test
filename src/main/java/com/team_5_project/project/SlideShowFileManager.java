package com.team_5_project.project;

import java.io.File;

public class SlideShowFileManager {

    public static File getSavedSlidesFolder() {
        File savedSlidesFolder = new File(System.getProperty("user.dir"), "SavedSlideShows");
        if (!savedSlidesFolder.exists()) {
            savedSlidesFolder.mkdirs();
        }
        return savedSlidesFolder;
    }

    public static File getSlideshowDirectory(String slideshowName) {
        File slideshowDir = new File(getSavedSlidesFolder(), slideshowName);
        if (!slideshowDir.exists()) {
            slideshowDir.mkdirs();
        }
        return slideshowDir;
    }

    public static File getImagesFolder(String slideshowName) {
        File slideshowDir = getSlideshowDirectory(slideshowName); // Use getSlideshowDirectory
        File imagesFolder = new File(slideshowDir, "images");
        if (!imagesFolder.exists()) {
            imagesFolder.mkdirs();
        }
        return imagesFolder;
    }
}