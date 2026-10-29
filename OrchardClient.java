package dev.example.orchard;

import net.fabricmc.api.ClientModInitializer;

public final class OrchardClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("[Orchard 26.2 Port] Client starter loaded.");
    }
}
