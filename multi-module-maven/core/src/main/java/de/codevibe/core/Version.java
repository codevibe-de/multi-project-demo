package de.codevibe.core;

public class Version {

    private final int major;
    private final int minor;
    private final int patch;

    public Version(int major, int minor, int patch) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }

    @Override
    public String toString() {
        // do some nice formatting
        return String.format("v%d.%d.%d", major, minor, patch);
    }

    Version of(int major, int minor, int patch) {
        return new Version(major, minor, patch);
    }
}
