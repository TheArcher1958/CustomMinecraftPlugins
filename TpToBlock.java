import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class TpToBlock implements Listener {
    @EventHandler
    public void PlayerUseStick(PlayerInteractEvent e) {
        if (TpStick.getTpStickBool() == true) {
            Player p = e.getPlayer();
            Action a = e.getAction();
            if ((e.getItem().getType() == Material.STICK)) {
                Block b = p.getTargetBlock(null, 100);
                Location loc = b.getLocation();
                loc.setYaw(e.getPlayer().getLocation().getYaw());
                loc.setPitch(e.getPlayer().getLocation().getPitch());
                loc.setY(loc.getY() + 1);
                p.teleport(loc);
            }
        }
    }
}