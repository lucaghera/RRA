package org.rra.cdmmodel.xtext.utils;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class CDMModelSupport extends AbstractGenericResourceSupport {
 
    @Override
    protected Module createGuiceModule() {
        return new CDMModelRuntimeModule();
    }
 
}