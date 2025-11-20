package dev.vatten.baserad;

import com.velocitypowered.api.scheduler.TaskStatus;

public class VelocityScheduledTask extends ScheduledTask<com.velocitypowered.api.scheduler.ScheduledTask> {
    public VelocityScheduledTask(com.velocitypowered.api.scheduler.ScheduledTask task) {
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
        return task == null || task.status() == TaskStatus.CANCELLED;
    }
}
