package ChallengeEqualsHashcodes;

import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Rectangle other = (Rectangle) obj;
        return width == other.width && height == other.height;
    }
}
