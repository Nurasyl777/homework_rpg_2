package com.narxoz.rpg.factory;

import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;

import java.util.List;

public class IceComponentFactory implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        return List.of(
                new IceAbility("Frost Nova", 100),
                new IceAbility("Blizzard", 180)
        );
    }

    @Override
    public LootTable createLootTable() {
        return new IceLootTable();
    }

    @Override
    public String createAIBehavior() {
        return "Defensive Ice AI";
    }
}