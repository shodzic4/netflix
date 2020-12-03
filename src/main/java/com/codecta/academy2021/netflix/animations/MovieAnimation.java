package com.codecta.academy2021.netflix.animations;

import org.alcibiade.asciiart.coord.TextBoxSize;
import org.alcibiade.asciiart.image.rasterize.ShapeRasterizer;
import org.alcibiade.asciiart.raster.ExtensibleCharacterRaster;
import org.alcibiade.asciiart.raster.Raster;
import org.alcibiade.asciiart.raster.RasterContext;
import org.alcibiade.asciiart.widget.PictureWidget;
import org.alcibiade.asciiart.widget.TextWidget;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public abstract class MovieAnimation {
    private String mainCharacterName;
    private String imageFilename;
    private String movieName;
    public MovieAnimation(String movieName, String mainCharacterName, String imageFilename) {
        this.movieName = movieName;
        this.mainCharacterName=mainCharacterName;
        this.imageFilename=imageFilename;
    }
    public String getMainCharacterName(){
        return this.mainCharacterName;
    }
    public String getMovieName(){
        return this.movieName;
    }
    public String picture(){
        if(imageFilename == null) {
            return "Sorry, no picture available";
        }
        ClassLoader classLoader = MovieAnimation.class.getClassLoader();

        InputStream resourceAsStream = classLoader.getResourceAsStream(imageFilename);
        try {
            BufferedImage image = ImageIO.read(resourceAsStream);
            TextWidget widget = new PictureWidget(new TextBoxSize(80, 30),
                    image, new ShapeRasterizer());
            Raster raster = new ExtensibleCharacterRaster();

            widget.render(new RasterContext(raster));
            return raster.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return "Error in converting";
        }
    }
}
