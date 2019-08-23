import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class TpStick extends JavaPlugin {
    public static boolean tpStickTp = false;
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("toggleTp")) {
            tpStickTp = !(tpStickTp);
            Player p = (Player)sender;
            if(tpStickTp == true) {
                p.sendMessage("TpStick toggled on");
            } else {
                p.sendMessage("TpStick toggled off");
            }
            return true;
        }
        return false;
    }
    public static boolean getTpStickBool(){
        return tpStickTp;
    }
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TpToBlock(), this);
    }
    @Override
    public void onDisable(){
    }
}