package org.crm.model;
import java.awt.image.BufferedImage;
import com.google.zxing.*;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.maxicode.MaxiCodeReader;

public class Qrcodedecoder {

    public static String decode(BufferedImage image) {
        try {
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

            MultiFormatReader reader = new MultiFormatReader();
            Result result = reader.decode(bitmap);
            return result.getText();
        } catch (NotFoundException e) {
            System.out.println("Image not found");
            return null;
        }
    }
}
