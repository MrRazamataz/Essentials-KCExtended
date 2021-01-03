import java.util.Timer;
import java.util.TimerTask;
import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.event.EventHandler;
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
        }
    }

public class boolean onEntityDamage(EntityDamageEvent event){
        timer.cancel();
        return false;
}

public class executeCommand extends TimerTask{
    public boolean executeCommand() {
        return true;
    }
}

//public class CountDown {
//
//    Timer timer;
//
//    public CountDown() {
//        timer = new Timer();
//        timer.schedule(new DisplayCountdown(), 0, 1000);
//    }
//
//    class DisplayCountdown extends TimerTask {
//        int seconds = 60;
//    }
//
//    public static void main(String args[]) {
//        System.out.println("Countdown Beginning"); new CountDown();
//    }
//}


//@EventHandler
//public void onEntityDamage(EntityDamageEvent event) {
//    EntityDamageByEntityEvent ev;
//    Entity entity = event.getEntity();
//    if(event instanceof EntityDamageByEntityEvent && (ev = (EntityDamageByEntityEvent)event).getDamager() instanceof Player && entity instanceof Player) {
//        Player player = (Player) entity;
//        Player damager = (Player) ev.getDamager();
//        for(Player pl : new Player[]{player, damager}) {
//            this.getPlugin().setCombat(pl);
//        }
//    }
//}
