package com.ninni.etcetera.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.ninni.etcetera.Etcetera.*;

@SuppressWarnings("unused")
public interface EtceteraSoundEvents {

    SoundEvent BLOCK_NETHER_BISMUTH_ORE_BREAK = nether_bismuth_ore("break");
    SoundEvent BLOCK_NETHER_BISMUTH_ORE_STEP  = nether_bismuth_ore("step");
    SoundEvent BLOCK_NETHER_BISMUTH_ORE_PLACE = nether_bismuth_ore("place");
    SoundEvent BLOCK_NETHER_BISMUTH_ORE_HIT   = nether_bismuth_ore("hit");
    SoundEvent BLOCK_NETHER_BISMUTH_ORE_FALL  = nether_bismuth_ore("fall");
    private static SoundEvent nether_bismuth_ore(String type) { return createBlockSound("nether_bismuth_ore", type); }

    SoundEvent BLOCK_BISMUTH_BLOCK_BREAK = bismuth_block("break");
    SoundEvent BLOCK_BISMUTH_BLOCK_STEP  = bismuth_block("step");
    SoundEvent BLOCK_BISMUTH_BLOCK_PLACE = bismuth_block("place");
    SoundEvent BLOCK_BISMUTH_BLOCK_HIT   = bismuth_block("hit");
    SoundEvent BLOCK_BISMUTH_BLOCK_FALL  = bismuth_block("fall");
    private static SoundEvent bismuth_block(String type) { return createBlockSound("bismuth_block", type); }

    SoundEvent ITEM_SEXTANT_SUCCESS  = sextant("success");
    SoundEvent ITEM_SEXTANT_FAIL     = sextant("fail");
    private static SoundEvent sextant(String type) { return createItemSound("sextant", type); }

    SoundEvent ITEM_MAGNIFYING_GLASS_USE  = magnifying_glass("use");
    private static SoundEvent magnifying_glass(String type) { return createItemSound("magnifying_glass", type); }

    SoundEvent BLOCK_SQUID_LAMP_BREAK = squid_lamp("break");
    SoundEvent BLOCK_SQUID_LAMP_STEP  = squid_lamp("step");
    SoundEvent BLOCK_SQUID_LAMP_PLACE = squid_lamp("place");
    SoundEvent BLOCK_SQUID_LAMP_HIT   = squid_lamp("hit");
    SoundEvent BLOCK_SQUID_LAMP_FALL  = squid_lamp("fall");
    private static SoundEvent squid_lamp(String type) { return createBlockSound("squid_lamp", type); }

    SoundEvent BLOCK_TERRACOTTA_VASE_BREAK = terracotta_vase("break");
    private static SoundEvent terracotta_vase(String type) { return createBlockSound("terracotta_vase", type); }


    SoundEvent BLOCK_CRUMBLING_STONE_CRUMBLE = crumbling_stone("crumble");
    private static SoundEvent crumbling_stone(String type) { return createBlockSound("crumbling_stone", type); }

    private static SoundEvent register(String id) {
        Identifier identifier = new Identifier(MOD_ID, id);
        return Registry.register(Registry.SOUND_EVENT, identifier, new SoundEvent(identifier));
    }

    private static SoundEvent createBlockSound(String block, String type) { return register("block." + block + "." + type); }
    private static SoundEvent createItemSound(String item, String type) { return register("item." + item + "." + type); }
}
