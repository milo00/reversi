package com.company;

public class Square {
    private Disk disk;

    public Square() {
        disk = null;
    }

    public Color getColor() {
        if (disk == null) {
            return Color.GREEN;
        } else {
            return disk.getColor();
        }
    }

    public boolean put(Disk disk, boolean ifChange) {
        if (this.disk == null && disk != null) {
            if (ifChange) {
                this.disk = disk;
            }
            return true;
        } else {
            return false;
        }
    }

    public Disk getDisk() {
        return disk;
    }

    @Override
    public String toString() {
        return disk == null ? " " : disk.getColorString();
    }
}
