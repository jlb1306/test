/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.team_5_project.project;

/**
 * Represents a single slide in a slideshow.
 */
public class Slide {
    private String imagePath; // Path to the image file for this slide
    private int duration;      // Duration of the slide in some unit (e.g., seconds)
    private String transition; // Transition effect to use when moving to the next slide
    private int interval;      // Interval for automatic slide advancement (used for auto-advance)

    //Constructor to create a new Slide object.
    public Slide(String imagePath, int duration, String transition, int interval) {
        this.imagePath = imagePath; // Initialize the image path
        this.duration = duration;   // Initialize the duration
        this.transition = transition; // Initialize the transition effect
        this.interval = interval;   // Initialize the interval for automatic advancement
        
    }

  
    public String getImagePath() {
        return imagePath;
    }

    
    public int getDuration() {
        return duration;
    }

 
    public String getTransition() {
        return transition;
    }

    public int getInterval() {
        return interval;
    }

   
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

  
    public void setDuration(int duration) {
        this.duration = duration;
    }

  
    public void setTransition(String transition) {
        this.transition = transition;
    }

  
    public void setInterval(int interval) {
        this.interval = interval;
    }
}