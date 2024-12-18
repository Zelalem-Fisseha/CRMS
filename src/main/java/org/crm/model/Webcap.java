package org.crm.model;
import com.github.sarxos.webcam.Webcam;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.io.IOException;
public class Webcap {

    public static BufferedImage getWebcap(){
        Webcam webcam = Webcam.getDefault();

        if(webcam != null){
            webcam.open();
            System.out.println("Webcam opened.");

            BufferedImage image= Webcam.getDefault().getImage();
            webcam.close();
            System.out.println("Image captured.");

            try {
                ImageIO.write(image,"PNG",new File("captured image.png"));
            }catch (IOException e){
                e.printStackTrace();
            }
            return image;

        }
        else {
            System.out.println("Webcam not detected.");
            return null;
        }


    }
}
