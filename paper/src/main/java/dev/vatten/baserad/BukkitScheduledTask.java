package dev.vatten.baserad;

import org.bukkit.scheduler.BukkitTask;

public class BukkitScheduledTask extends ScheduledTask<BukkitTask> {
    public BukkitScheduledTask(BukkitTask task) {
        super(task);
    }

    @Override
    public void cancel() {
        if(!isCancelled()) {
            this.task.cancel();
        }
    }

    @Override
    public boolean isCancelled() {
        return task == null || task.isCancelled();
    }
}
