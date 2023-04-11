package org.basics2.of.oop.task1;

import java.util.Objects;

public class TextFile extends File{
    private String text;

    public TextFile(String name) {
        super(name);
    }

    public TextFile(String name, String text) {
        super(name);
        this.text = text;
    }

    public void addText(String str) {
        this.text += "" + str;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(text);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        TextFile other = (TextFile) obj;
        return Objects.equals(text, other.text);
    }

    @Override
    public String toString() {
        return "TextFile [text=" + text + "]";
    }
}
