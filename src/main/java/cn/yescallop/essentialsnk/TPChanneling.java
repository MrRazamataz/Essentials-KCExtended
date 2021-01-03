package cn.yescallop.essentialsnk.TPChanneling;

import java.util.Timer;
import java.util.TimerTask;
import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageByEntityEvent;
import cn.nukkit.event.entity.EntityDamageEvent;

public class TPChanneling {

    Timer timer;

    public boolean TPChanneling() {
        EntityDamageByEntityEvent ev;
        Entity entity = event.getEntity();
        timer = new Timer();
        timer.schedule(new executeCommand(),0,7000);

        if (EventListener.onEntityDamage == false){
            timer.cancel();
            return false;
        }
    }
}

//Event listener, always listening for Entity Damage Event.
public class EventListener implements Listener{
    @EventListener
    public boolean onEntityDamage(EntityDamageEvent event){
        return true;
    }
}

public class executeCommand extends TimerTask {
    public boolean executeCommand() {
        return true;
    }
}

//import cn.nukkit.event.EventHandler;
//import cn.nukkit.event.EventPriority;
//import cn.nukkit.event.Listener;
//import cn.nukkit.event.server.ServerCommandEvent;
//
///**
// * author: MagicDroidX
// * NukkitExamplePlugin Project
// */
//public class EventListener implements Listener {
//    MainClass plugin;
//
//    public EventListener(MainClass plugin) {
//        this.plugin = plugin;
//    }
//
//    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = false) //DON'T FORGET THE ANNOTATION @EventHandler
//    public void onServerCommand(ServerCommandEvent event) {
//        this.plugin.getLogger().info("ServerCommandEvent is called!");
//        //you can do more here!
//    }
//}

////Event listener, always listening for Entity Damage Event.
//public class EventListener implements Listener{
//    @EventListener
//    public boolean onEntityDamage(EntityDamageEvent event){
//        timer.cancel();
//        return false;
//    }
//}