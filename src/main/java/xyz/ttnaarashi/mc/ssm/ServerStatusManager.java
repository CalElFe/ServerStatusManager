package xyz.ttnaarashi.mc.ssm;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "serverstatusmonitor",
        name = "Server Status Monitor",
        version = "0.0.1",
        dependencies = {},
        description = "Automatically send server info to defined detintion",
        url = "https://blog.ttnaarashi.xyz",
        authors = {
                "SomioNaArashi"
        })
public class ServerStatusManager{
    @Inject
    private Logger logger;

    private static ServerStatusManager instance;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {

    }
}