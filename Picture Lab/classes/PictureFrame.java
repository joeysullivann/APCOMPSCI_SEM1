import javax.swing.*;
import java.awt.*;

/**
 * Class that holds a digital picture and displays it using a JFrame
 * 
 * @author Barb Ericson 
 */
public class PictureFrame
{
  
  ////////////////// fields ////////////////////////////
  
  /** Main window used as the frame */
  JFrame frame = new JFrame();
  
  /** ImageIcon used to display the picture in the label*/
  ImageIcon imageIcon = new ImageIcon();
  
  /** Label used to display the picture */
  private JLabel label = new JLabel(imageIcon);
  
  /** Digital Picture to display */
  private DigitalPicture picture;
  
  ///////////////// constructors ////////////////////////
  
  /**
   * A constructor that takes no arguments.  This is needed
   * for subclasses of this class
   */
  public PictureFrame()
  {

    initFrame();
  }
  
  /**
   * A constructor that takes a picture to display
   * @param picture  the digital picture to display in the 
   * picture frame
   */
  public PictureFrame(DigitalPicture picture)
  {

    this.picture = picture;

    initFrame();
  }
  
  ///////////////////////// methods ///////////////////////////////
  
  /**
   * Method to set the picture to show in this picture frame
   * @param picture the new picture to use
   */
  public void setPicture(Picture picture)
  {
    this.picture = picture;
    imageIcon.setImage(picture.getImage());
    frame.pack();
    frame.repaint();
  }
  
  /**
   * A method to update the picture frame image with the image  
   * in the picture 
   */
  public void updateImage()
  {

    if (picture != null)
    {

      imageIcon.setImage(picture.getImage());

      frame.setTitle(picture.getTitle());
      
    }
  }
  
  /**
   * A method to update the picture frame image with the image in 
   * the picture and show it
   */
  public void updateImageAndShowIt()
  {

    updateImage();

    frame.setVisible(true);
  }
  
  /**
   * A method to make sure the frame is displayed
   */
  public void displayImage()
  {
    frame.setVisible(true);
  }
  
  /**
   * A method to hide the frame
   */
  public void hide()
  {
    frame.setVisible(false);
  }
  
  /**
   * A method to set the visible flag on the frame
   * @param flag the flag to use
   */
  public void setVisible(boolean flag) 
  { 
    frame.setVisible(flag);
  }
  
  /**
   * A method to close a picture frame
   */
  public void close()
  {
    frame.setVisible(false);
    frame.dispose();
  }
  
  /**
   * Method to set the title for the picture frame
   * @param title the title to use
   */
  public void setTitle(String title)
  { 
    frame.setTitle(title);
  }
  
  /**
   * Method to force the picture frame to repaint (redraw)
   */
  public void repaint()
  {

    frame.setVisible(true);
    updateImage();
    frame.repaint();
  }
  
  /**
   * A method to initialize the picture frame
   */
  private void initFrame()
  {
    updateImage();
    frame.getContentPane().add(label);
    frame.pack();
    frame.setVisible(true);
  }
  
}
