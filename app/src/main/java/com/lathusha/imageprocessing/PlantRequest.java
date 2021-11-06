package com.lathusha.imageprocessing;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.File;

public class PlantRequest {
    private File file;
    private String plant;

    public PlantRequest(File file, String plant) {
        this.file = file;
        this.plant = plant;
    }

    public PlantRequest() {

    }
}
