package headfirst_design_pattern.proxy.virtualproxy;

import javax.swing.*;
import javax.swing.Icon;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retreivalThread;
    boolean retrieving =false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon !=null) {
            imageIcon.paintIcon(c,g,x,y);
        }else {
            g.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려 주세요 " , x+300,y+190);
            if(!retrieving){
                retrieving = true;

                retreivalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            setImageIcon(new ImageIcon(imageURL , "Album Cover"));
                        }catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retreivalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        }
        return 800;
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        }
        return 600;
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }
}
