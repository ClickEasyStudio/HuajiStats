package top.cestudio.huajistats;

import org.bukkit.plugin.java.JavaPlugin;

public final class HuajiStats extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info("滑稽统计已经运行！");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        this.getLogger().info("滑稽统计已经停止！");
        this.getLogger().info("感谢您的使用！");
        // Plugin shutdown logic
    }
}
