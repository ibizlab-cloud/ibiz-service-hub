package net.ibizsys.central.plugin.test.util;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

import net.ibizsys.runtime.util.SystemRuntimeHolder;

public class SystemRTInjector implements TestInstancePostProcessor {

    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
    	SystemRuntimeHolder.peekMust().autowareObject(testInstance);
    }

    
}