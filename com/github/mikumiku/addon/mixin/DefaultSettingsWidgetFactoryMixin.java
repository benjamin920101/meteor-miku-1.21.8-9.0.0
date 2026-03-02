/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  meteordevelopment.meteorclient.gui.DefaultSettingsWidgetFactory
 *  meteordevelopment.meteorclient.gui.GuiTheme
 *  meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.github.mikumiku.addon.mixin;

import com.github.mikumiku.addon.mixinface.MySettings;
import meteordevelopment.meteorclient.gui.DefaultSettingsWidgetFactory;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.utils.SettingsWidgetFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={DefaultSettingsWidgetFactory.class})
public abstract class DefaultSettingsWidgetFactoryMixin
extends SettingsWidgetFactory {
    public DefaultSettingsWidgetFactoryMixin(GuiTheme theme) {
        super(theme);
    }

    @Inject(method={"<init>(Lmeteordevelopment/meteorclient/gui/GuiTheme;)V"}, at={@At(value="TAIL")}, remap=false)
    private void onInit(GuiTheme theme, CallbackInfo ci) {
        new MySettings(this.factories, this.theme).addSettings();
    }
}

