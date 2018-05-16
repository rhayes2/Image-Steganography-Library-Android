package com.ayush.steganographylibrary.Text;

import java.io.File;

public class TextStegnography {

    String message;
    String secret_key;
    File bitmap;

    public TextStegnography(String message, String secret_key, File bitmap) {
        this.message = message;
        this.secret_key = secret_key;
        this.bitmap = bitmap;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSecret_key() {
        return secret_key;
    }

    public void setSecret_key(String secret_key) {
        this.secret_key = secret_key;
    }

    public File getBitmap() {
        return bitmap;
    }

    public void setBitmap(File bitmap) {
        this.bitmap = bitmap;
    }
}