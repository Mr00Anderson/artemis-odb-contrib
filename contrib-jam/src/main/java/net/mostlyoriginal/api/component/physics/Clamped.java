package net.mostlyoriginal.api.component.physics;

import com.artemis.Component;

import java.io.Serializable;

/**
 * Clamp entity to rectangle.
 * 
 * @author Daan van Yperen
 * @see net.mostlyoriginal.api.system.physics.ClampedSystem
 */
public class Clamped extends Component implements Serializable {
    
    public float minx;
    public float miny;
    public float maxx;
    public float maxy;

    public Clamped(float minx, float miny, float maxx, float maxy) {
        this.minx = minx;
        this.miny = miny;
        this.maxx = maxx;
        this.maxy = maxy;
    }

    public Clamped() {
    }
}
