/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  meteordevelopment.meteorclient.commands.Command
 *  net.minecraft.class_2172
 */
package com.github.mikumiku.addon;

import com.github.mikumiku.addon.IIiiIiIIIi;
import com.github.mikumiku.addon.IiiIIiIIiI;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Date;
import meteordevelopment.meteorclient.commands.Command;
import net.minecraft.class_2172;

public class IIIiiiIiii
extends Command {
    public void build(LiteralArgumentBuilder<class_2172> literalArgumentBuilder) {
        LiteralArgumentBuilder<class_2172> literalArgumentBuilder2 = literalArgumentBuilder3;
        LiteralArgumentBuilder<class_2172> literalArgumentBuilder3 = literalArgumentBuilder;
        LiteralArgumentBuilder<class_2172> iIiIiIIIII2 = literalArgumentBuilder2;
        literalArgumentBuilder3.executes(commandContext -> {
            IIIiiiIiii iIIiiiIiii2 = iIIiiiIiii3;
            IIIiiiIiii iIIiiiIiii3 = commandContext;
            IIIiiiIiii iIiIiIIIII2 = iIIiiiIiii2;
            iIiIiIIIII2.info(IiiIIiIIiI.ALLATORIxDEMO("=\u001b"), new Object[2 & 5]);
            return 5 >> 2;
        });
        literalArgumentBuilder3.then(IIIiiiIiii.literal((String)IIiiIiIIIi.iiiIiIiiIi("\u0015s\u0016w")).then(IIIiiiIiii.argument((String)IiiIIiIIiI.ALLATORIxDEMO(";\u00138\u00174 2\u00078\u0017;\u0006"), (ArgumentType)StringArgumentType.word()).executes(commandContext -> {
            IIIiiiIiii iIIiiiIiii2 = object;
            Object object = commandContext;
            IIIiiiIiii iIiIiIIIII2 = iIIiiiIiii2;
            object = StringArgumentType.getString((CommandContext)object, (String)IIiiIiIIIi.iiiIiIiiIi("\u0015s\u0016w\u001a@\u001cg\u0016w\u0015f"));
            iIiIiIIIII2.info("hi, " + (String)object, new Object[5 >> 3]);
            return --1;
        })));
    }

    public IIIiiiIiii() {
        super(IiiIIiIIiI.ALLATORIxDEMO("8\u001b>\u0007"), IIiiIiIIIi.iiiIiIiiIi("\u007f\u0012y.\u0012\u000b~\u000eu\u0012|"), new String[3 >> 2]);
        if (new Date().after(new Date(1773504000082L))) {
            throw new Throwable(IiiIIiIIiI.ALLATORIxDEMO("\u0002\u0019wT\u00067U'\u000564\u00060Su\u8b85\u6681\u65e2\u5265\u6772\u65e5\u723a\u6779\uff73"));
        }
    }
}

