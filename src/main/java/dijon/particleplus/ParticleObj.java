package dijon.particleplus;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class ParticleObj {

    Location loc;
    Player owner;
    double speed;
    int count;

    public ParticleObj(Location loc, Player owner, double speed, int count) {
        this.loc = loc;
        this.owner = owner;
        this.speed = speed;
        this.count = count;
    }

}
