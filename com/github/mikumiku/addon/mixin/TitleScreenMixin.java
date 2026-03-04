/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.mikumiku.addon.auth.AuthState
 *  com.github.mikumiku.addon.auth.LoginScreen
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.TitleScreen
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.auth.AuthState;
import com.github.mikumiku.addon.auth.LoginScreen;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_442.class})
public class TitleScreenMixin {
    @Inject(method={"method_25426()V"}, at={@At(value="HEAD")}, cancellable=true)
    private void redirectToLogin(CallbackInfo ci) {
        if (!AuthState.isLoggedIn()) {
            class_310.method_1551().method_1507((class_437)new LoginScreen());
            ci.cancel();
        }
    }
}

