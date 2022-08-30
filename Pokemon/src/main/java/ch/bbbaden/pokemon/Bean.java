/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.bbbaden.pokemon;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author ahmad
 */
@SessionScoped
@Named(value = "bean")
public class Bean implements Serializable {

    private String image = "";
    private String url = "";
    private String eyes = "";
    private String hair = "";
    private String selections = "Deine Auswahl: ";

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getURL() {
        url = "resources/PBilder/" + hair + eyes + image + ".png";
        return url;
    }

    public void setURL(String url) {
        this.url = url;
    }

    public String getEyecolor() {
        return eyes;
    }

    public void setEyecolor(String eyes) {
        this.eyes = eyes;
    }

    public String getHaircolor() {
        return hair;
    }

    public void setHaircolor(String hair) {
        this.hair = hair;
    }

    public String getSelection() {
        if ("h".equals(image)) {
            selections += "white skin, ";
        } else if ("d".equals(image)){
            selections += "black skin, ";
        }

        if ("g".equals(eyes)) {
            selections += "grüne Augen, ";
        } else if ("b".equals(eyes)) {
            selections += "blaue Augen, ";
        }

        if ("s".equals(hair)) {
            selections += "black hair";
        } else if ("b".equals(hair)) {
            selections += "blond hair";
        }
        
        return selections;
    }

    public void setSelection(String selections) {
        this.selections = selections;
    }
}
