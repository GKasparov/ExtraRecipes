package me.mazenz.extrarecipes;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ShapedRecipe;

import java.util.logging.Logger;


public class ExtraRecipes extends JavaPlugin {
    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveConfig();

        Logger logger = this.getLogger();
        new UpdateChecker(this, 82622).getVersion(version -> {
            if (this.getDescription().getVersion().equalsIgnoreCase(version)) {
                logger.info("The latest version of ExtraRecipes is running (0.5)");
            } else {
                logger.info("There is a new version of Extra Recipes. https://www.spigotmc.org/resources/extrarecipes.82622/");
            }
        });
        if (getConfig().getBoolean("diamond")) {
            Bukkit.addRecipe(DiamondRecipe());
        }
        if (getConfig().getBoolean("gold")) {
            Bukkit.addRecipe(GoldRecipe());
        }
        if (getConfig().getBoolean("iron")) {
            Bukkit.addRecipe(IronRecipe());
        }
        if (getConfig().getBoolean("emerald")) {
            Bukkit.addRecipe(EmeraldRecipe());
        }
        if (getConfig().getBoolean("coal")) {
            Bukkit.addRecipe(CoalRecipe());
        }
        if (getConfig().getBoolean("saddle")) {
            Bukkit.addRecipe(SaddleRecipe());
        }
        if (getConfig().getBoolean("nametag")) {
            Bukkit.addRecipe(NametagRecipe());
        }
        if (getConfig().getBoolean("quartz")) {
            Bukkit.addRecipe(QuartzRecipe());
        }
        if (getConfig().getBoolean("web")) {
            Bukkit.addRecipe(WebRecipe());
        }
        if (getConfig().getBoolean("skull")) {
            Bukkit.addRecipe(SkullRecipe());
        }
        if (getConfig().getBoolean("tripwire")) {
            Bukkit.addRecipe(TripwireRecipe());
        }
        if (getConfig().getBoolean("portal")) {
            Bukkit.addRecipe(PortalRecipe());
        }
        if (getConfig().getBoolean("elytra")) {
            Bukkit.addRecipe(ElytraRecipe());
        }
        if (getConfig().getBoolean("enderpearl")) {
            Bukkit.addRecipe(EnderRecipe());
        }
        if (getConfig().getBoolean("barrier")) {
            Bukkit.addRecipe(BarrierRecipe());
        }
        if (getConfig().getBoolean("cactus")) {
            Bukkit.addRecipe(CactusRecipe());
        }
        if (getConfig().getBoolean("netherrack")) {
            Bukkit.addRecipe(NetherrackRecipe());
        }
        if (getConfig().getBoolean("netherstar")) {
            Bukkit.addRecipe(NetherstarRecipe());
        }
    }

    @Override
    public void onDisable() {

    }

    public ShapedRecipe DiamondRecipe() {
        ItemStack item1 = new ItemStack(Material.DIAMOND_ORE);

        NamespacedKey key = new NamespacedKey(this, "diamond_ore_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item1);

        recipe.shape("SDS", "DSD", "SDS");

        recipe.setIngredient('S', Material.STONE);
        recipe.setIngredient('D', Material.DIAMOND);

        return recipe;
    }

    public ShapedRecipe IronRecipe() {
        ItemStack item2 = new ItemStack(Material.IRON_ORE);

        NamespacedKey key = new NamespacedKey(this, "iron_ore_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item2);

        recipe.shape("SIS", "ISI", "SIS");

        recipe.setIngredient('S', Material.STONE);
        recipe.setIngredient('I', Material.IRON_INGOT);

        return recipe;
    }

    public ShapedRecipe GoldRecipe() {
        ItemStack item3 = new ItemStack(Material.GOLD_ORE);

        NamespacedKey key = new NamespacedKey(this, "gold_ore_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item3);

        recipe.shape("SGS", "GSG", "SGS");

        recipe.setIngredient('S', Material.STONE);
        recipe.setIngredient('G', Material.GOLD_INGOT);

        return recipe;
    }

    public ShapedRecipe EmeraldRecipe() {
        ItemStack item4 = new ItemStack(Material.EMERALD_ORE);

        NamespacedKey key = new NamespacedKey(this, "emerald_ore_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item4);

        recipe.shape("SES", "ESE", "SES");

        recipe.setIngredient('S', Material.STONE);
        recipe.setIngredient('E', Material.EMERALD);

        return recipe;
    }

    public ShapedRecipe CoalRecipe() {
        ItemStack item5 = new ItemStack(Material.COAL_ORE);


        NamespacedKey key = new NamespacedKey(this, "coal_ore_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item5);

        recipe.shape("SCS", "CSC", "SCS");

        recipe.setIngredient('S', Material.STONE);
        recipe.setIngredient('C', Material.COAL);

        return recipe;
    }

    public ShapedRecipe SaddleRecipe() {
        ItemStack item6 = new ItemStack(Material.SADDLE);


        NamespacedKey key = new NamespacedKey(this, "saddle_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item6);

        recipe.shape(
                " I ",
                "LLL",
                "LLL");

        recipe.setIngredient('L', Material.LEATHER);
        recipe.setIngredient('I', Material.IRON_INGOT);

        return recipe;
    }

    public ShapedRecipe NametagRecipe() {
        ItemStack item7 = new ItemStack(Material.NAME_TAG);


        NamespacedKey key = new NamespacedKey(this, "nametag_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item7);

        recipe.shape(
                "  I",
                "PPP",
                "  I");

        recipe.setIngredient('P', Material.PAPER);
        recipe.setIngredient('I', Material.IRON_INGOT);

        return recipe;
    }

    public ShapedRecipe QuartzRecipe() {
        ItemStack item8 = new ItemStack(Material.QUARTZ_ORE);


        NamespacedKey key = new NamespacedKey(this, "quartzore_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item8);

        recipe.shape(
                "NQN",
                "NNN",
                "NQN");

        recipe.setIngredient('Q', Material.QUARTZ);
        recipe.setIngredient('N', Material.NETHERRACK);

        return recipe;
    }

    public ShapedRecipe WebRecipe() {
        ItemStack item9 = new ItemStack(Material.WEB);


        NamespacedKey key = new NamespacedKey(this, "web_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item9);

        recipe.shape(
                " S ",
                "S S",
                " S ");

        recipe.setIngredient('S', Material.STRING);

        return recipe;
    }

    public ShapedRecipe SkullRecipe() {
        ItemStack item10 = new ItemStack(Material.SKULL_ITEM);


        NamespacedKey key = new NamespacedKey(this, "skull_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item10);

        recipe.shape(
                "BBB",
                "B B",
                " B ");

        recipe.setIngredient('B', Material.BONE);

        return recipe;
    }

    public ShapedRecipe TripwireRecipe() {
        ItemStack item11 = new ItemStack(Material.TRIPWIRE_HOOK);

        NamespacedKey key = new NamespacedKey(this, "tripwire_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item11);

        recipe.shape(
                " I ",
                " S ",
                " W ");

        recipe.setIngredient('W', Material.WOOD);
        recipe.setIngredient('S', Material.COBBLESTONE);
        recipe.setIngredient('I', Material.IRON_INGOT);

        return recipe;
    }

    public ShapedRecipe PortalRecipe() {
        ItemStack item12 = new ItemStack(Material.PORTAL);

        NamespacedKey key = new NamespacedKey(this, "portal_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item12);

        recipe.shape(
                " O ",
                "OSO",
                " O ");

        recipe.setIngredient('O', Material.OBSIDIAN);
        recipe.setIngredient('S', Material.FLINT_AND_STEEL);

        return recipe;
    }

    public ShapedRecipe ElytraRecipe() {
        ItemStack item13 = new ItemStack(Material.ELYTRA);

        NamespacedKey key = new NamespacedKey(this, "elytra_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item13);

        recipe.shape(
                " F ",
                "FDF",
                " F ");

        recipe.setIngredient('D', Material.DIAMOND_BLOCK);
        recipe.setIngredient('F', Material.FEATHER);

        return recipe;
    }
    public ShapedRecipe EnderRecipe() {
        ItemStack item14 = new ItemStack(Material.ENDER_PEARL);

        NamespacedKey key = new NamespacedKey(this, "ender_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item14);

        recipe.shape(
                "GGG",
                "GOG",
                "GGG");

        recipe.setIngredient('G', Material.GLASS);
        recipe.setIngredient('O', Material.OBSIDIAN);

        return recipe;
    }
    public ShapedRecipe BarrierRecipe() {
        ItemStack item15 = new ItemStack(Material.BARRIER);

        NamespacedKey key = new NamespacedKey(this, "barrier_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item15);

        recipe.shape(
                "R R",
                " R ",
                "R R");

        recipe.setIngredient('R', Material.REDSTONE_BLOCK);

        return recipe;
    }
    public ShapedRecipe CactusRecipe() {
        ItemStack item16 = new ItemStack(Material.CACTUS);

        NamespacedKey key = new NamespacedKey(this, "green_dye_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item16);

        recipe.shape(
                     "SGS",
                     "SGS",
                     "SGS");

        recipe.setIngredient('S', Material.STICK);
        recipe.setIngredient('G', Material.INK_SACK, (byte) 2);

        return recipe;
    }
    public ShapedRecipe NetherrackRecipe() {
        ItemStack item17 = new ItemStack(Material.NETHERRACK);

        NamespacedKey key = new NamespacedKey(this, "netherrack_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item17);

        recipe.shape(
                "CNC",
                "NCN",
                "CNC");

        recipe.setIngredient('C', Material.NETHER_STALK);
        recipe.setIngredient('N', Material.NETHER_BRICK_ITEM);

        return recipe;
    }
    public ShapedRecipe NetherstarRecipe() {
        ItemStack item18 = new ItemStack(Material.NETHER_STAR);

        NamespacedKey key = new NamespacedKey(this, "netherstar_recipe");

        ShapedRecipe recipe = new ShapedRecipe(key, item18);

        recipe.shape(
                " Q ",
                "QBQ",
                " Q ");

        recipe.setIngredient('B', Material.BEACON);
        recipe.setIngredient('Q', Material.QUARTZ);

        return recipe;
    }
}
