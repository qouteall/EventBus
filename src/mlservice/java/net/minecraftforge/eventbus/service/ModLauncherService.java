package net.minecraftforge.eventbus.service;

import cpw.mods.modlauncher.serviceapi.ILaunchPluginService;
import net.minecraftforge.eventbus.EventBusEngine;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;

import java.nio.file.Path;

public class ModLauncherService implements ILaunchPluginService {
    @Override
    public String name() {
        return "eventbus";
    }

    @Override
    public void addResource(final Path resource, final String name) {

    }

    @Override
    public ClassNode processClass(final ClassNode classNode, final Type classType) {
        return EventBusEngine.INSTANCE.processClass(classNode, classType);
    }

    @Override
    public Void getExtension() {
        return null;
    }

    @Override
    public boolean handlesClass(final Type classType) {
        return EventBusEngine.INSTANCE.handlesClass(classType);
    }
}