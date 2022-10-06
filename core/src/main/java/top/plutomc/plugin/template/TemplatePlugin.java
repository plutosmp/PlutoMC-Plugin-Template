package top.plutomc.plugin.template;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.Website;
import org.bukkit.plugin.java.annotation.plugin.author.Author;
import org.bukkit.plugin.java.annotation.plugin.author.Authors;

@Plugin(name = "${name}", version = "${version}") // Don't modify this! Please modify the variables in gradle.properties file!
@ApiVersion(ApiVersion.Target.v1_19)
@Authors({
        @Author("PlutoMC"),
        @Author("DeeChael")
})
@Website("${website}")
@Description("${description}")
public final class TemplatePlugin extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    public static TemplatePlugin getInstance() {
        return getPlugin(TemplatePlugin.class);
    }

}
