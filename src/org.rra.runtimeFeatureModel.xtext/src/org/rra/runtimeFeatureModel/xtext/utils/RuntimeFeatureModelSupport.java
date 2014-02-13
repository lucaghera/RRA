package org.rra.runtimeFeatureModel.xtext.utils;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class RuntimeFeatureModelSupport extends AbstractGenericResourceSupport {
 
    @Override
    protected Module createGuiceModule() {
        return new RuntimeFeatureModelRuntimeModule();
    }
 
}